import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args) {
        /* By the number given from user, indicate the week's day. Using SWITCH*/
        Scanner scanner = new Scanner(System.in);

        int number;

        // INPUT
        System.out.print("Enter the number of the day: ");
        number = scanner.nextInt();
        scanner.close();
        // Seek the day by number
        switch (number) {
            case 1: System.out.println("The day " + number + " is Sunday!"); break;
            case 2: System.out.println("The day " + number + " is Monday!"); break;
            case 3: System.out.println("The day " + number + " is Tuesday!"); break;
            case 4: System.out.println("The day " + number + " is Wednesday!"); break;
            case 5: System.out.println("The day " + number + " is Thursday!"); break;
            case 6: System.out.println("The day " + number + " is Friday!"); break;
            case 7: System.out.println("The day " + number + " is Saturday!"); break;
            default: System.out.println("The " + number + " is not a week's day"); 
        };



    }
}
