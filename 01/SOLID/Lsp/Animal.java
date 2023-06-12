package SOLID.Lsp;

public class Animal {
    public static void main(String[] args) {
        
    }
}
interface Flyable {
    void fly();
}

class Bird {
    // Common bird properties and behaviors
}

class FlyingBird extends Bird implements Flyable {
    public void fly() {
        // Code for flying
    }
}


class Sparrow extends FlyingBird {
    // code specific for sparrow
}

class Ostrich extends Bird {
   // Specific behavior and properties for an ostrich
   
}