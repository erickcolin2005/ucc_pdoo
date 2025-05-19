/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia8;
import co.edu.ucc.erick.historia8.facade.AuditoriaFacade;
public class MainHistoria8 {
    public static void main(String[] args){
        AuditoriaFacade f = new AuditoriaFacade();
        f.cancelarVenta();
        f.deshacer();
    }
}


