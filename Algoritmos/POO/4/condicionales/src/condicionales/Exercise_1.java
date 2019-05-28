//Switch
package condicionales;
import javax.swing.*;

public class Exercise_1 {
    public static void main(String[] args){
        int vr_pago, vr_programa;
        double total;
        String tipo_pago;
        
        vr_programa = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor del programa."));
        tipo_pago = JOptionPane.showInputDialog("Escriba el tipo de pago. \n"
                + "Efectivo - Crédito - Cesantías");
        
        
        switch (tipo_pago) {
            case "Efectivo": 
                total = (vr_programa - (vr_programa*0.02));
                JOptionPane.showMessageDialog(null, "El pago en efectivo tiene un descuento del 2%. \n"
                    + "Total a pagar $" + total);
                break;
            case "Credito": 
                byte meses = Byte.parseByte(JOptionPane.showInputDialog("¿A cuántos meses"));
                int total_mes = (vr_programa/meses);
                total = vr_programa+(total_mes*0.05);
                JOptionPane.showMessageDialog(null, "El pago a crédito tiene un incremento del 5% por cada mes. \n"
                    + "Total a pagar $" + total);
                break;
            case "Cesantias":
                total = vr_programa- (vr_programa*0.01);
                JOptionPane.showMessageDialog(null, "El pago a cesantías tiene un descuento del 1% por cada mes. \n"
                    + "Total a pagar $" + total);
        } 
    }
}

