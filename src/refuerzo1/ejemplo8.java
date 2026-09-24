package refuerzo1;

import java.util.Scanner;

public class ejemplo8 {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if ( num % 2 ==0 || num % 3 ==0){
            System.out.println("el numero es múltiplo de 2 y de 3 simultáneamente");
        }

    }
}
