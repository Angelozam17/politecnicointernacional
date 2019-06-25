package pinheritance;

public class Empleado extends Persona{
    private int hoursWorked;
    
    //Constructor
    public Empleado(String name, String surname, int age){
        super(name, surname, age);  
    }
    
    //Methods
    public void setWage(int hoursWorked){
        this.hoursWorked = hoursWorked; 
    }
    
    public int getWage(){
        int wage = hoursWorked * 75000;
        return wage;
    }
    
    
    public void showData(){
        System.out.println("Hello, " + getName() + " " + getSurname() + "." + 
                       "\nYour wage this month is $" + getWage() + "\n");
    }
}
