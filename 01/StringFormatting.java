public class StringFormatting {
    
    public static void main(String[] args) {
        // String formatting
        StringBuilder sb = new StringBuilder();
        sb.append("Hello i am learning java");
        sb.append(" ");
        sb.append("This is a test for appending a string").append("\n").append("Chainable strings");
        System.out.println(sb.toString());
        
        System.out.print("Here is some text. \tThat was a tab. \nThis is a new line.\n");
        System.out.printf("Total cost %-10d; quality is %d\n", 5, 120);

        for(int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s\n", i, "Hello i am learning java");
        }

        System.out.printf("Total value: %.2f\n", 5.69030);
        System.out.printf("Total value: %-6.1f\n", 329.9483);
        System.out.printf("\n");


        // /Compare strings

        String hello = "Hello";
        String hello2 = "Hello";
        System.out.println(hello.compareTo(hello2));

        // Concat string
        String firstname = "Mercy ";
        String lastname = "Uzor";
        System.out.println(firstname.concat(lastname));


        // Ends with 
        System.out.println(firstname.endsWith(" "));
        // Get the length of string
        System.out.println(firstname.length());

        // Replace string with a new character
        System.out.println(firstname.replace("rcy", "ssi"));
        
        String fullname = "Mercy Uzor Okorie";
        System.out.println(fullname.trim());
        System.out.println(fullname.toUpperCase());
        System.out.println(fullname.toLowerCase());
        
        String [] stringSplit = fullname.split(" ");
        System.out.println(stringSplit);
    }
}
