
class Looping{
    public static void main(String[] args){ 
        String[] fruits = {"Apples", "Oranges", "Mangoes", "Banana", "Water melon"};
        System.out.println("-------------------------------- For Looping--------------------------------");
        // For Loop
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        for(int i = 0; i < 30; i++){
            System.out.println(i);
        }

        System.out.println("-------------------------------- while Looping--------------------------------");
        // While Loop
        int a = 0;
        while (a < 15) {
            System.out.println(a);
            a++;
        }
        System.out.println("-------------------------------- Do while Looping--------------------------------");
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b <= 15);
    }
}