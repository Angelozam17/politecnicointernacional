/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo 1 Info2
 */
class Count {
    private int counter;
    
    public Count(){
    
    }
    public Count(int counter){
        this.counter = counter;
    }
    
    
    
    //METHODS
    public int plus(int n){
        counter++;
        return counter;
    }
    
    public int subtract(int n){
        counter--;
        return counter;
    }
    
    //GETTERS AND SETTERS
    public int getCounter() {
        return counter;
    }

    public void setCounter(byte counter) {
        this.counter = counter;
    }
    
    
}
