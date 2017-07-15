package IOTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by Mr.w on 2017/7/15.
 */
public class FileDemo {
    public static void main(String []args){
        File file = new File("C:\\Users\\Mr.w\\Desktop\\桌面\\二叉树.docx");
        System.out.println(file.exists());
        File file1 = new File("C:\\Users\\Mr.w\\Desktop\\Javaio\\io");
        if(!file1.exists()){
            file1.mkdir();
        }else{
            file1.delete();
        }
        System.out.println(file1.isDirectory());
        File file2 = new File("C:\\Users\\Mr.w\\Desktop\\Javaio\\a.txt");
        if(!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            file2.delete();
        }
    }
}
