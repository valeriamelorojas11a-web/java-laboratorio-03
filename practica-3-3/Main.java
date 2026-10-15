public class Main {

    public static void main(String[] args) {
        Billetera billetera = new Billetera("Valentina");

        boolean primera = billetera.registrarIngreso(100000);
        boolean segunda = billetera.registrarIngreso(-5000);

        System.out.println("Primer ingreso ($100.000): " + primera);
        System.out.println("Segundo ingreso ($-5.000): " + segunda);
        System.out.println("Saldo actual: $" + billetera.getSaldo());

    
        boolean gastoValido = billetera.registrarGasto(30000);
        boolean gastoInvalido = billetera.registrarGasto(90000);

        System.out.println("\nGasto de $30.000: " + gastoValido);
        System.out.println("Gasto de $90.000 (excede saldo): " + gastoInvalido);
        System.out.println("Saldo final: $" + billetera.getSaldo());
    }
}