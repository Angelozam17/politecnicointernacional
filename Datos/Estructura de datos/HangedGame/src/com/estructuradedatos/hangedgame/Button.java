/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructuradedatos.hangedgame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author ANGELO
 */
public class Button {
    //char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private int numberAttemps;
    private int numberRight;
    private int numberWrong;
    
    public Button(){
        
    } 
    
    
    public void findWord(JToggleButton button, char[] charac, char letter){    
        numberWrong = numberAttemps - numberRight;
        
        for (int i1 = 0; i1 < charac.length; i1++){
            
            if(charac[i1] == letter){ 
                numberRight++;  
            }       
        }      
        numberAttemps--;
        button.setEnabled(false);
    }
    
    public void UpdateAttemps(JLabel n){
        if (numberAttemps >= 0) {
            n.setText("" + getNumberAttemps());
        }else{
            JOptionPane.showMessageDialog(null, "¡Has perdido!");
        }      
    }
    
      
    //GETTERS Y SETTERS
    public int getNumberAttemps() {
        return numberAttemps;
    }

    public void setNumberAttemps(byte numberAttemps) {
        this.numberAttemps = numberAttemps;
    }

    public int getNumberRight() {
        return numberRight;
    }

    public void setNumberRight(byte numberRight) {
        this.numberRight = numberRight;
    }

    public int getNumberWrong() {
        return numberWrong;
    }

    public void setNumberWrong(byte numberWrong) {
        this.numberWrong = numberWrong;
    }

    
}
