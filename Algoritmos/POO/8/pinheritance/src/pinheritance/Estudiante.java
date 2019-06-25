package pinheritance;

public class Estudiante extends Persona{
    private String career; 
    
    //Constructor
    public Estudiante(String name, String surname, int age){
        super(name, surname, age); 
        career = null;
    }
    
    public void setCareer(String career){
        this.career = career;
    }
    
    public String getCareer(){
        return career;
    }
    
    public void showData(){
        System.out.println("Hello student, " + getName() + " " + getSurname() + "." + 
                       "\nYour career is " + getCareer() + ".\n");
    }
}
