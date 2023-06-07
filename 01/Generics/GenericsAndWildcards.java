package Generics;
import java.util.ArrayList;


class Machine{

    @Override
    public String toString(){
        return "I am a machine";
    }

    public void start(){
        System.out.println("Machine started");
    }
}

class Camera extends Machine{

    @Override
    public String toString(){
        return "I am a camera";
    }

    public void snap(){
        System.out.println("Camera snapped");
    }
}


public class GenericsAndWildcards {
    public static void main(String[] args) {
        ArrayList<Machine> list1 = new ArrayList<Machine>();
        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list1.add(new Camera());
        list1.add(new Camera());


        showList(list2);
        // this will work because it also extends the parent class of machine
        showList2(list1);
    }


    public static void showList(ArrayList<?> list){
        for(Object value: list){
            System.out.println(value);
        }
    }

    public static void showList1(ArrayList<? extends Machine> list){
        for(Machine value: list){
            System.out.println(value);
            value.start();
        }
    }

    public static void showList2(ArrayList<? super Camera> list){
        for(Object value: list){
            System.out.println(value);
        }
    }
}
