/**
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For 
 * Loop or Default Message - The application should accept multiple names as 
 * command-line arguments and display a personalized greeting for each user using 
 * an enhanced for loop. If no names are provided, it should display "Hello, World!".
 * 
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the 
 * console.
 * - If no names are provided, it will display "Hello, World!"
 * 
 * @author Developer Name
 * @version 5.0
 * @since UC1
 */
public class helloapp_uc5 {

    public static void main(String[] args) {
        // Check if any command-line arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficient string construction in a loop
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced For Loop: Iterates over all elements in the args array
            for (String name : args) {
                if (!first) {
                    // Add a comma and space before every name except the first one
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Print the final concatenated greeting
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}