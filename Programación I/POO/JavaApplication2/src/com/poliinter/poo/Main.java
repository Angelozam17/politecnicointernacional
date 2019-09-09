/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poliinter.poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[]args){
        Password pass = new Password();
        
        String text = JOptionPane.showInputDialog("Digita la longitud de tu contraseña.");
        pass.setLength(Integer.parseInt(text));
        
        System.out.println(pass.generatePassword() + "\n" + pass.isSecure());
    }
    
}
