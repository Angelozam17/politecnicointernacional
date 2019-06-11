package triangulo;

public class Panel{
    
    public static void main(String[] arg){
        Triangulo t_1 = new Triangulo(2, 4, 6); 
        t_1.setC(0);
        System.out.println("Primer lado " + t_1.getA() + "\n"
                         + "Segundo lado " + t_1.getB() + "\n"
                         + "Tercer lado " + t_1.getC());
       
    }
}

