package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    
    public static void main(String[] args) {
        System.out.println("Writing objects...");


        Person mike =  new Person(543, "Mike");
        Person sue =  new Person(541, "Sue");

        Person[] people = { new Person(1, "James"), new Person(2, "Faith"), new Person(3, "David"), new Person(4, "Json")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));


        // System.out.println(mike);
        // System.out.println(sue);
        
        try(FileOutputStream fs =  new FileOutputStream("people.bin")){
            ObjectOutputStream os =  new ObjectOutputStream(fs);
            os.writeObject(mike);
            os.writeObject(sue);
            os.writeObject(people);
            os.writeObject(peopleList);
            os.writeInt(peopleList.size());
            for(Person person : peopleList){
                os.writeObject(person);
            }
            os.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
