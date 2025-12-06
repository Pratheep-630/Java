/*import java.io.FilenotFoundException;
import java.io.IoException;
import java.io.FileReader;
*/
import java.io.*;

public class FileHandling{
    public static void main(String[]args)throws IOException{
        FileReader reader=null;
        FileWriter writer=null;
        try{
             reader=new FileReader("cs.txt");
            
            //reading and printing file content on the screen
           // System.out.println("inside try block..");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
            System.out.println();
            reader.close();
            reader=null;
            
            writer=new FileWriter("cs.txt");
           writer.write("CS IS FIN");
           writer.flush();
        }catch(FileNotFoundException e){
            System.out.println("File not found..");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally{
            //close the reader and write
            if (reader !=null){
                reader.close();
            }  
            if (writer !=null){
                writer.close();
            }      
        }
    }
}