/**
 * Autor: Erick [Nombre Completo]
 * Curso: Patrones de Diseño Orientado a Objetos
 * Universidad: UCC
 * Descripción: Implementación de patrones creacionales en Java con los requerimientos solicitados.
 */

package co.edu.ucc.ERICK.AbstractFactory;

// Producto abstracto: Cuenta
interface Cuenta {
    void abrir();
}

// Producto concreto: Cuenta Corriente
class CuentaCorriente implements Cuenta {
    @Override
    public void abrir() {
        System.out.println("Abriendo cuenta corriente.");
    }
}

// Producto concreto: Cuenta Ahorros
class CuentaAhorros implements Cuenta {
    @Override
    public void abrir() {
        System.out.println("Abriendo cuenta de ahorros.");
    }
}

// Producto abstracto: Tarjeta
interface Tarjeta {
    void emitir();
}

// Producto concreto: Tarjeta Débito
class TarjetaDebito implements Tarjeta {
    @Override
    public void emitir() {
        System.out.println("Emitiendo tarjeta de débito.");
    }
}

// Producto concreto: Tarjeta Crédito
class TarjetaCredito implements Tarjeta {
    @Override
    public void emitir() {
        System.out.println("Emitiendo tarjeta de crédito.");
    }
}

// Fábrica abstracta
interface BancoFactory {
    Cuenta crearCuenta();
    Tarjeta crearTarjeta();
}

// Fábrica concreta: Banco Popular
class BancoPopularFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaCorriente();
    }
    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaDebito();
    }
}

// Fábrica concreta: Banco Premium
class BancoPremiumFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaAhorros();
    }
    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaCredito();
    }
}

// Clase Main para probar Abstract Factory
public class Main {
    public static void main(String[] args) {
        BancoFactory banco1 = new BancoPopularFactory();
        Cuenta cuenta1 = banco1.crearCuenta();
        Tarjeta tarjeta1 = banco1.crearTarjeta();
        cuenta1.abrir();
        tarjeta1.emitir();
        
        BancoFactory banco2 = new BancoPremiumFactory();
        Cuenta cuenta2 = banco2.crearCuenta();
        Tarjeta tarjeta2 = banco2.crearTarjeta();
        cuenta2.abrir();
        tarjeta2.emitir();
        
        // Ejecutar el método getIdentidad al final
        System.out.println("Identidad en Base64: " + getIdentidad());
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Erick [Tu Apellido]";
        return java.util.Base64.getEncoder().encodeToString(nombreCompleto.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
