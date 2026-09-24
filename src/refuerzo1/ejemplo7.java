package refuerzo1;

import java.util.Scanner;

public class ejemplo7 {
    public static void main(String[] args) {
        int a;
        System.out.println("Introdoce un numero : ");
        Scanner SC = new Scanner(System.in);
        a = SC.nextInt();
         if (a%2==0){
             System.out.println(" el numero es múltiplo de 2");
         }else if (a%3==0){
             System.out.println("el numero es múltiplo de 3");
         }else {
             System.out.println("no es múltiplo de 2 y 3");
         }


    }
}
