package com.xzy.day03.socket;


import org.junit.Test;

import javax.xml.transform.Source;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

/**
 * Create by mr.wl on 2017/8/9
 */
public class UDPServer {
    @Test
    public void test1() throws IOException {
        DatagramSocket socket = new DatagramSocket(9988);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        socket.receive(packet);
        System.out.println(Arrays.toString(buffer));
    }
}
