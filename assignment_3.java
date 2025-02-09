

// Please give me 5 problems to assign students utilizing the following concepts:
// 1. Loops
// 2. Conditionals



public class assignment_3 {

    /**
     * Problem 1: Write a program that prints the numbers from 1 to 100. 
     * But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
     * For numbers which are multiples of both three and five print "FizzBuzz".
     */
     public static void fizbuzz_generator() {
          //Added messages just to make it more user-friendly
         System.out.println("*Krsh* multiples of five and three are fizzed and buzzed out *krsh*");
         
         for (int i=1; i < 101; i++) { //for loop to loop through every number up to 100
         
         if (i % 3 == 0 && i % 5 == 0) { //if...else handlers to filter through each number to determine if it should be fizz or buzz
             System.out.println("FizzBuzz");
         }
         else if (i % 3 == 0) {
             System.out.println("Fizz");
         }
         else if (i % 5 == 0) {
             System.out.println("Buzz");
         }
         else {
             System.out.println(i);
         }

     }
     System.out.println("*Krsh* over *krsh*");
     }
    
     }
    
    /**
     * Problem 2: Write a program that prints the Fibonacci sequence from 0 to 50. 
     * The Fibonacci sequence is a series of numbers where a number is the sum of the two numbers before it. 
     * For example, 0, 1, 1, 2, 3, 5, 8, etc.
    */
    public static void fibonacci_sequence() {
        
        int N1=0; //defining the first few variables
        int N2=1;
        System.out.println("Next up, the Numbers in the Fibonacci sequence up to 50 are: ");
        System.out.println(N1);
        System.out.println(N2);
        
       for (int i=3; i<=10; i++) { //for loop to find the other numbers. There are ten that are less than 50, so it prints the first ten numbers.
           int N3 = N1+N2;         //I probably could have figured out how to do it differently to stop before it hit 50 rather than a fixed amount,
           System.out.println(N3); //but I liked this model better because it can easily be altered to print out a specific number of numbers.
           N1=N2;
           N2=N3;
       }
       System.out.println("Every number after this in the Fibonacci sequence is over 50, so we decided to let them retire.");

    }
    }

    /**
     * 
     * Problem 3: Write a program that gets the maximum value from  a list of three entered integers
     * @int a - first integer
     * @int b - second integer
     * @int c - third integer
     */
    public static int max_value(int a, int b, int c) {
        
        int maxi=1; //Just had this define maxi before I assigned any variables to it
        
        if (a >= b && a >= c) { //Finds out which number is the highest and assigns it to maxi
            maxi=a;
        }
        else if (b >= a && b >= c) {
            maxi=b;
        }
        else if (c >= b && c >= a) {
            maxi=c;
        }
        
        // Please replace this with the max integer //okay
        return maxi;
    }
    
    public static void main(String[] args) {

        fizbuzz_generator();

        fibonacci_sequence(); //Decided to alter the ending to make it funnier, just to go along with the feel I was going for.

        System.out.println("The max value of these three numbers that you can't see is: " + max_value(93847, 930349, 937289));

        
    }
    
}
