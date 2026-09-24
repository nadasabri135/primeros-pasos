import java.util.Scanner;

public class NotaExamen {
    public static void main(String[] args) {
         double nota ;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduce la nota ");
        nota = Sc.nextDouble();
        System.out.println("¿Ha entragado todas las practicas? (si / no ) :");
        String practica = Sc.nextLine();

        if (nota<5){
            System.out.println("Suspenso");
        } else if (practica.equals("no")) {
            System.out.println("Suspenso por prácticas pendientes");
        }else if (nota<7){
                System.out.println("Aprobado");
            } else if (nota<9) {
                System.out.println("Notable");
            }else {
                System.out.println("Sobresaliente");
            }

    }
}
