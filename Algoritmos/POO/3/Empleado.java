package horasextras;
import java.util.Scanner;

public class Empleado {
    Scanner tec = new Scanner(System.in);
    String name, surname;
    int salary;
    byte HED, HEN, HEDF, HENF;
    
    public void personalData(){
        
        System.out.println("Nombre: ");
        name = tec.nextLine();
        
        System.out.println("Apellidos: ");
        surname = tec.nextLine();
        
        System.out.println("Salario: ");
        salary = tec.nextInt();
        
        System.out.println("# de horas extras diurnas.");
        HED = tec.nextByte();
        
        System.out.println("# de horas extras nocturnas.");
        HEN = tec.nextByte();
        
        System.out.println("# de horas extras diurnas festivas.");
        HEDF = tec.nextByte();
        
        System.out.println("# de horas extras nocturnas festivas.");
        HENF = tec.nextByte();
            
    }
    
    public void showData(){
        
        int valueHour = salary/240; 
        double valueHED = (double)(valueHour * 1.25) * HED;
        double valueHEN = (double)(valueHour * 1.35) * HEN;
        double valueHEDF = (double)(valueHour * 2.00) * HEDF;
        double valueHENF = (double)(valueHour * 2.5) * HENF;
        
        double totalHE = valueHED + valueHEN + valueHEDF + valueHENF;
        
        System.out.println("Horas extras diurnas trabajadas: $" + valueHED);
        System.out.println("Horas extras nocturnas trabajadas: $" + valueHEN);
        System.out.println("Horas extras diurnas festivas trabajadas: $" + valueHEDF);
        System.out.println("Horas extras nocturnas festivas trabajadas: $" + valueHENF);
        
        System.out.println("TOTAL DE HORAS EXTRAS TRABAJADAS: $" + totalHE);
        System.out.println("TOTAL DE SALARIO + HORAS EXTRAS: $" + (totalHE + salary));
        
        
    }
}
