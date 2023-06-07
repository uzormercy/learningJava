package AbstractClass;

public class App {
    

    // Something use for create class hierarchy but the base class is not going to do anything it self it only 
    // act as base for other classes 
    public static void main(String[] args) {
        
        Camera camera = new Camera();
        camera.setId(5);
        Car car = new Car();
        car.setId(4);

        car.run();
        car.doStuff();
        car.shutDown();
    
        // this can not be instantiated because it is an abstract class
        // Machine machine = new Machine();
    }
}
