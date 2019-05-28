package condicionales;
import javax.swing.*;

public class Condicionales {
    public static void main(String[] args) {
        
        byte n1, n2, n3;
        double p;
        
        n1 = Byte.parseByte(JOptionPane.showInputDialog("Digite la nota #1"));
        n2 = Byte.parseByte(JOptionPane.showInputDialog("Digite la nota #2"));
        n3 = Byte.parseByte(JOptionPane.showInputDialog("Digite la nota #3"));
        
        p = (n1 + n2 + n3) / 3;
        
        if( p < 3 ) {
            JOptionPane.showMessageDialog(null, "Reprobaste con " + p + " puntos.");
        }else{
            JOptionPane.showMessageDialog(null, "Aprobaste con " + p + " puntos.");
        }
    }
    
}
