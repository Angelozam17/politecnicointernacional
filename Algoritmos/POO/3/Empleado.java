package horasextras;
import javax.swing.JOptionPane;

public class Empleado {

    String name, surname;
    int salary;
    byte HED, HEN, HEDF, HENF;
    
    public void personalData(){
        
        name = JOptionPane.showInputDialog(null ,"Digita tu nombre");
        surname = JOptionPane.showInputDialog(null ,"Digita tus apellidos");
        salary = Integer.parseInt(JOptionPane.showInputDialog(null ,"Digita tu salario"));
       
        HED = Byte.parseByte(JOptionPane.showInputDialog(null ,"Número de horas extras diurnas."));
        HEN = Byte.parseByte(JOptionPane.showInputDialog(null ,"Número de horas extras nocturnas."));
        HEDF = Byte.parseByte(JOptionPane.showInputDialog(null ,"Número de horas extras diurnas festivas."));
        HENF = Byte.parseByte(JOptionPane.showInputDialog(null ,"Número de horas extras nocturnas festivas."));
            
    }
    
    public void showData(){
        
        int valueHour = salary/240; 
        double valueHED = (double)(valueHour * 1.25) * HED;
        double valueHEN = (double)(valueHour * 1.35) * HEN;
        double valueHEDF = (double)(valueHour * 2.00) * HEDF;
        double valueHENF = (double)(valueHour * 2.5) * HENF;
        
        double totalHE = valueHED + valueHEN + valueHEDF + valueHENF;
        
        JOptionPane.showMessageDialog(null ,"Horas extras diurnas trabajadas: $" + valueHED + "\n" + "Horas extras nocturnas trabajadas: $" + valueHEN + "\n" + "Horas extras diurnas festivas trabajadas: $" + valueHEDF + "\n" + "Horas extras nocturnas festivas trabajadas: $" + valueHENF);
        JOptionPane.showMessageDialog(null , "TOTAL DE HORAS EXTRAS TRABAJADAS: $" + totalHE + "\n" + "TOTAL DE SALARIO + HORAS EXTRAS: $" + (totalHE + salary));

        
        
    }
}
