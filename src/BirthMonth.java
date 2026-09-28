import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        // Create a Scanner for keyboard input
        // Ask the user to enter their birth month
        // Check that the user entered an integer
        // Read the birth month
        // If the birth month is between 1 and 12
        //     Display the birth month
        // Otherwise
        //     Display an error message

        Scanner in = new Scanner(System.in);

        int birthMonth;

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}
