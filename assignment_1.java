/*

Assignment 1:

Please review and run the following code as an introduction to 

Looping and conditionals in Java Programming.

*/


/**
 * Assignment 1
 * This is the standard "public class" which tells Java what to run!
 */
public class assignment_1 {

    /**
     * Main method
     * @param args the command line arguments - none in this case!
     */
    public static void main(String[] args) {

        System.out.println("---------- Starting Program ----------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }

            System.out.println("--------------------");
        }

        System.out.println("---------- Ending Program ----------");
    }
}