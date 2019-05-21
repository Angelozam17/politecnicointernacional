import java.util.Scanner;

public class Smr{

    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Digita dos números para sumarlos, restarlos y multiplicarlos");

        int n_1 = tec.nextInt();
        int n_2 = tec.nextInt();

        System.out.println("La suma entre " + n_1 + " + " + n_2 + " = " + (n_1 + n_2));
        System.out.println("La resta entre " + n_1 + " + " + n_2 + " = " + (n_1 - n_2));
        System.out.println("La multiplicación entre " + n_1 + " + " + n_2 + " = " + (n_1 * n_2));

        float div = (float) n_1 / n_2;
        System.out.println("La división entre " + n_1 + " + " + n_2 + " = " + div);

        tec.close();
    }
}
