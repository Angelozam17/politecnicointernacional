package arrays;
public class Matriz_2 {
    
    int n_mayor = 0;
    int n_menor = 999;
    double promedio;
    byte repetidos;
    int i, j;
    
    public int mayor(int n[][]){
        for(byte i = 0; i < 3; i++){
            for(byte j = 0; j < 3; j++){                                              
                if(n[i][j] > n_mayor){
                    n_mayor = n[i][j];
                }                       
            }
        }
        return n_mayor;
    }
    
    public int menor(int n[][]){
        for(byte i = 0; i < 3; i++){
            for(byte j = 0; j < 3; j++){                                              
                if((n[i][j] < n_menor)){
                    n_menor = n[i][j];
                }                       
            }
        }
        return n_menor;
    }
    
    public double promedio(int n[][]){
        for(byte i = 0; i < 3; i++){
            for(byte j = 0; j < 3; j++){
                promedio = (promedio + n[i][j])/n.length;
            }
        }       
        return promedio;
    }
    
    public byte repetidos(int n[][]){
        
        for (i = 0; i < 3; i++) {
            if(n[i][j] == n[j][i]){
                //System.out.println("Este número " + n[i][j] + " == " + n[j][i]);
                repetidos++;                    
            }  
            System.out.println("Este número: (" + n[i][j] + ") está repetido con este " + n[i][j]); 
        }
        return repetidos;
    }
    
    
    /*public void numeros(){
        for (int i = 0; i < 10; i++) {                    
            if(i == 7){               
                return;
            }System.out.println("Numero " + i); 
        }System.out.print("No salí de la función!");
    }*/
      
}
