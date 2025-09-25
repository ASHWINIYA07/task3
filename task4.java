import java.util.Scanner;
public class task4{


    public static void evenNumberValidator() {
        Scanner scan = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Please enter an even number: ");
            while (!scan.hasNextInt()) {
                System.out.println("That's not a valid number. Please try again.");
                scan.next(); 
                System.out.print("Please enter an even number: ");
            }
            number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println("You entered a valid even number: " + number);
                break;
            } else {
                System.out.println("That's not an even number. Please try again.");
            }
        }

        scan.close();
    }

    public static void main(String[] args) {
        evenNumberValidator();
    }
}
