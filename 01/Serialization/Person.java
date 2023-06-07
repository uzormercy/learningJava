package Serialization;

import java.io.Serializable;

public class Person implements Serializable{

    private int id;
    private String name;
    // we can make a value not to be serialized by using the transient serialization
    private transient String uuid; 

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
