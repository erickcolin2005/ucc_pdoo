/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.factory;

public class FabricaPrestamo {
    public static Prestamo obtenerPrestamo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "hipotecario":
                return new PrestamoHipotecario();
            case "automotriz":
                return new PrestamoAutomotriz();
            case "personal":
                return new PrestamoPersonal();
            default:
                throw new IllegalArgumentException("Tipo de préstamo no válido");
        }
    }
}
