import java.util.Scanner;

public class MainCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double n2 = scanner.nextDouble();
        Calculadora calc = new Calculadora(n1, n2);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + calc.sumar());
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());
        
        if (n2 != 0) {
            System.out.println("División: " + calc.dividir());
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }

        scanner.close();
    }
}