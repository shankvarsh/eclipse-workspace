package sem2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filess {
 public static void main(String[] args) {
     try {
         FileInputStream fis = new FileInputStream("C:\\Users\\Shalu13\\eclipse-workspace\\Mcajntuh\\src\\sem2\\" + args[0]);
         FileOutputStream fos=new FileOutputStream("C:\\Users\\Shalu13\\eclipse-workspace\\Mcajntuh\\src\\sem2\\" + args[1]);
         int c;
         while ((c=fis.read())!=-1){
             fos.write((char)c);
         }
         fis.close();
         fos.close();
     }
     catch (FileNotFoundException e){
         System.out.println(e);
     }
     catch (IOException e){
         System.out.println(e);
     }
 }
}

