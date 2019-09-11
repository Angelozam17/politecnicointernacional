
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo 1 Info2
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingsAccount account = new SavingsAccount(1024586470, 30000000, "Angelo");
        
        int numberAccount;
        
        
        do{       
            numberAccount = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita tu número de cuenta para continuar.")); 
            numberAccount = 1024586470;
        }while(numberAccount != account.getNumberAccount());
        
        
        if (numberAccount == account.getNumberAccount()) {
            byte response = 0;
        
            System.out.println();

            try{   
            response = Byte.parseByte(JOptionPane.showInputDialog(null, "Hola "+ account.getName() +"!\n¿Qué deseas hacer?\n\n"
                    + "1. Ingresar dinero.\n"
                    + "2. Retirar dinero.\n"
                    + "3. Transferir dinero.\n"
                    + "4. Verificar saldo\n"
                    + "0. salir"));

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digita un número correcto.");
                do{       
                    numberAccount = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita tu número de cuenta para continuar.")); 

                }while(numberAccount != account.getNumberAccount());
            };


            switch(response) {
                case 1:
                    account.addMoney();
                    JOptionPane.showMessageDialog(null, "Tu transacción ha sido exitosa");
                    JOptionPane.showMessageDialog(null, "Tu saldo ahora es de $" + account.getSaldo());
                    break;
                case 2:
                    account.subtractMoney();
                    JOptionPane.showMessageDialog(null, "Tu transacción ha sido exitosa");
                    JOptionPane.showMessageDialog(null, "Tu saldo ahora es de $" + account.getSaldo());
                    break;
                case 3:
                    account.transferMoney();
                    JOptionPane.showMessageDialog(null, "Tu transacción ha sido exitosa");
                    JOptionPane.showMessageDialog(null, "Tu saldo ahora es de $" + account.getSaldo());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Tu saldo es de $" + account.getSaldo());
                    break;
                case 0:                    
                    break;               
            }
        }
        
    }
    
}
