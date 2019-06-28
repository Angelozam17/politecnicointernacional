package parcial;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Articulo art_1 = new Articulo(1234, "Jugo de mora", 10, 1500);
        System.out.println("Nombre del producto: " + art_1.getDescrip() +
                         "\nCantidad: " + art_1.getCantidad() +
                         "\nPrecio por unidad: $" + (int)art_1.getPrecio() +
                         /*"\nClave: " + art_1.getClave() +*/
                         "\nIVA: " + (int)art_1.CalcIva() +
                         "\nTotal: " + (int)((art_1.getCantidad() * art_1.getPrecio()) + art_1.CalcIva())
        );    
        
        Articulo art_2 = new Articulo(1234, "Guayaba", 10, 200);
        System.out.println("Nombre del producto: " + art_2.getDescrip() +
                         "\nCantidad: " + art_2.getCantidad() +
                         "\nPrecio por unidad: $" + (int)art_2.getPrecio() +
                         /*"\nClave: " + art_1.getClave() +*/
                         "\nIVA: " + (int)art_2.CalcIva() +
                         "\nTotal: " + (int)((art_2.getCantidad() * art_2.getPrecio()) + art_2.CalcIva())
        );
    }   
}
