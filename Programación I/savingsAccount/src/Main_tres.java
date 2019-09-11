
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author politecnico
 */
public class Main_tres {
    
    public static void main(String[] arguments){
        Library libro = new Library();

        byte response = 0;
        do{    
            response = Byte.parseByte(JOptionPane.showInputDialog("¿Qué deseas hacer?\n"
                    + "1. Solicitar un libro.\n"
                    + "2. Entregar un libro\n"
                    + "0. Salir"));
            
            
            if (response == 1) {
                libro.prestamo();
            }else if(response == 2){
                libro.devolucion();
            }
        }while(response != 0);
        
        
    }
        
}
