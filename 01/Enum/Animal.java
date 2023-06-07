package Enum;

public enum Animal {
    // CAT, DOG, MOUSE, COW;
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry"), COW("Foo");

    // you can give an enum type a constructor and a method
    /*
     * You cant do new on your enum type 
     * each of the object must be instantiated with a name CAT("Fergus")
     * A constructor can not be public it can only be private or package level
     */


     private String name;

    Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    // public void setName(String name){
    //     this.name = name;
    // }

    public String toString(){
        return "this animal is called " + name;
    }

}
