 class Classes {
    
    public static void main(String[] args) {
        Robot sam =  new Robot();
        sam.speak("Hello i am Sam");
        String greet = Robot.greetings("Good morning");
        System.out.println(greet);
    }


}


class Robot{
    public void speak(String message) {
        System.out.println(message);
    }

// Static methods
     static String greetings(String greeting){
        return greeting;
    }
}