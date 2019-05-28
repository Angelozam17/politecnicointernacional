package condicionales;
import javax.swing.*;

public class Exercise_3 {
    public static void main(String[] args){
        byte h_tra;
        int pag_h, total;
        
        h_tra = Byte.parseByte(JOptionPane.showInputDialog("Escribe las horas trabajadas."));
        
        if (h_tra <= 40){
            pag_h = 16;
            total = h_tra * pag_h;
            JOptionPane.showMessageDialog(null, "Tu salario es de $" + total);
        }else{
            pag_h = 20;
            int h_40 = 640;
            total = (h_tra - 40) * pag_h;
            JOptionPane.showMessageDialog(null, "Tu salario es de $" + total + h_40);
        }
    }
}
