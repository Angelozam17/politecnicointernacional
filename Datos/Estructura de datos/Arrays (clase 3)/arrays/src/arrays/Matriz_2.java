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
    
    
    public int findRepeats(int [][] num, int size){
        int findNum;
        int numero = 0;
        int total = 1, row = 0, col = 0;
        while(row < num.length && col < num[0].length){
            //Set to number
            
            findNum = num[row][col];
            //Cycle array to set next number
            if(col < num[0].length-1)
                col++;
            else{
                row++;      //Go to next row if no more columns
                col = 0;    //Reset column number
            }
            //Loop through whole array to find repeats
            for(int i = row; i < num.length; i++){
                for(int j = col; j < num[i].length; j++){
                    if(num[i][j] == findNum) {
                        total++;
                         //Cycle array to set next number
                          if(col < num[0].length-1)
                              col++;
                          else
                          {
                               row++;      //Go to next row if no more columns
                               col = 0;    //Reset column number
                          }
                          if(row < num.length - 1 && col < num[0].length -1)
                             num[i][j] = num[row][col];
                             numero++;
                    }
                }
            }


            //Display total repeats
            System.out.println("Number " + findNum + " appears " + total + " times.");
            total = 1;
        }
        return numero;
    }
    
    /*public byte repetidos(int n[][]){
        
        for (i = 0; i < 3; i++) {
            for (int k = 0; k < n.length; k++) {
                if(n[i][j] == k){
                System.out.println("Este número " + n[i][j] + " == " + k);
                repetidos++;                    
                }  
            }
            
            //System.out.println("Este número: (" + n[i][j] + ") está repetido con este " + n[i][j]); 
        }
        int suma = 0;
        //Array de 1 a 10
        int numeros[] = new int[10];
        for (int i = 0; i < 10; i++) {                      
            numeros[i] = suma;
            suma++;           
        }
        
        for (int i = 0; i < numeros.length; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < 3; j++) {
                    if (numeros[i] == n[k][j]) {
                        repetidos++;
                        System.out.println(n[k][j] + " número repetido");
                    }
                }
            }
            
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
