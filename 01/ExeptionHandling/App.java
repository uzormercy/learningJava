package ExeptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            FileReader  fr = new FileReader(file);
            // This will not be excuted if an exception is throw
            System.out.println("Continue...................");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            // e.printStackTrace();
            System.out.println("File not found: " + e.getMessage());
        }
        System.out.println("Finished...................");
    }
}
