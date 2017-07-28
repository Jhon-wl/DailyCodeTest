package TestDay03;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;

/**
 * Created by Mr.w on 2017/7/28.
 * with XPath
 */
public class TestXPath {
    @Test
    public void test1() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/main/java/TestDay03/testxml.xml"));

        Element e = (Element) document.selectSingleNode("//作者");
        System.out.println(e.getText());
    }
    @Test
    public void test2() throws DocumentException {
        String name = "ddd";
        String password = "123";
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("src/main/java/TestDay03/user.xml"));

        Node node = document.selectSingleNode
                ("//user[@username='"+ name +"' and @password='"+ password +"']");
        if(node!=null){
            System.out.println("success to login");
        }else{
            System.out.println("failed to login");
        }
    }
}
