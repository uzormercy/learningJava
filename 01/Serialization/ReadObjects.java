package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    
    public static void main(String[] args) {
        System.out.println("Reading objects.........");

        try( FileInputStream  fi = new FileInputStream("people.bin")){

            ObjectInputStream os =  new ObjectInputStream(fi);
            Person person1 = (Person) os.readObject();
            Person person2 = (Person) os.readObject();

            // Serializing an array of Person objects
            Person[] people = (Person[])os.readObject();

            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = ( ArrayList<Person>)os.readObject();

            for(Person person : people){
                System.out.println(person);
            }

            for(Person person : peopleList){
                System.out.println(person);
            }
            int num = os.readInt();
            for(int i = 0; i < num; i++){
                Person person = (Person) os.readObject();
                System.out.println(person);
            }
            os.close();

            System.out.println(person1);
            System.out.println(person2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
