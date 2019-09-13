
import java.util.Date;
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
public class Fecha {
    
    Date today = new Date();
    int right,wrong;

    
    public void queDiaEsHoy(){
        
        int date = Integer.parseInt(JOptionPane.showInputDialog("¿Qué día del mes es hoy?"));
        
        if (today.getDate() == date) {
            JOptionPane.showMessageDialog(null, "¡Correcto!");
            right++;
        }else{
            wrong++;
            JOptionPane.showMessageDialog(null, "Mmmmm no");
        }
        System.out.println(today.getDate());
        
        
        
        
        int month = Integer.parseInt(JOptionPane.showInputDialog("¿En qué número del mes estamos?"));
        
        if (today.getMonth() + 1 == month) {
            right++;
            JOptionPane.showMessageDialog(null, "¡Correcto!");
        }else{
            wrong++;
            JOptionPane.showMessageDialog(null, "Mmmmm no");
        }
        System.out.println(today.getMonth()+1);
        
        
        
        int year = Integer.parseInt(JOptionPane.showInputDialog("¿En qué año estamos?"));
        
        if (today.getYear() + 1900 == year) {
            right++;
            JOptionPane.showMessageDialog(null, "¡Correcto!");
        }else{
            wrong++;
            JOptionPane.showMessageDialog(null, "Mmmmm no");
        }
        System.out.println(today.getYear() + 1900);
        
        
        
        JOptionPane.showMessageDialog(null, "Respuestas correctas " + right + "\n"
        + "Respuestas incorrectas " + wrong);
        
    }
    
    //GETTERS AND SETTERS

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
    
    
    
    
}
