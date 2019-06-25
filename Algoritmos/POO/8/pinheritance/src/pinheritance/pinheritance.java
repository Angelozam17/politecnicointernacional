package pinheritance;

public class pinheritance {
    public static void main(String[] args){
        Profesor profesor_1 = new Profesor("Angelo", "Zambrano", 21);
        profesor_1.setIdProfesor("01234");
        profesor_1.showData();
        
        Empleado empleado_1 = new Empleado("Felipe", "Fonseca", 29);
        empleado_1.setWage(48);
        empleado_1.showData();
        
        Estudiante estudiante_1 = new Estudiante("Mauricio", "Avila", 32);
        estudiante_1.setCareer("Systems Engineer");
        estudiante_1.showData();
    }
}
