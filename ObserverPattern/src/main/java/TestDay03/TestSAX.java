package TestDay03;

import org.junit.Test;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by Mr.w on 2017/7/27.
 * 测试SAX解析器
 */
public class TestSAX extends DefaultHandler {
    @Test
    public void test1() throws ParserConfigurationException, SAXException, IOException {
        //1.获取SAX处理器工厂
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        //2.创建解析器
        SAXParser parser = parserFactory.newSAXParser();
        //3.得到文档读取器
        XMLReader xmlReader = parser.getXMLReader();
        //为读取器设置内容处理器
        xmlReader.setContentHandler(new BookHandler());
        //5.利用读取器解析xml文档
        xmlReader.parse("src/main/java/TestDay03/testxml.xml");
    }
}

class ListHandler extends DefaultHandler {

    public void startElement(String uri, String localName, String qName, Attributes atts)
            throws SAXException {
        System.out.println("<"+qName+">");
    }
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("<"+qName+">");
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println(new String(ch,start,length));
    }
}

class BookHandler extends DefaultHandler{
    private String CurrentTag;
    private int count;
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        CurrentTag = qName;
        if("书名".equals(CurrentTag)){
            count++;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if("书名".equals(CurrentTag)&&count==1){
            System.out.println(new String(ch,start,length));
        }
    }
}