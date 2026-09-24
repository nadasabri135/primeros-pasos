import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int hora, minuto , segundo ;
        hora = SC.nextInt();
        minuto = SC.nextInt();
        segundo = SC.nextInt();

        segundo++ ;
        if (segundo == 60){
            segundo = 0 ;
            minuto++ ;

        } else if (minuto == 60){
            minuto = 0 ;
            hora++ ;
        }
        System.out.println(hora + ":" + minuto + ":" + segundo  );

        }

    }

