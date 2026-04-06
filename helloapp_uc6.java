/**
 * HelloApp - UC6 - Display "Hello" with Multiple Command-Line Arguments using
 * substring to Remove Trailing Delimiter
 * 
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using substring to
 * Remove Trailing Delimiter - The application should accept multiple names as
 * command-line arguments and display a personalized greeting for each user using
 * substring to remove the trailing delimiter.
 * Usage: java HelloApp [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * - If no names are provided, it will display "Hello, World!"
 * 
 * @author BEDABRATA BHATTACHARJEE
 * @version 6.0
 * @since UC1
 */
public class helloapp_uc6 {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build string without extra comma
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);

            // Add comma only if it's not the last element
            if (i != args.length - 1) {
                sb.append(", ");
            }
        }

        System.out.println("Hello, " + sb.toString() + "!");
    }
}