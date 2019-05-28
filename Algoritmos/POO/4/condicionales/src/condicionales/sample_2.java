package condicionales;
import javax.swing.*;

public class sample_2 {
    public static void main(String[] args){
        int salario;
        byte op;
        
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite su salario"));
        
        op = Byte.parseByte(JOptionPane.showInputDialog(
            "1. Valor día. \n" + 
            "2. Valor EPS. \n" + 
            "3. Valor subsidio. \n" + 
            "Digite su opción."
        ));
        
        switch (op) {
            case 1: JOptionPane.showMessageDialog(null, "Valor del día $" + (salario/30));
                break;
            case 2: JOptionPane.showMessageDialog(null, "Valor EPS $" + (salario*4.333));
                break;
            case 3: JOptionPane.showMessageDialog(null, "Valor subsidio $" + (salario*0.2));  
                break;
            default: JOptionPane.showMessageDialog(null, "Digita un número válido.");
                break;
        } 
    }
}
