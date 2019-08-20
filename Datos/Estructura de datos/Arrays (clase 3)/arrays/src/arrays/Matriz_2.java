package arrays;
public class Matriz_2 {
    
    int n_mayor = 0;
    int n_menor = 99;
    
    public int recibe(int n[][]){
        for(byte i = 0; i < 3; i++){
            for(byte j = 0; j < 3; j++){                                              
                if(n[i][j] > n_mayor){
                    n_mayor = n[i][j];
                }                       
            }
        }
        System.out.println(n_mayor);
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
      
}
