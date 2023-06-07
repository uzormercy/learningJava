package Enum;
public class EnumType {


    // public static final int DOG = 0;
    // public static final int CAT = 1;
    // public static final int MOUSE = 2;
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

         // switch(animal){
        //     case DOG: 
        //         System.out.println("Dog");
        //         break;
        //     case CAT: 
        //         System.out.println("Cat");
        //         break;
        // }

        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            default:
                break;
        }
        
        System.out.println(Animal.CAT.getClass());


        System.out.println(Animal.DOG instanceof Enum);
        
        System.out.println(Animal.DOG);

        System.out.println("Enum name as a string: " +  Animal.DOG.name());

        Animal animal2 = Animal.valueOf("CAT");

        System.out.println(Animal.MOUSE.getName());

        System.out.println(animal2);

    }
}
