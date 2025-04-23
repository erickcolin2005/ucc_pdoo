/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.ejercicio7;

import java.util.ArrayList;
import java.util.List;


public class MedicalRecord implements Cloneable {
    private String paciente;
    private List<String> notas;

    public MedicalRecord(String paciente) {
        this.paciente = paciente;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(String nota) {
        notas.add(nota);
    }

    public List<String> getNotas() {
        return notas;
    }

    @Override
    public MedicalRecord clone() {
        try {
            MedicalRecord copia = (MedicalRecord) super.clone();
            // Clonar la lista para no compartir referencias
            copia.notas = new ArrayList<>(this.notas);
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("No debería fallar", e);
        }
    }

    @Override
    public String toString() {
        return "Historial de " + paciente + ":\n  Notas: " + notas;
    }
}

