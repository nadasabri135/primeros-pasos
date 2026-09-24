package refuerzo1;

import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
        int a , b ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros :");
        a = Sc.nextInt();
        b = Sc.nextInt();

        if (a%b==0){
            System.out.println("el primero es múltiplo del segundo ");
        }else {
            System.out.println("el primero no es mùltiplo del segundo ");
        }


    }
}
