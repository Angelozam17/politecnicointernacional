
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
public class SavingsAccount {
    private String name;
    private int numberAccount;
    private int saldo;
    
    public SavingsAccount(int numberAccount, int saldo, String name){
        this.name = name;
        this.numberAccount = numberAccount;
        this.saldo = saldo;
    }
    
    public void addMoney(){
        int add;
        add = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto dinero deseas ingresar?"));
        
        saldo = saldo + add;
    
    }
    
    public void subtractMoney(){
        int subtract;
        subtract  = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto dinero deseas retirar?"));
        
        
        
        
        
        if (subtract > saldo) {
            JOptionPane.showMessageDialog(null, "No puedes retirar esa cantidad.");
        }else{
            saldo = saldo - subtract;
        }
    
    }
    
    public void transferMoney(){
        int subtract;
        JOptionPane.showInputDialog(null, "¿A qué cuenta deseas transferir");
        
        subtract  = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto dinero deseas transferir?"));
        
        saldo = saldo - subtract;
    
    }
    
    
    //GETTERS AND SETTERS

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
