package AbstractClass;

public abstract class Machine {
    
    // if the class has a common functionality then it is a good way to usse a base class
    // we could prevent a user from instantiating the parent class, because a machine does not have a specification rather it has various kinds of machines,
    // this makes it a base class in which other classes extends from, by that, we have made this class an abstract class
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Abstract classes can have abstract methods
    // you can force all your child classes to have a specific method or rather implement them 
    public abstract void start();
    public abstract void doStuff();
    public abstract void shutDown();

    public void run(){
        start();
        doStuff();
        shutDown();
    }


}