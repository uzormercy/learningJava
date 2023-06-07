package ExeptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingException {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        // You could add a throw exception to the method to handle errors or you could 
        FileReader  fr = new FileReader(file);

    }
}
