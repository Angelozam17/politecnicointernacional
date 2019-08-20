package arrays;
public class Matriz {

    
    int array_1[][] = {{ 1, 2 },{ 3, 4 }};
    int array_2[][] = new int[2][2];
    int sum = 0;
        
        
        
    public void mostrar(){             
        for(byte i = 0; i < 2; i++){
            for(byte j = 0; j < 2; j++) {               
                System.out.println( "Función mostrar " + array_1[i][j]);
                System.out.println("Soy el cuadrado de la primera matriz " + array_2[i][j]);
            } 
        }
    }
    
    
    
    public void duplicar(){
        for(byte i = 0; i < 2; i++){
            for(byte j = 0; j < 2; j++) { 
                array_1[i][j] = array_1[i][j] * 2;
            } 
        }
    }
    
    
    
    public int sumatoria(){
        for(byte i = 0; i < 2; i++){
            for(byte j = 0; j < 2; j++) {
                sum = sum + array_1[i][j];              
            } 
        }
        return sum;
    }
    
    
    public void cuadrado(){
        for(byte i = 0; i < 2; i++){
            for(byte j = 0; j < 2; j++) { 
                array_2[i][j] = array_1[i][j] * array_1[i][j];
                
            } 
        }
    }
}

