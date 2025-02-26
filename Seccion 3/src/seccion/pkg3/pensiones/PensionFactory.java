/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.pensiones;

interface LiquidacionPension {
    double calcularPension(double salario);
}

class Ley78 implements LiquidacionPension {
    public double calcularPension(double salario) {
        return salario * 15;
    }
}

class Ley86 implements LiquidacionPension {
    public double calcularPension(double salario) {
        return salario * 5;
    }
}

class Ley98 implements LiquidacionPension {
    public double calcularPension(double salario) {
        return salario * 2.5;
    }
}

class Ley100 implements LiquidacionPension {
    public double calcularPension(double salario) {
        return salario * 10;
    }
}

class LeyPetro implements LiquidacionPension {
    public double calcularPension(double salario) {
        return Math.min(salario * 3.5, salario * 0.7);
    }
}

class PensionFactory {
    public static LiquidacionPension obtenerMetodo(String ley) {
        switch (ley) {
            case "Ley78": return new Ley78();
            case "Ley86": return new Ley86();
            case "Ley98": return new Ley98();
            case "Ley100": return new Ley100();
            case "LeyPetro": return new LeyPetro();
            default: throw new IllegalArgumentException("Ley no reconocida");
        }
    }
}

