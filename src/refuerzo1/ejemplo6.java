package refuerzo1;

import java.util.Scanner;

public class ejemplo6 {
    public static void main(String[] args) {
        int a , b ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros :");
        a = Sc.nextInt();
        b = Sc.nextInt();
        double resultado = a % b ;

        if (a != 0 && b!=0 ){
            System.out.println("resultado de dividir el primero entre el segundo es : " + " "+ resultado );
        }else {
            System.out.println("Error: No se puede dividir entre cero");
        }

    }
}
