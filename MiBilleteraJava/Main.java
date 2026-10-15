import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la billetera: ");
        String nombre = scanner.nextLine();

        Billetera miBilletera = new Billetera(nombre);
        int opcion = 0;

        do {
            System.out.println("\n=== MENÚ MI BILLETERA ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Registrar ingreso");
            System.out.println("3. Registrar gasto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Titular: " + miBilletera.getTitular());
                    System.out.println("Saldo actual: $" + miBilletera.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    double ingreso = scanner.nextDouble();
                    if (miBilletera.registrarIngreso(ingreso)) {
                        System.out.println("¡Ingreso exitoso!");
                    } else {
                        System.out.println("Error: El valor debe ser mayor a cero.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a gastar: ");
                    double gasto = scanner.nextDouble();
                    if (miBilletera.registrarGasto(gasto)) {
                        System.out.println("¡Gasto registrado con éxito!");
                    } else {
                        System.out.println("Error: Fondos insuficientes o valor inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Sueltando aplicación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}