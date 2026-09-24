import java.util.Scanner;

public class PrecioSosio {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double importe ;
        System.out.println("Ingrese el importe ");
        importe = Sc.nextDouble();
        System.out.println("¿ Eres socio? (si/no) ");
        String socia = Sc.nextLine();
        double descuento ;

        if (socia.equals("si")){
            if (importe < 50) {
                descuento = 0.1;
            }
        }
        }




    }

