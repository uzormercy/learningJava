import accessModifiers.Plant;

public class Grass extends Plant{
    
    public Grass(){
        // Grass is not in same package as Plant even though its a subclass of Plant
        // System.out.println(this.height);
    }
}
