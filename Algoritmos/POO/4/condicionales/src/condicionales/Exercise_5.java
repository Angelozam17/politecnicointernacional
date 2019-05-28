package condicionales;
import javax.swing.*;

public class Exercise_5 {
    public static void main(String[] args){
        
        byte t_cam;
        int prec_cam, prec_t;
        
        prec_cam = Integer.parseInt(JOptionPane.showInputDialog("Precio por unidad de las camisas"));        
        t_cam = Byte.parseByte(JOptionPane.showInputDialog("Número de camisas"));
        
        prec_t = t_cam * prec_cam;
        
        
    }
}