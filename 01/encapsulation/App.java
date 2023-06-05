package encapsulation;

class Person{

    private String name;
    public static final int YEAR = 2023;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
     }

     public String getData() {
        return "Some stuffs " + calculateGrowthForecast();
     }

     private int calculateGrowthForecast(){
        return 9;
     }
}

public class App {
    public static void main(String[] args) {

    Person mercy = new Person();
    // Can not access name or update name directly
    mercy.setName("Mercy");
    System.out.println(mercy.getName());
    
    System.out.println(Person.YEAR);
    }
}
