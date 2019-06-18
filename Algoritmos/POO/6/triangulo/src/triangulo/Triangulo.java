package triangulo;

import javax.swing.JOptionPane;

public final class Triangulo {
    
    private int a, b, c;
    private double area, altura, base;
    private String tipo;
    private boolean entrar = true;
    
    
    
    //Constructors
    public Triangulo(){
        while(entrar){
            this.a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el primer lado del triángulo."));    
            this.b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el segundo lado del triángulo.")); 
            this.c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el tercer lado del triángulo.")); 
            validar();
            calcular();
            show();
            entrar();
        }
    }
    
    // TIPO
    public void validar(){
        if (a == b && b == c){
            tipo = "Equilatero";
            System.out.println("El triángulo es " + tipo);
        }else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
            tipo = "Isosceles";
            System.out.println("El triángulo es " + tipo);
        }else if (a != b && a != c && c != b){
            tipo = "Escaleno";
            System.out.println("El triángulo es " + tipo);
        }        
    }
    
    public void calcular(){
        //Equilatero
        if("Equilatero".equals(tipo)){
            area = (Math.sqrt(3)/4)*(a*a);
            System.out.println("El area es " + area);
            
        //ISOSCELES
        }else if("Isosceles".equals(tipo) && a == c){
            area = (b*(Math.sqrt((a*a)-((b*b)/4))))/2;
            System.out.println("El area es " + area);
        }else if("Isosceles".equals(tipo) && a == b){
            area = (c*(Math.sqrt((a*a)-((c*c)/4))))/2;
            System.out.println("El area es " + area);
        }else if("Isosceles".equals(tipo) && c == b){
            area = (b*(Math.sqrt((c*c)-((b*b)/4))))/2;
            System.out.println("El area es " + area);
            
        //ESCALENO
        }else if(a != b && a != c && b != c){
            double semip = (double)(a+b+c)/2;
            area = Math.sqrt(semip*((semip-a)*(semip-b)*(semip-c)));
            System.out.println("El area es " + area);
        }           
    }
    
    //Getters

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public String getTipo() {
        return tipo;
    }
    public boolean isEntrar() {
        return entrar;
    }
    
    
    
    

    //Setters
    public void setA(int a) {
        this.a = a;
       
    }

    public void setB(int b) {
        this.b = b;
    }
        
    public void setC(int c) {
        this.c = c;
    }

    public void calcArea() {
    }
    
    
    
    //Mostrar datos
    public void show(){
        JOptionPane.showMessageDialog(null, "Primer lado " + getA() + "\n"
                         + "Segundo lado " + getB() + "\n"
                         + "Tercer lado " + getC() + "\n"
                         + "El area es " + area);
    }
    
    public void entrar(){
        String seguir = JOptionPane.showInputDialog(null, "¿Desea seguir?");
        if("yes".equals(seguir)){
           entrar = true;
        }else entrar = false;       
    }
}