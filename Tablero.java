/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trikitrakicolores;

import javax.swing.JOptionPane;

/**
 *
 * @author TOÑO
 */
public class Tablero {

    private char[][] tablero;

    public Tablero(int x, int y) {
        tablero = new char[x][y];
        this.mostrarTablero();
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void mostrarTablero() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean verificarGanador(char ficha) {

        // Comprobar filas y columnas
        for (int i = 0; i < this.tablero.length; i++) {
            boolean ganadorFila = true;
            boolean ganadorColumna = true;
            for (int j = 0; j < this.tablero.length; j++) {
                if (tablero[i][j] != ficha) {
                    ganadorFila = false;
                }
                if (tablero[j][i] != ficha) {
                    ganadorColumna = false;
                }
            }
            if (ganadorFila || ganadorColumna) {
                return true;
            }
        }

        // Comprobar diagonales
        boolean ganadorDiagonalPrincipal = true;
        boolean ganadorDiagonalSecundaria = true;
        for (int i = 0; i < this.tablero.length; i++) {
            if (tablero[i][i] != ficha) {
                ganadorDiagonalPrincipal = false;
            }
            if (tablero[i][this.tablero.length - 1 - i] != ficha) {
                ganadorDiagonalSecundaria = false;
            }
        }
        if (ganadorDiagonalPrincipal || ganadorDiagonalSecundaria) {
            return true;
        }
        return false;
    }

    public boolean colocarFicha(int fila, int columna, char ficha) {
        tablero[fila][columna] = ficha;

        if (verificarGanador(ficha)) {
            JOptionPane.showMessageDialog(null, "Partida Finalizada, el ganador ha sido el jugador con la ficha: " + ficha);
            return true;
        } else if (verificarEmpate()) {
            JOptionPane.showMessageDialog(null, "La partida ha quedado empatada");
            return true;
        }

        return false;

    }

}
