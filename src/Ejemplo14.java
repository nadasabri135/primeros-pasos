import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {
        int num ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = Sc.nextInt();

        if (num<3) {
            System.out.println("Muy Deficiente :");

        } else if (num<5){
            System.out.println("Insuficiente :");
        }else if (num<6) {
            System.out.println("Insuficiente: ");
        }else if (num<7){
            System.out.println("Bien:");
        }else if (num<9){
            System.out.println("Notable:");
        }else{
            System.out.println("Muy Bien:");
        }


    }
}
