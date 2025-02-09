/**
 * 
 * There is an error in the code below...please fix the error so that the 
 * program will compile and run correctly!
 * 
 * You will know you fixed the problem when the program prints the following:
 * "Program has completed successfully!
 * 
 * 
 * (hint: "Ctrl + c" in the terminal window will kill the program
 * if you accidentally run it and get stuck in the "infinite loop")
 */

public class assignment_2 {

    public static void main(String[] args) {
                                      //The problem was that the number kept getting subtracted from, so the number never became higher than 10 to stop the loop.
        for(int i = 0; i < 10; i++) { //The solution is to make the variable have a number added to it each time rather than subtracted by using ++ instead of --.
            System.out.println("The value if i is: " + i); //It will count to 9, then show the completion message.
        }

        System.out.println("Program has completed successfully!");
    }
    
}
