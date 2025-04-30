/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.Erick.flyweighttexto.fabrica;

import java.util.HashMap;
import java.util.Map;
import co.edu.ucc.Erick.flyweighttexto.interfaces.ILetra;
import co.edu.ucc.Erick.flyweighttexto.implementacion.LetraConcreta;

public class FabricaLetras {
    private static final Map<Character, ILetra> pool = new HashMap<>();

    public static ILetra obtenerLetra(char simbolo) {
        if (!pool.containsKey(simbolo)) {
            pool.put(simbolo, new LetraConcreta(simbolo));
        }
        return pool.get(simbolo);
    }
}

