package pinheritance;

public class Persona {
    private String name, surname;
    private int age;
    
    //Constructor
    public Persona(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    //Methods
    //getters
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public int getAge(){
        return age;
    }
    
}



