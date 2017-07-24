package TestDay02;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Mr.w on 2017/7/24.
 * 测试dom 对xml文件的增删改查
 */
public class TestDomCURD {
    private  Document document;
    @Test
    @Before
    public void listXml() throws  Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = factory.newDocumentBuilder();
        System.out.println(db);
        document = db.parse("src/main/java/TestDay02/testxml.xml");
        list(document);

    }

    public void list(Node node){
        System.out.println(node.getNodeName());
        NodeList list = node.getChildNodes();
        for(int i=0;i<list.getLength();i++){
            Node child = list.item(i);
            list(child);

        }
    }
    @Test
    public void test1(){
        Document document = this.document;
        Node node = document.getElementsByTagName("display-name").item(0);
        String value =node.getTextContent();
        System.out.println(value);
    }
    @Test
    public void test2(){
        Document document = this.document;
        Node node = document.getElementsByTagName("display-mame").item(0);
        /*
        * 如果node中没有想要的方法，然后看node是什么，
        * 再把它强转成相应的 标签 Element  属性Attribute 文本 test
        * */
        Element element = (Element) node;
        String name = element.getAttribute("type");
        System.out.println(name);
    }
}
