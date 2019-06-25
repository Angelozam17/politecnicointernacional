package pinheritance;

public class Profesor extends Persona{
    private String idProfesor;
    
    public Profesor(String name, String surname, int age){
        super(name, surname, age);
        idProfesor = null;
        
    }
    
    public void setIdProfesor(String idProfesor){
        this.idProfesor = idProfesor;
    }
    
    public String getIdProfesor(){
        return idProfesor;
    }
    
    public void showData(){
        System.out.println("Hello professor, " + getName() + " " + getSurname() + "." + 
                       "\nYour password is " + getIdProfesor() + "\n");
    }
}
