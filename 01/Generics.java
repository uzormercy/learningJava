import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
    

    // ArrayList =>>>>> Manages an array internally , you can add and remove things from the list, doesn't need to worry about size
    // ArrayList =>>>>> An object that can store other objects

    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");

        String products =  fruits.get(1);
        System.out.println(products);

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // inferring a list
        ArrayList<Animal> animals = new ArrayList<>();

    }

}


class Animal{

}