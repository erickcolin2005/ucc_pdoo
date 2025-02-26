/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.vehiculos;

interface Vehiculo {
    void conducir();
}

class CarroElectrico implements Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo un carro eléctrico");
    }
}

class CarroGasolina implements Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo un carro a gasolina");
    }
}

class VehiculoFactory {
    public static Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("electrico")) return new CarroElectrico();
        else if (tipo.equalsIgnoreCase("gasolina")) return new CarroGasolina();
        return null;
    }
}

