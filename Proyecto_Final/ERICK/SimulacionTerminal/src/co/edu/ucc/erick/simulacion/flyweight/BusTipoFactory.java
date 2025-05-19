/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.simulacion.flyweight;
import java.util.HashMap;
import java.util.Map;
public class BusTipoFactory {
    private static final Map<String,BusTipo> pool=new HashMap<>();
    public static BusTipo get(String m,String mo,int c){
        return pool.computeIfAbsent(m+mo+c,k->new BusTipo(m,mo,c));
    }
}

