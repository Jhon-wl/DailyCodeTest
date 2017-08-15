package IOTest;

import org.junit.Test;

import java.io.*;

/**
 * Create by mr.wl on 2017/8/15
 */
public class FileIO {
    @Test
    public void test() throws FileNotFoundException {
        FileInputStream  fis = new FileInputStream
                (new File("C:\\Users\\Mr.w\\Desktop\\Javaio\\a.txt"));
        FileOutputStream fos = new FileOutputStream
                (new File("C:\\Users\\Mr.w\\Desktop\\Javaio\\b.txt"));
        try {

            int ch;
            while((ch = fis.read())!=-1){
                    fos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    @Test
    public void test2() throws IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\Mr.w\\Desktop\\Javaio\\b.txt"));
        InputStreamReader isr = new InputStreamReader(fis,"GBK");
        BufferedReader buffer = new BufferedReader(isr);
        String ch;
        try {
            while((ch = buffer.readLine())!=null){
                System.out.println(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            {
                fis.close();
                isr.close();
                buffer.close();
            }
        }
    }
}
