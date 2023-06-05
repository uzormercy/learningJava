package accessModifiers;

public class Fields {
    
    private Plant plant = new Plant();

    public Fields() {

        // Fields is in the same package or "directory" as plant
        System.out.println(plant.size);
    }
}
