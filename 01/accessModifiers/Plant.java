package accessModifiers;

public class Plant {
    

    // constants    
    public static final String NAME = "Plantations";

    public String name;

    private String type;

    protected String size;

    // package level visibility / no access specifier
    int height;

    
    public Plant(){
        this.name = "Mango";
        this.type= "Tree";
        this.size = "medium";
    }


    // Side note =>>> you cant declare a class to be private and when declaring a class to be public the file must have the same name as the class

}
