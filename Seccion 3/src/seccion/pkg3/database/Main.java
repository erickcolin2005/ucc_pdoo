/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion.pkg3.database;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.ejecutarConsulta("SELECT * FROM pedidos");
    }
}


