/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author Usuario
 */
public class Users {
    
    String nameusers[] = new String[5];
    String password[] = new String[5];
    boolean val = false;
    
    public Users(){
        nameusers[0] = "Angelo";
        nameusers[1] = "Felipe";
        nameusers[2] = "Johan";
        nameusers[3] = "Gloria";
        nameusers[4] = "Cala";
            
        password[0] = "0123";
        password[1] = "1234";
        password[2] = "2345";
        password[3] = "3456";
        password[4] = "4567";
    }
    
    public boolean validar(String usu, String pass){
       for(byte i = 0; i <= 4; i++){
           if(usu.equals(nameusers[i]) && pass.equals(password[i])){

            val = true;
            System.out.println("Nombre y password válidos.");
            break;

        }else if(usu.equals(nameusers[i]) && !pass.equals(password[i])){
            System.out.println("Nombre es válido pero la contraseña no lo es.");
            break;

        }else if(!usu.equals(nameusers[i]) && pass.equals(password[i])){
            System.out.println("Nombre es inválido pero la contraseña sí lo es.");
            break;

        }
       }
       return val; 
    }
}
   


    /*for(byte i = 0; i <= 4; i++){
        if(usu.equals(nameusers[i]) && pass.equals(password[i])){

            val = true;
            System.out.println("Nombre y password válidos.");
            break;

        }else if(usu.equals(nameusers[i]) && !pass.equals(password[i])){
            System.out.println("Nombre es válido pero la contraseña no lo es.");
            break;

        }else if(!usu.equals(nameusers[i]) && pass.equals(password[i])){
            System.out.println("Nombre es inválido pero la contraseña sí lo es.");
            break;

        }

    }*/