package SOLID.Isp;

public class App {
    
}
interface Animal {
    void eat();
    void sleep();
}
interface FlyingAnimal{
    void fly();
}

interface SwimmingAnimal{
    void swim();
}

class Dog implements Animal {
    public void eat() {
        // code for eating
    }

    public void sleep() {
        // code for sleeping
    }

}

class Duck implements Animal, FlyingAnimal, SwimmingAnimal {

    @Override
    public void swim() {
     //   code for Swimming 

    }

    @Override
    public void fly() {
        // Code for Flying
    }

    @Override
    public void eat() {
        // code for eating
    }

    @Override
    public void sleep() {
    //    code for sleeping
    }
    
}
