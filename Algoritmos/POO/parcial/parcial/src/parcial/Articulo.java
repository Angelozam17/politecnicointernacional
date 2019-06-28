package parcial;

public class Articulo {
    private int /*clave,*/ cantidad;
    private String descrip;
    private double precio;
    
    
    //CONSTRUCTOR
    public Articulo(int clave, String des, int cant, double prec){
        this.descrip = des;
        this.cantidad = cant;
        /*this.clave = clave;*/
        this.precio = prec;
    }
    
    
    //SETTER
    /*public void setClave(int clave){
        this.clave = clave;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }*/
    
    
    
    //GETTER
    /*public int getClave(){
        return clave;
    }*/
    public int getCantidad() {
        return cantidad;
    }
    public String getDescrip() {
        return descrip;
    }
    public double getPrecio() {
        return precio;
    }  
    
    
    //METHODS
    public double CalcIva(){
        double IVA = 0.19;
        double CalcIva = (getPrecio() * getCantidad()) * IVA;
        
        return CalcIva;
    }
}
