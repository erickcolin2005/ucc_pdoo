/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * HORA ACTUAL: 10:55 - 08/04/2025
 * UNIVERSIDAD COOPERATIVA DE COLOMBIA
 * Erick Collin Albornoz Hernandez
 * usuario git: erickcolin2005
 * repositorio: ucc_pdoo
 * Historia de Usuario:
 * Como diseñador de interfaz, quiero crear menús que puedan tener submenús y opciones,
 * y que puedan recorrerse uniformemente sin importar su nivel.
 */

package co.edu.ucc.Erick.compositemenuweb;

import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainCompositeMenuWeb {
    public static void main(String[] args) {
        imprimirEncabezado();

        Menu menuPrincipal = new Menu("Inicio");
        Menu menuUsuario = new Menu("Usuario");
        Menu menuConfiguracion = new Menu("Configuración");

        Opcion opcionPerfil = new Opcion("Perfil");
        Opcion opcionCerrarSesion = new Opcion("Cerrar Sesión");
        Opcion opcionIdioma = new Opcion("Idioma");
        Opcion opcionTema = new Opcion("Tema Oscuro");

        menuUsuario.agregar(opcionPerfil);
        menuUsuario.agregar(opcionCerrarSesion);

        menuConfiguracion.agregar(opcionIdioma);
        menuConfiguracion.agregar(opcionTema);

        menuPrincipal.agregar(menuUsuario);
        menuPrincipal.agregar(menuConfiguracion);

        menuPrincipal.mostrar();

        System.out.println("\nIdentidad (Base64): " + getIdentidad());
        System.out.println("Patrón aplicado: " + getPatron());
    }

    public static void imprimirEncabezado() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm - dd/MM/yyyy");
        String horaActual = LocalDateTime.now().format(formatter);

        System.out.println("HORA ACTUAL: " + horaActual);
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");
        System.out.println("Erick Collin Albornoz Hernandez");
        System.out.println("usuario git: erickcolin2005");
        System.out.println("repositorio: ucc_pdoo\n");
    }

    public static String getIdentidad() {
        String nombre = "Erick Collin Albornoz Hernandez";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Composite";
    }
}
