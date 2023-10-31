package sem2;
import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class FilesA {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name");
        String name=sc.next();
        File f=new File(name);
        if(f.exists()){
            System.out.println("The file exists.");
            if(f.canRead()){
                System.out.println("The file is readable!!");
            }else{
                System.out.println("The file is not readable");
            }
            if(f.canWrite()){
                System.out.println("The file is Writable");
            }else System.out.println("The file is not Writable!!");
            System.out.println("File type: "+Files.probeContentType(f.toPath()));
            System.out.println("Length of the file : "+f.length()+"bytes");
        }else{
            System.out.println("The file dosen't exist!!");
        }
        sc.close();
    }
    
}
