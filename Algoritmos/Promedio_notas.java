package temp;
import java.util.Scanner;

public class Promedio_notas{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Escribe tus notas para saber su promedio.");
        

        byte nota_1 = tec.nextByte();
        byte nota_2 = tec.nextByte();
        byte nota_3 = tec.nextByte();

        int prom = (nota_1 + nota_2 + nota_3 )/3;
        System.out.println("Su promedio es " + prom);
        
        tec.close();
    }
}