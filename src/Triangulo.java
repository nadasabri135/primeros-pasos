import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        double lado1 , lado2 , lado3 ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce lado1 y lado2 y lado3 : ");
        lado1 = Sc.nextDouble();
        lado2 = Sc.nextDouble();
        lado3 = Sc.nextDouble();

        if ((lado1+lado2>lado3)&&(lado1+lado3>lado2)&&(lado3+lado2>lado1)){
            System.out.println("trianglo:");
        } else if ((lado1==lado2) && (lado1==lado3)) {
            System.out.println("equilátero");
        } else if (lado1==lado2) {
            System.out.println("isósceles");
        }else {
            System.out.println("escaleno");
        }
    }
}
