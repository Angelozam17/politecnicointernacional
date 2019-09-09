/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poliinter.poo;

/**
 *
 * @author Usuario
 */
public class Password {
    //private final static int LONG_DEF = 2;
    private int length;
    private String password;
    private String secure;
    
    
    public String generatePassword(){
        password = "";
        for (byte i = 0; i < length; i++) {
            int numberRandom = (int) Math.floor(Math.random() * 3 + 1);  
            
            if (numberRandom == 1) {
                char lowerCase = (char)((int)Math.floor(Math.random() * (122 - 97) + 97)); 
                password = password + lowerCase;
            }else if(numberRandom == 2){
                char upperCase = (char)((int)Math.floor(Math.random()* (90 - 65) + 65));
                password = password + upperCase;
            }else if(numberRandom == 3){
                char numbers = (char)((int)Math.floor(Math.random()* (57 - 48) + 48));
                password = password + numbers;
            }
        }
        return password;
    }
    
    public String isSecure(){
        
        int numbers = 0;
        int numberLowerCase = 0;
        int numberUpperCase = 0;
        
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                numberUpperCase++;
            }else if(password.charAt(i) >= 65 && password.charAt(i) <= 90){
                numberLowerCase++;
            }else if(password.charAt(i) >= 48 && password.charAt(i) <= 57){
                numbers++;
            }            
        }
        
        if (numbers >= 2 && numberLowerCase >= 1 && numberUpperCase >= 1) {
            secure = "La contraseña es segura";
        }else{
            secure = "La contraseña es INSEGURA";
        }
        return secure;
    }
    
    
    //GETTERS AND SETTERS
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
