package condicionales;
import javax.swing.*;

public class Exercise_2 {
    public static void main(String[] args){
        int vr_producto;
        double descuento = 0.2;
        
        JOptionPane.showMessageDialog(null, "Por compras mayores a $1.000 tienes un descuento del 20%.");
        
        vr_producto = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del producto."));
        
        if (vr_producto > 1000){
            vr_producto = (int) (vr_producto - (vr_producto * descuento));
            JOptionPane.showMessageDialog(null, "Tienes un descuento del 20%");
        }
        
        JOptionPane.showMessageDialog(null, "Total a pagar $" + vr_producto);
    }
}