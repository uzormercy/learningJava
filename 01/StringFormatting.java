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


        // TO String Method toString();

        
    }
}
