/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * HORA ACTUAL: 10:45 - 08/04/2025
 * UNIVERSIDAD COOPERATIVA DE COLOMBIA
 * Erick Collin Albornoz Hernandez
 * usuario git: erickcolin2005
 * repositorio: ucc_pdoo
 * Historia de Usuario:
 * Como administrador de servidores, necesito representar carpetas y archivos
 * en una estructura jerárquica para recorrer y gestionar todo el sistema de
 * almacenamiento de forma uniforme.
 */

package co.edu.ucc.Erick.compositearchivos;

import java.util.Base64;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainCompositeArchivos {
    public static void main(String[] args) {
        imprimirEncabezado();

        Carpeta raiz = new Carpeta("Documentos");
        Carpeta proyectos = new Carpeta("Proyectos");
        Carpeta fotos = new Carpeta("Fotos");

        Archivo archivo1 = new Archivo("Curriculum.pdf");
        Archivo archivo2 = new Archivo("proyecto1.docx");
        Archivo archivo3 = new Archivo("familia.jpg");

        proyectos.agregar(archivo2);
        fotos.agregar(archivo3);

        raiz.agregar(archivo1);
        raiz.agregar(proyectos);
        raiz.agregar(fotos);

        raiz.mostrar();

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

