package com.xzy.day03.socket;


import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * Create by mr.wl on 2017/8/9
 */
public class TestUDP {

    @Test
    public void test1() throws IOException {
        //基于udp的
        String str = "你好啊";
        DatagramSocket socket = new DatagramSocket(8899);
        InetAddress address = InetAddress.getLocalHost();//getByName("192.168.0.180");
        DatagramPacket packet = new DatagramPacket(str.getBytes("gbk"),str.length(), address,3000);
        socket.send(packet);
        System.out.println("send seccess");



    }
}
