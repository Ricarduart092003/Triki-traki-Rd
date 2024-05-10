/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trikitrakicolores;

/**
 *
 * @author TOÑO
 */
public class Jugador {
    
    private String nombre;
    private char ficha;
    private String color;

    public Jugador() {
    }

    public Jugador(String nombre, char ficha, String color) {
        this.nombre = nombre;
        this.color = color;
        this.ficha = ficha;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }

    public char getFicha() {
        return ficha;
    }

    public String getColor() {
        return color;
    }

    public boolean buscarJugador(char ficha) {

        return this.ficha == ficha;
    }

    
    
    
}
