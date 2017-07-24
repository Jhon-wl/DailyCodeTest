package TestDay02;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Mr.w on 2017/7/24.
 */
public class TestDom_Sax {
    public static void main (String args[]) throws Exception {
       DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
       DocumentBuilder db = factory.newDocumentBuilder();
        System.out.println(db);

    }
}
