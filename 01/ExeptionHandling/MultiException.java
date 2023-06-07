package ExeptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultiException {
    public static void main(String[] args) {
        MultipleException multipleException = new MultipleException();

        // multipleException.run could throw two exceptions, however this needs to be handled smoothly
        // we could add the throw handle to the main method which will then process a stack trace error in the thread (not so good weay to handle that)
        // we could sound it with a try catch block
        // you could have multiple catch block

        /*
        
        try {
            multipleException.run();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("This is an IOException: " + e.getMessage());
        }catch(ParseException e){
            System.out.println("This is an ParseException: " + e.getMessage());
        }
        */


        /*try {
            multipleException.run();
        } catch (IOException | ParseException e) {
            // TODO: handle exception
            System.out.println("This is an: " + e.getMessage());
        }*/

        try {
            multipleException.run();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("This is an: " + e.getMessage());
        }


        /* 
         * this is wrong because the IOException will not let the FileNotFoundException be executed because of java's way of handling exceptions,
         * The IOException is a parent of the FileNotFoundException meaning it is already handled in the IOException, (polymorphism)
         * the FileNotFoundException should be called first before the IOException 
         try {
             multipleException.input();
         } catch (IOException e) {
             // TODO: handle exception
             System.out.println("This is an: " + e.getMessage());
         }catch(FileNotFoundException e){
             System.out.println("This is an: " + e.getMessage());
         }
         This will also not work because, the IOException is also a parent of the FileNotFoundException using the pipe method won't work
         try {
             multipleException.input();
         } catch (FileNotFoundException | IOException e) {
             // TODO: handle exception
             System.out.println("This is an: " + e.getMessage());
         }

         This is correct
          try {
             multipleException.input();
         } catch (FileNotFoundException  e) {
             // TODO: handle exception
             System.out.println("This is an: " + e.getMessage());
         }catch(IOException e){
             System.out.println("This is an: " + e.getMessage());
         }
         * 
         * 
        */
    }
}
