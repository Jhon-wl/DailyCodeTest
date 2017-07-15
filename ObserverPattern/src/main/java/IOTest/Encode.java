package IOTest;

import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;

/**
 * Created by Mr.w on 2017/7/14.
 */
public class Encode {
    public static void main(String args[]) throws UnsupportedEncodingException {
        String s="王乐abc";
        byte[] bytes = s.getBytes();
        for (byte b: bytes) {
            System.out.print(Integer.toHexString(b &0xff)+" ");
        }
        System.out.println();

        //使用gbk编码格式一个汉字占两个字节  一个英文占一个字节
        byte[] bytes1 = s.getBytes("gbk");
        for(byte b:bytes1){
            System.out.print(Integer.toHexString(b &0xff)+" ");
        }
        System.out.println();
        //使用utf-8 一个汉字占三个字节 一个英文占一个字节
        byte[] bytes2 = s.getBytes("UTF-8");
            for (byte b:bytes2){
                System.out.print(Integer.toHexString(b &0xff)+" ");
            }
        System.out.println();
        //Java是双字节编码 utf-16be    中文两个字节英文也是两个字节
        byte[] bytes3 = s.getBytes("utf-16be");
            for(byte b:bytes3){
                System.out.print(Integer.toHexString(b &0xff)+" ");
            }
        /*
        * 当你的字节序列是某种编码时，这个时候想把字节序列变成字符串
        * 也要使用原来的编码方式，否则会乱码
        * */
        System.out.println();
        String s2 = new String(bytes3);
        System.out.println(s2);
        String s1 = new String(bytes3,"utf-16be");
        System.out.println(s1);

    }
}
