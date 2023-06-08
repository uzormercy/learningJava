package Composition;



class Car{

    private Engine engine;
    private Wheel[] wheels;

     Car() {
        engine = new Engine();
        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

}

class Engine {
    // Engine implementation...
}

class Wheel {
    // Wheel implementation...
}
public class App {
    
    public static void main(String[] args) {
        
    }
}


