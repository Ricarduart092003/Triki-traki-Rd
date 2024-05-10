/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Trikitrakicolores;

/**
 *
 * @author TOÑO
 */
public class Juego {

    public Jugador j1;
    public Jugador j2;
    public Tablero tab;
    public int turno;

    public void iniciarPartida(String nombre1, String color1, char ficha1, String nombre2, String color2, char ficha2, int x, int y, int turno) {

        this.manejarEntradaUsuario(nombre1, color1, ficha1, nombre2, color2, ficha2);
        this.tab = new Tablero(x, y);
        this.turno = turno;
    }

    public void finalizarPartida() {
        this.tab.mostrarTablero();
    }

    public void cambiarTurno() {
        turno++;
    }

    public void manejarEntradaUsuario(String nombre1, String color1, char ficha1, String nombre2, String color2, char ficha2) {

        this.j1 = new Jugador(nombre1, ficha1, color1);
        this.j2 = new Jugador(nombre2, ficha2, color2);
    }
}
