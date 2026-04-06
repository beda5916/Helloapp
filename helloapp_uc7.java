/**
 * HelloApp - UC7 - A simple Java application that greets multiple users by name
 * if provided as command-line arguments using the String.join() method, or defaults
 * to greeting "World" if no names
 * 
 * UC 7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 * or Default Message - The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user using the String.join()
 * method. If no names are provided, it should display "Hello, World!".
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the
 *   console.
 * - If no names are provided, it will display "Hello, World!"
 * 
 * @author BEDABRATA BHATTACHARJEE
 * @version 6.0
 * @since UC1
 */
public class helloapp_uc7 {
    public static void main(String[] args) {
        // Initialize names with the default value "World"
        String names = "World";
        
        // If arguments are provided, use String.join to concatenate them
        if (args.length > 0) {
            names = String.join(", ", args);
        }
        
        // Print the final formatted greeting
        System.out.println("Hello, " + names + "!");
    }
}