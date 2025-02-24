/**
 * Autor: Erick [Nombre Completo]
 * Curso: Programación Orientada a Objetos
 * Universidad: UCC
 * Historia de Usuario: 
 * Como cliente del banco, quiero poder transferir dinero de mi cuenta a otra cuenta, 
 * para poder realizar pagos o enviar dinero a familiares.
 */

package co.edu.ucc.ERICK.Bancos;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public boolean transferir(CuentaBancaria destino, double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            destino.saldo += monto;
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("654321", 500.0);

        cuenta1.transferir(cuenta2, 200.0);

        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
        
        // Ejecutar los métodos getIdentidad y getPatron al final
        System.out.println("Identidad en Base64: " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Erick [Tu Apellido]";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }

    // Método que retorna el patrón implementado
    public static String getPatron() {
        return "Patrón Creacional - Prototype";
    }
}
