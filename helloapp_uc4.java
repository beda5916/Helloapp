/**
 * HelloApp – UC4 – A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 *
 * Greet Multiple Users – The application should accept multiple names as command-line
 * arguments and display a personalized greeting for each user.
 * Usage: java HelloAppUC4 [name1] [name2] ... [nameN]
 * – If names are provided, it will display "Hello, [Name1], [Name2], ...!" to the console.
 * – If no names are provided, it will display "Hello, World!"
 *
 * @author BEDABRATA BHATTACHARJEE
 * @version 4.0
 * @since UC1
 */

// Key Concepts for HelloAppUC4:
// 1. Default Values: Providing a fallback value when no input is given
// 2. Command-line Arguments: Accessing user input via args[] parameter
// 3. Conditional Statements: Using if to check conditions
// 4. Boolean Logic: Using logical conditions to control flow
// 5. Array Length: Checking the number of command-line arguments
// 6. StringBuilder: Efficiently building a string from multiple parts
// 7. Looping Constructs: Using for loops to iterate through command-line arguments
// 8. String Concatenation: Joining multiple strings with a delimiter (comma and space)

// Code Snippet for HelloApp UC4:
// StringBuilder nameBuilder = new StringBuilder();
// for (int i = 0; i < args.length; i++) {
//     nameBuilder.append(args[i]);
//     if (i < args.length - 1) {
//         nameBuilder.append(", ");
//     }
// }
// name = nameBuilder.toString(); // Use the provided names
// }

public class helloapp_uc4 {

    public static void main(String[] args) {

        String name;

        // Check if any names were provided as command-line arguments
        if (args.length > 0) {
            // Build a comma-separated list of names
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString(); // Use the provided names
        } else {
            // Default to "World" if no names are provided
            name = "World";
        }

        // Display personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}