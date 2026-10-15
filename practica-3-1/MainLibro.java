public class MainLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Satanas";
        libro1.autor = "Mario Mendoza";
        libro1.paginas = 417;

        Libro libro2 = new Libro();
        libro2.titulo = "La Odisea";
        libro2.autor = "Homer";
        libro2.paginas = 96;

        System.out.println("=== FICHA LIBRO 1 ===");
        libro1.mostrarFicha();
        
        System.out.println("\n=== FICHA LIBRO 2 ===");
        libro2.mostrarFicha();
    }
}