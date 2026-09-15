import java.util.Scanner;
public class KineticEnergy {

    public static double kineticEnergy(double mass, double velocity) {

        double velocity2 = Math.pow(velocity, 2);
        double kineticFinal = 0.5 * velocity2 * mass;

        return kineticFinal;

    } //end of kineticEnergy

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the mass of the object.");
        double massIn = scanner.nextDouble();
        
        System.out.println("Enter the velocity of the object.");
        double velocityIn = scanner.nextDouble();

        double kineticFinal2 = kineticEnergy(massIn, velocityIn);

        System.out.print("The kinetic energy of the object is: ");
        System.out.printf("%.2f", kineticFinal2);



    } //end of main


} //end of KineticEnergy
