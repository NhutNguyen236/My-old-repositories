import java.io.*;
import java.util.*;
public class Lab01 {
    public static void readFile(String filename) throws IOException{
        try{
            String line;
            File file = new File(filename);
            FileReader fr = new FileReader(file.getAbsoluteFile());
            try (BufferedReader br = new BufferedReader(fr)) {
                while((line = br.readLine())!= null){
                    System.out.println(line);
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeFile(String filename){
        try{
            String content = "Harry Potter and Chamber of Secret";
            File file = new File(filename);
            if (file.exists()!= true){
                file.createNewFile();
                System.out.println("File is good to go man");
            }
            else{
                System.out.println("File already exists");
            }
            FileWriter fw = new FileWriter (file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(content);
            }
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
    public static void deleteFile(String filename){
        File f = new File(filename);
        if(f.delete()){
            System.out.print("OKie, deleted");
        }
        else{
            System.out.print("No, not OK");
        }
    }
    public static void main(String[] args) throws IOException {
        readFile("E:\\input.txt");
        writeFile("E:\\output.txt");
        System.out.println("do you want to remove it?");
        Scanner in = new Scanner(System.in);
        String ans = in.next();
        if("yes".equals(ans)){
            deleteFile("E:\\output.txt");
        }
        else{
            System.out.print("OK, keep it");
        }
    } 
}
