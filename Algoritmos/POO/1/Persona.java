import java.util.Scanner;

public class Persona{

    Scanner cap = new Scanner(System.in);
    byte age;
    String name;
    double weight, height, BMI;

        public void mass(){
            //Peso / (Altura^2)
            this.BMI = weight*(height*height);
        }

        public void show(){

            System.out.println("Su edad es " + age);
            System.out.println("Su nombre es " + name);
            System.out.println("Su peso es " + weight);
            System.out.println("Su estatura es " + height);

        }

        public void get(){
            
            System.out.println("Escribe tu nombre");
            name = cap.next();

            System.out.println("Escribe tu edad");
            age = cap.nextByte();
            
            System.out.println("Escribe tu peso");
            weight = cap.nextDouble();
            
            System.out.println("Escribe tu estatura");
            height = cap.nextDouble();
        }

}
