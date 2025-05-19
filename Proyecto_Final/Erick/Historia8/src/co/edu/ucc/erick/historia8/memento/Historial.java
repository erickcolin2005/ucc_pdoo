/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ucc.erick.historia8.memento;
import java.util.ArrayDeque;
import java.util.Deque;
public class Historial {
    private final Deque<EstadoModulo> pila=new ArrayDeque<>();
    public void guardar(EstadoModulo m){ pila.push(m); }
    public EstadoModulo ultimo(){ return pila.pop(); }
}

