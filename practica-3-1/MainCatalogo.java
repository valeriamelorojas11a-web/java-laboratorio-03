public class MainCatalogo {

    public static void main(String[] args) {
        
        Producto p1 = new Producto();
        p1.nombre = "Pasta Dental";
        p1.precio = 5000;
        p1.cantidad = 2;

        Producto p2 = new Producto();
        p2.nombre = "Cepillo de Dientes";
        p2.precio = 4500;
        p2.cantidad = 3;

        Producto p3 = new Producto();
        p3.nombre = "Hilo Dental";
        p3.precio = 2000;
        p3.cantidad = 1;

        System.out.println("=== CATÁLOGO DE PRODUCTOS ===");
        p1.mostrarDetalle();
        double sub1 = p1.calcularSubtotal();
        System.out.println("Subtotal: $" + sub1);
        System.out.println("-------------------");

        p2.mostrarDetalle();
        double sub2 = p2.calcularSubtotal();
        System.out.println("Subtotal: $" + sub2);
        System.out.println("-------------------");

        p3.mostrarDetalle();
        double sub3 = p3.calcularSubtotal();
        System.out.println("Subtotal: $" + sub3);
        System.out.println("-------------------");

        
        double valorTotal = sub1 + sub2 + sub3;
        System.out.println("VALOR TOTAL DEL CATÁLOGO: $" + valorTotal);
    }
}