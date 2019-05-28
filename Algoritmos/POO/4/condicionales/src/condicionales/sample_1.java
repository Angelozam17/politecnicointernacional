//Elabore el programa que capture le valor de ventas de un empleado. Si las ventas superan el 1.000.000 se le generará una comisión del 20% sobre la venta. De lo contrario "Sígalo itentando".
package condicionales;
import javax.swing.*;

public class sample_1 {
    public static void main(String[] args){
        int n1;
        double p;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la primera venta"));
        
        p = (n1) * 0.2;
        
        JOptionPane.showMessageDialog(null, p >= 1000000 ? "Recibiste comisión de $" + p : "Síguelo intetando");
        
    }
}
