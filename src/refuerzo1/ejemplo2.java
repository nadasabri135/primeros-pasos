package refuerzo1;

import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        int num ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce un número entero : ");
        num = Sc.nextInt();

        if (num % 2 == 0){
            System.out.println("el número es par :");
        }else {
            System.out.println(" El numero es impar ");
        }

    }
}
