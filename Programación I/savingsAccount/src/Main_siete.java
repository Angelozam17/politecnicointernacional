
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGELO
 */
public class Main_siete {
    
    public static void main(String[] arg){    
        show();
    }
    
    
    public static void show(){
        Empleado em = new Empleado("Edgar", "Millan", (byte) 40, "aHg123oB");
        JOptionPane.showMessageDialog(null, em.toString());
        
        Empleado em2 = new Empleado("Angelo", "Zambrano", (byte) 21, "ajJhsald12");
        JOptionPane.showMessageDialog(null, em2.toString());
    
    }
    
}
