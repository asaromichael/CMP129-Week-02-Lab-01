public class CelsiusTable {


    public static double celsius(double F) {

        double C = (5.0/9.0) * (F-32);
        return C;



    } //end of celsius


    public static void main(String[] args) {

        System.out.println("Faren.  Celsius");
        System.out.println("---------------");
        
        for(int count = 0; count < 21; count++) {


            double cFinal = celsius(count);
            System.out.print("\n" + count + "       ");
            System.out.printf("%.2f", cFinal);


        } //end of for


    } //end of main

    
} //end of CelsiusTable
