/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Trikitrakicolores;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yull.ramirez
 */
public class TableroTest {

    public TableroTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mostrarTablero method, of class Tablero.
     */
    @Test
    public void testMostrarTablero() {

        System.out.println("mostrarTablero");

        //Cambiar para tableros de 4x4 o 5x5
        int x = 3;
        int y = 3;

        Tablero instance = new Tablero(x, y);
        instance.mostrarTablero();

        char[][] tab = new char[x][y];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = ' ';
            }
        }
        assertArrayEquals(tab, instance.getTablero());
    }

    /**
     * Test of verificarEmpate method, of class Tablero.
     */
    @Test
    public void testVerificarEmpate() {
        System.out.println("verificarEmpate");
        int x = 3;
        int y = 3;

        Tablero instance = new Tablero(x, y);
        instance.mostrarTablero();

        instance.colocarFicha(0, 0, 'X');
        instance.colocarFicha(0, 1, 'O');
        instance.colocarFicha(0, 2, 'X');
        instance.colocarFicha(1, 0, 'X');
        instance.colocarFicha(1, 1, 'O');
        instance.colocarFicha(1, 2, 'X');
        instance.colocarFicha(2, 0, 'O');
        instance.colocarFicha(2, 1, 'X');
        instance.colocarFicha(2, 2, 'O');
        

        boolean expResult = true;
        boolean result = instance.verificarEmpate();

        assertEquals(expResult, result);
    }

    /**
     * Test of verificarGanador method, of class Tablero.
     */
    @Test
    public void testVerificarGanador() {
        System.out.println("verificarGanador");
        int x = 3;
        int y = 3;
        Tablero instance = new Tablero(x, y);
        instance.mostrarTablero();
        char ficha = 'X';

        instance.colocarFicha(0, 0, ficha);
        instance.colocarFicha(1, 1, ficha);
        instance.colocarFicha(2, 2, ficha);

        boolean expResult = true;
        boolean result = instance.verificarGanador(ficha);
        assertEquals(expResult, result);
    }

    /**
     * Test of colocarFicha method, of class Tablero.
     */
    @Test
    public void testColocarFicha() {
        System.out.println("colocarFicha");
        int fila = 3;
        int columna = 3;
        char ficha = 'X';
        
        Tablero instance = new Tablero(fila, columna);
        instance.mostrarTablero();
        
        boolean expResult = false;
        boolean result = instance.colocarFicha(0, 0, ficha);
        
        char fichaaux = instance.getTablero()[0][0];
        
        assertEquals(ficha, fichaaux);

    }

}
