import java.util.Scanner;
//we should include this for the scanner file, this will allow us to input data.
public class Villaflor_Lab1 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); // I named the scanner "number" because we will input a number
        System.out.print("Enter any number: ");
        number.nextInt();
        number.close();

        int n = 5; 
        
        System.out.println("*"); // this is to print out the asterisks at the top

        // Print the upper half and the middle row
        for (int i = 1; i <= n; i++) {
            Row(i); /*here we called the method 'Row' to shorten the code. (nasa baba po AHHAHAH)
                     we'll also do it for the lower half */
        }

        // Print the lower half
        for (int i = n - 1; i >= 1; i--) {
            Row(i); 
        }

        // Print the bottom row of asterisks
        System.out.println("*");
    }

    //we will use this method instead of printing out the asterisks patterns repeatedly in the upper and lower half of the pattern.
    private static void Row(int i) {
        System.out.print("*");
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println("*");
    }
}
