package refuerzo1;

import java.util.Scanner;

public class ejemplo5 {
    public static void main(String[] args) {
        int a,b , Resultado ;
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Introduce dos numeros enteros ");
        a = Sc.nextInt();
        b = Sc.nextInt();
        if (a==0){
            System.out.println("El producto de 0 por cualquier número es 0 :");
        }else {
            System.out.println("Introduce el segundo numero");

        }
        Resultado = a * b ;
        System.out.println(" la rssultado es : " + " " + Resultado);
        }

    }

