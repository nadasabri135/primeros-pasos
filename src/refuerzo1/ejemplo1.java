package refuerzo1;

import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        int num ;
        Scanner SC = new Scanner(System.in);
        System.out.println("Introduce un número :");
        num = SC.nextInt() ;

        int doble = num * 2 ;
        int triple = num * 3 ;

        System.out.println("el numero doble de num :" + num * 2);
        System.out.println("el numero triple de num :" + num * 3);

    }
}
