/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.ejercicio5;

public class Auto {
    private final String motor;
    private final String audio;
    private final boolean sensoresProximidad;

    private Auto(Builder builder) {
        this.motor = builder.motor;
        this.audio = builder.audio;
        this.sensoresProximidad = builder.sensoresProximidad;
    }

    public static class Builder {
        private String motor = "gasolina";                
        private String audio = "estándar";                
        private boolean sensoresProximidad = false;       

        public Builder conMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public Builder conAudio(String audio) {
            this.audio = audio;
            return this;
        }

        public Builder conSensoresProximidad(boolean sensores) {
            this.sensoresProximidad = sensores;
            return this;
        }

        public Auto build() {
            return new Auto(this);
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
               "motor='" + motor + '\'' +
               ", audio='" + audio + '\'' +
               ", sensoresProximidad=" + sensoresProximidad +
               '}';
    }
}
