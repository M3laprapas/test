import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ( num == 1 ){
            System.out.println("1.Añadir contacto");
        }
        if (num == 2){
            System.out.println("2.Mostrar contactos");
        }
        if (num == 3){
            System.out.println("3.Buscar contactos");
        }
        if (num==4){
            System.out.println("4.Salir");
        }
    }
}
