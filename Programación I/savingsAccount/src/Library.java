
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author politecnico
 */
public class Library {
    private String name, author;
    private int id;
    private String[] libros = new String[5]; 
    
    
    
    
    //CONSTRUCTOR
    public Library(){
            libros[0] = "Harry Potter";
            libros[1] = "Naruto";
            libros[2] = "FullMetal";
            libros[3] = "Biblia";
            libros[4] = "Detrás del último";
    
    }
    
    public Library(String name, String author) {
        this.name = name;
        this.author = author;   

    }
    
    //METHODS
    public void prestamo(){
        String libro;
        libro = JOptionPane.showInputDialog("¿Qué libro quieres?").toLowerCase();
        
        for (int i = 0; i < libros.length; i++){ 
            if (libros[i].toLowerCase().equals(libro)) {
                JOptionPane.showMessageDialog(null, "Tienes suerte, el libro "+ libro +" está disponible.");
            }
        }
    }
    
    public void devolucion(){
        String libro;
        libro = JOptionPane.showInputDialog("¿Qué libro deseas devolver?").toLowerCase();
        
        JOptionPane.showMessageDialog(null, "Tu libro "+ libro +" ha sido entregado exitosamente.");
        
    }
    
    
    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
