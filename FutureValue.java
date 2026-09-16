import java.util.Scanner;
public class FutureValue {
    

    public static double futureValue(double present, double interest, double months) {


        double future1 = interest + 1;
        double future2 = Math.pow(future1, months);
        double futureFinal = future2 * present;

        return futureFinal;



    } //end of futureValue Method


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the present amount.");
        double startingAmount = scanner.nextDouble();
        System.out.println("Enter the interest rate as a decimal.");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time in months.");
        double time = scanner.nextDouble();

        double futureFinal2 = futureValue(startingAmount, rate, time);

        System.out.print("Your final amount is $");
        System.out.printf("%.2f", futureFinal2);



    } //end of main


} //end of FutureValue Class
