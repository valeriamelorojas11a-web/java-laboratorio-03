public class Main {

    public static void main(String[] args) {

        System.out.println("=== PRODUCTOS (Constructor y this) ===");
        Producto primero = new Producto("Pasta Dental", 5000, 3);
        Producto segundo = new Producto("Cepillo de Dientes", 4500, 7);

        primero.mostrarDetalle();
        System.out.println("Subtotal: $" + primero.calcularSubtotal());
        System.out.println("-------------------");
        segundo.mostrarDetalle();
        System.out.println("Subtotal: $" + segundo.calcularSubtotal());

        System.out.println("\n=== EJERCICIO TERMÓMETRO ===");
        Termometro t1 = new Termometro(0);
        Termometro t2 = new Termometro(25);

        System.out.println(t1.temperaturaCelsius + " °C -> " + t1.convertirAFahrenheit() + " °F");
        System.out.println(t2.temperaturaCelsius + " °C -> " + t2.convertirAFahrenheit() + " °F");

        //  Reto Estudiantes
        System.out.println("\n=== RETO REGISTRO DE ESTUDIANTES ===");
        Estudiante est1 = new Estudiante("Carlos Pérez", "2671234", 3, 2.8);
        Estudiante est2 = new Estudiante("Valeria Gómez", "2671234", 3, 4.1);

        est1.mostrarPerfil();
        System.out.println("-------------------");
        est2.mostrarPerfil();
    }
}
