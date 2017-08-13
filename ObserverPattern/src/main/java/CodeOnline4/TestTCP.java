package CodeOnline4;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.tree.DefaultAttribute;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Create by mr.wl on 2017/8/11
 */
public class TestTCP {

    public static void main(String[] args) throws IOException, DocumentException, ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //创建套接字对象
        ServerSocket serverSocket = new ServerSocket(9900);
        while(true){

            //阻塞方法  接受客服端请求之后会释放阻塞
            Socket socket = serverSocket.accept();
            //accept如果执行完没有产生异常,则三次握手已经通过,连接已经建立
            System.out.println("有客户端登陆了");

//            byte[] bytes = new byte[1024];
//            socket.getInputStream().read(bytes);
//            socket.shutdownOutput();
//            System.out.println(Arrays.toString(bytes));
            //
            BufferedReader bufferedReader = new BufferedReader
                                (new InputStreamReader(socket.getInputStream()));
            String  data = bufferedReader.readLine();
            System.out.println(data);
            String cName = data.substring(data.indexOf("/")+1,data.lastIndexOf("/"));
            String aName = data.substring(data.lastIndexOf("/")+1,data.lastIndexOf("?"));
            String username = "admin";
            String password = "123456";
            SAXReader  saxReader = new SAXReader();
            Document document = saxReader.read(new File("sources/b.xml"));
            String xpath = "/beans/bean[@name='"+cName+"']/@class";
            DefaultAttribute defaultAttribute = (DefaultAttribute) document.selectSingleNode(xpath);

            String controllerName = defaultAttribute.getValue();
            Class clazz = Class.forName(controllerName);
            Object obj = clazz.newInstance();
            for (Method method : clazz.getMethods()){
                String result = (String) method.invoke(obj,username,password);
                System.out.println(result);
                socket.getOutputStream().write(result.getBytes());
                socket.shutdownOutput();
            }
        }




    }
}
