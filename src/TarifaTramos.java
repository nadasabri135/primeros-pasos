import java.util.Scanner;

public class TarifaTramos {
    public static void main(String[] args) {
        double consumo ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce el consumo mensual en Kwh:");
        consumo = Sc.nextDouble();
        double total ;

        if (consumo <= 100 ) {
            total = consumo * 0.10 ;

        } else if (consumo <= 300) {
            total = (100 * 0.1) + (consumo - 100) * 0.5 ;

        } else  {
            total = (100 * 0.1) + (300* 0.15) + ( consumo - 300) * 0.2 ;
        }
        System.out.println("Introduce el import total : " + total);
    }
}
