package ExeptionHandling;



/*
 * Two basic types of exceptions in java
 * Check exception and RuntimeException
 * Check exception are the exception that you are forced to handle
 * Thread.sleep(); this throws an exception which you have to handle
 * While a RuntimeException are exception which you are not forced to handle
 * int value = 7;
 * value = value/0;
 * this will throw a RuntimeException and will be handled automatically
 */
public class RunTimeException {

    public static void main(String[] args) {

        /* RuntimeException */ 
        // NullPointerException
        // ArrayOutOfBoundException
        String[] texts = {"one", "two", "three"};
        
        // this will throw an arrayIndexOutOfBoundExeption because this the array does not contain item up to the inputted index
        // System.out.println(texts[3]);

        // You could handle runtime exceptions with the try and catch blocks

        try {
            System.out.println(texts[3]);
        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println(e.getMessage());
        }
        
    }
    
}
