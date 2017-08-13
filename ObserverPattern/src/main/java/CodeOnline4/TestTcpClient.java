package CodeOnline4;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Create by mr.wl on 2017/8/11
 */
public class TestTcpClient {

    public static void main(String[] args) throws IOException {
        //创建套接字对象
        Socket socket =  new Socket();
        //绑定本地端口
        socket.bind(new InetSocketAddress(10086));
        //建立socket连接,经过三次握手
        socket.connect(new InetSocketAddress("10.245.77.195",9900));

        //给服务器发送数据
        socket.getOutputStream().write("\"/UserController/regist?username=admin&password=admin123\"".getBytes());
        socket.shutdownOutput();

        byte[] buffer = new byte[1024];
        InputStream  ins = socket.getInputStream();
        int len = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while ((len=ins.read(buffer))!=-1){
            stringBuffer.append(new String(buffer,0,len));
        }
        System.out.println(stringBuffer.toString());

    }


}
