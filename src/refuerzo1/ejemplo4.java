package refuerzo1;

import java.util.Scanner;

public class ejemplo4 {
    public static void main(String[] args) {
        int num ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce un número entero : ");
        num = Sc.nextInt();

        if (num %10 ==0){
            System.out.println(" EL número es de multiplicaciones de 10");
        }else {
            System.out.println(" El número no es de moltiplicaciones de 10 ");
        }
    }

}
