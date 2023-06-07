import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingTextFiles {
    
    public static void main(String[] args)  throws FileNotFoundException{
        String filename = "/Users/mercyuzor/sample.txt";
        File textFile = new File(filename);
        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read value: " + value);
        
        int count = 2;

        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(count + ":" + line);
        }
       
        in.close();


        // Old way of reading files
        try {
            FileReader fr  = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fr);
            String line2;
            // line2 = reader.readLine();
            while((line2 = reader.readLine()) != null){
                System.out.println(line2);
            }
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Error reading: "+ e.getMessage());
        }
    }
}
