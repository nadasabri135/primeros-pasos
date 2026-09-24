import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class EstructurasDeDecisión01 {

    public static void main(String[] args) {
        double peso , altura ;
        Scanner Sc = new Scanner(System.in);

        System.out.println(" Introduce el peso y altura :");
        peso = Sc.nextDouble();
        altura = Sc.nextDouble();

        double IMC = peso / ( altura * altura) ;
        System.out.println("el imc es : " + IMC);
        if (IMC < 18.5){
            System.out.println(" Bajo peso :");
        } else if (IMC < 25) {
            System.out.println(" Normal : ");
        } else if (IMC < 30) {
            System.out.println(" Sobrepeso ");
        }else {
            System.out.println("Obesidad ");
        }
    }
}
