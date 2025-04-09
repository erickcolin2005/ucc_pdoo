/**
 * Autor: Erick [Nombre Completo]
 * Curso: Patrones de Diseño Orientado a Objetos
 * Universidad: UCC
 * Descripción: Implementación de patrones creacionales en Java con los requerimientos solicitados.
 */

package co.edu.ucc.ERICK.Prototype;

// Prototipo
interface CuentaBancaria extends Cloneable {
    CuentaBancaria clone() throws CloneNotSupportedException;
    void mostrarInfo();
}

// Producto concreto: Cuenta de Ahorros
class CuentaAhorros implements CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaAhorros(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public CuentaBancaria clone() throws CloneNotSupportedException {
        return (CuentaAhorros) super.clone();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cuenta de Ahorros - Titular: " + titular + ", Saldo: " + saldo);
    }
}

// Clase Main para probar el patrón Prototype
public class Main {
    public static void main(String[] args) {
        try {
            CuentaAhorros cuentaOriginal = new CuentaAhorros("Juan Pérez", 5000.00);
            CuentaAhorros cuentaClonada = (CuentaAhorros) cuentaOriginal.clone();
            
            cuentaOriginal.mostrarInfo();
            cuentaClonada.mostrarInfo();
            
            // Ejecutar el método getIdentidad al final
            System.out.println("Identidad en Base64: " + getIdentidad());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Erick [Tu Apellido]";
        return java.util.Base64.getEncoder().encodeToString(nombreCompleto.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
