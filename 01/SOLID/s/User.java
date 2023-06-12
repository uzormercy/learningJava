package SOLID.s;

public class User {

     private String name;
    private String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void sendEmail(String message) {
        // code to send an email
    }

    public void saveToDatabase() {
        // code to save user data to the database
    }

    public void displayUserInfo() {
        // code to display user information
    }
}
