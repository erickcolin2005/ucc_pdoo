/**
 * Autor: Erick [Nombre Completo]
 * Curso: Patrones de Diseño Orientado a Objetos
 * Universidad: UCC
 * Descripción: Implementación de patrones creacionales en Java con los requerimientos solicitados.
 */

package co.edu.ucc.ERICK.FactoryMethod;

// Producto abstracto
interface Medicamento {
    void administrar();
}

// Producto concreto: Analgésico
class Analgesico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando analgésico para el dolor.");
    }
}

// Producto concreto: Antibiótico
class Antibiotico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando antibiótico para la infección.");
    }
}

// Factory Method
abstract class Farmacia {
    abstract Medicamento crearMedicamento();
}

// Fabricante concreto: Farmacia de analgésicos
class FarmaciaAnalgesicos extends Farmacia {
    @Override
    Medicamento crearMedicamento() {
        return new Analgesico();
    }
}

// Fabricante concreto: Farmacia de antibióticos
class FarmaciaAntibioticos extends Farmacia {
    @Override
    Medicamento crearMedicamento() {
        return new Antibiotico();
    }
}

// Clase Main para probar Factory Method
public class Main {
    public static void main(String[] args) {
        Farmacia farmacia1 = new FarmaciaAnalgesicos();
        Medicamento medicamento1 = farmacia1.crearMedicamento();
        medicamento1.administrar();
        
        Farmacia farmacia2 = new FarmaciaAntibioticos();
        Medicamento medicamento2 = farmacia2.crearMedicamento();
        medicamento2.administrar();
        
        // Ejecutar el método getIdentidad al final
        System.out.println("Identidad en Base64: " + getIdentidad());
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Erick [Tu Apellido]";
        return java.util.Base64.getEncoder().encodeToString(nombreCompleto.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
