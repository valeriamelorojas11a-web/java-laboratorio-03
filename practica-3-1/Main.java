
public class Main {

    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.nombre = "Pasta Dental";
        producto.precio = 5000;
        producto.cantidad = 3;

        Producto segundo = new Producto();
        segundo.nombre = "Cepillo de Dientes";
        segundo.precio = 4500;
        segundo.cantidad = 7;

    
        producto.mostrarDetalle();
        System.out.println("Subtotal primero: $" + producto.calcularSubtotal());
        
        System.out.println("-------------------");
        
        segundo.mostrarDetalle();
        System.out.println("Subtotal segundo: $" + segundo.calcularSubtotal());
    }
}