import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        int mes ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce un mes ");
        mes = Sc.nextInt();

        switch (mes){
            case 1:
            case 3:
            case 5:
                System.out.println("El mes tiene 31 días : ");
                break ;
            case 2:
                System.out.println("El mes tiene 28 días : ");
                break ;
            case 4:
                System.out.println("El mes tiene 30 días");
        }
    }
}
