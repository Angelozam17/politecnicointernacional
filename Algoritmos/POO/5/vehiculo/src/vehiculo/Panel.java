package vehiculo;

import javax.swing.JOptionPane;

public class Panel{
        public static void main(String[] args){
            
            Vehiculo automovil = new Vehiculo();
            automovil.mostrar();
            JOptionPane.showMessageDialog(null, "La marca es " + automovil.getMarca());
        }
    }
