package condicionales;
import javax.swing.*;

public class Exercise_4 {
    public static void main(String[] args){
        String art;
        int pass;
        int prec, prec_desc;
        double desc;
        
        pass = Integer.parseInt(JOptionPane.showInputDialog("Contraseña"));
        
        if(pass == 1234){
            desc = 0.1;
            JOptionPane.showMessageDialog(null, "Tienes descuento de 10%");
        }else if(pass == 123){
            desc = 0.2;
            JOptionPane.showMessageDialog(null, "Tienes descuento de 20%");
        }else{
           desc = 0; 
        }
        
        art = JOptionPane.showInputDialog("Nombre del producto.");
        prec = Integer.parseInt(JOptionPane.showInputDialog("Precio del producto."));
        
        prec_desc = (int) (prec - (prec * desc));
        JOptionPane.showInputDialog("Nombre del producto " + art +"\n" +
            "Precio del producto $" + prec + "\n" +
            "Precio con descuento $" + prec_desc
        );
        
    }
}
