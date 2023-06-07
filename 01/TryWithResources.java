
class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Closing...........");
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

}


public class TryWithResources {
    

    public static void main(String[] args) {
        
        // Try with resources
        try(Temp temp = new Temp()){
            
        }catch(Exception e){

        }
}

}