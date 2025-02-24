/**
 * Autor: Erick [Nombre Completo]
 * Curso: Patrones de Diseño Orientado a Objetos
 * Universidad: UCC
 * Descripción: Implementación de patrones creacionales en Java con los requerimientos solicitados.
 */

package co.edu.ucc.ERICK.Builder;

// Producto: Paciente
class Paciente {
    private String nombre;
    private int edad;
    private String diagnostico;

    private Paciente(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.diagnostico = builder.diagnostico;
    }

    public void mostrarInfo() {
        System.out.println("Paciente: " + nombre + ", Edad: " + edad + ", Diagnóstico: " + diagnostico);
    }

    // Clase Builder
    public static class Builder {
        private String nombre;
        private int edad;
        private String diagnostico;

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder setDiagnostico(String diagnostico) {
            this.diagnostico = diagnostico;
            return this;
        }

        public Paciente build() {
            return new Paciente(this);
        }
    }
}

// Clase Main para probar el patrón Builder
public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente.Builder()
                .setNombre("Juan Pérez")
                .setEdad(30)
                .setDiagnostico("Hipertensión")
                .build();
        
        paciente1.mostrarInfo();
        
        // Ejecutar el método getIdentidad al final
        System.out.println("Identidad en Base64: " + getIdentidad());
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Erick [Tu Apellido]";
        return java.util.Base64.getEncoder().encodeToString(nombreCompleto.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
