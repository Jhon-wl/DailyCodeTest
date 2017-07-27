package TestDay03;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Mr.w on 2017/7/27.
 */
public class TestDom4j {
    @Test
    //获取xml文件的全部标签
    public void test() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/main/java/TestDay03/testxml.xml"));
        Element root = document.getRootElement();
        list(root);
    }

    public void list(Element e){
        System.out.println(e.getName());
        List<Element> list = e.elements();
        for(Element element :list){
            list(element);
        }

    }
    @Test
    //获取指定标签的内容
    public void test1() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/main/java/TestDay03/testxml.xml"));
        String str = document.getRootElement().element("书").element("书名").getText();
        System.out.println(str);
    }
    @Test
    //获取指定标签的类型
    public void test2()throws Exception{
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/main/java/TestDay03/testxml.xml"));
        Element element = document.getRootElement().element("书").element("书名");
        System.out.println(element.attributeValue("type"));
    }
    @Test
    //往书的里面添加一个售价标签
    public void test3() throws DocumentException, IOException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/main/java/TestDay03/testxml.xml"));
        //1.创建一个节点
        Element element = DocumentHelper.createElement("售价");
        element.setText("38元");

        //2.把节点挂到书下面
        document.getRootElement().element("书").add(element);
        //3.把更新的内容写回xml
       /*用FileWriter写文件可能会造成乱码现象
       XMLWriter writer = new XMLWriter(new FileWriter("src/main/java/TestDay03/testxml.xml"));
        writer.write(document);
        writer.close();*/
       //建议创建一个格式化输入器
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(new FileOutputStream("src/main/java/TestDay03/testxml.xml"),format);
        writer.write(document);
        writer.close();
    }

    @Test
    public void test4() throws DocumentException, IOException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/main/java/TestDay03/testxml.xml"));

        document.getRootElement().element("书").addElement("售价").setText("189");

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(new FileOutputStream("src/main/java/TestDay03/testxml.xml"),format);
        writer.write(document);
        writer.close();
    }
}
