package ExeptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App2 {
   
    public static void main(String[] args) {
        // we have to attach a throw handler to the main method or wrap it with the try an catch block
        try {
            openFile();
            
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Could not open file" + e.getMessage());
        }
    }

    public static void openFile() throws FileNotFoundException{
        File file = new File("test.txt");
        FileReader fr =  new FileReader(file);
    }
}
