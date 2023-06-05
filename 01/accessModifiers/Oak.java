package accessModifiers;

public class Oak extends Plant {
    public Oak(){
        // this will not work because its a private property of the parent class
        // this.type = "Plant";
        
        // This will work because its protected and can be accessed by a child(subclass) of the parent class (plant)
        this.size = "Large";

    }

     
}
