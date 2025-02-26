/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.database;

/**
 * Singleton para manejar la conexión a la base de datos.
 */
public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Conectando a la base de datos...");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando: " + consulta);
    }
}

