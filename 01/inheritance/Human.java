package inheritance;

public class Human implements interfaces {

    private String name =  "Human";

    public String gender(String gender){
        return "I am a " + gender;
    }
    
    public String skinColor(String color) {
        return "I am  " + color;
    }

    public void showInfo(){
        String gender = gender("Male");
        String skinColor = skinColor("Black");

        System.out.println(gender + " " + "and " + skinColor);

    }
}
