package co.edu.ucc.ERICK.Singleton;

public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        banco.mostrarNombre();
        
        // Ejecutar el método getIdentidad al final
        System.out.println("Identidad en Base64: " + Banco.getIdentidad());
    }
}

