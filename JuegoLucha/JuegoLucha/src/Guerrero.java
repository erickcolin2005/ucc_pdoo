
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        int bonificacion = 5; // más daño fijo
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO + bonificacion;
        oponente.recibirDano(dano);
        System.out.println(nombre + " (Guerrero) golpea brutalmente a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}

