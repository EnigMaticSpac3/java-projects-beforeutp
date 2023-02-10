import java.util.Scanner;

public class EarningsAndDeductions {
    public static void main(String[] args) {
        /*
         * Calculate and show
         * -- Initial salary
         * -- Total salary substracting deductions (20%)
         * -- Deducted quantity
         */

        Scanner scanner = new Scanner(System.in);

        double initialSalary, deducted, finalSalary;
        // INPUT
        System.out.print("Enter your salary: $");
        initialSalary = scanner.nextDouble();

        scanner.close();

        // Calculate Deduction
        deducted = (initialSalary * 0.2);

        finalSalary = initialSalary - deducted;

        // PRINT
        System.out.println("Your initial Salary of $" + initialSalary); 
        System.out.println("Was reduced 20% with deductions of $" + deducted);
        System.out.println("Having a total of $" + finalSalary);

         

    }
}
