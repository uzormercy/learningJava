package Composition;

 class House {
    private Room livingRoom;
    private Room kitchen;
    private Room bedroom;

     House() {
        livingRoom = new Room("Living Room");
        kitchen = new Room("Kitchen");
        bedroom = new Room("Bedroom");
    }

    // Other methods and logic...
}

 class Room {
    private String name;
    private Furniture furniture;

     Room(String name) {
        this.name = name;
        furniture = new Furniture();
    }

    // Other methods and logic...
}

 class Furniture {
    // Furniture implementation...
}

public class App2 {
    public static void main(String[] args) {
        
    }
}
