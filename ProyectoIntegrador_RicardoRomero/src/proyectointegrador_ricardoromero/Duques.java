/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador_ricardoromero;

/**
 *
 * @author ricky
 */
public class Duques extends Piezas {

    String tipoD;

    public Duques() {
        super();
    }

    public Duques(String tipoD, String tipo) {
        super(tipo);
        this.tipoD = tipoD;
    }

    public String getTipoD() {
        return tipoD;
    }

    public void setTipoD(String tipoD) {
        this.tipoD = tipoD;
    }

    @Override
    public String toString() {
        return "Duques{" + "tipoD=" + tipoD + '}';
    }

    @Override
    public String[][] movimiento(String[][] matriz, int x, int y, int x2, int y2) {
        boolean direccion = true;
        int centinela = 0;
        if (x == x2 && y != y2) {
            //Vertical
            direccion = false;
            for (int i = y; i < y2; i++) {

                if (!matriz[x][i].contains(" ") || matriz[x][i].contains("x")) {

                } else {
                    centinela = 1;
                }
            }

            if (centinela == 0) {
                matriz[x2][y2] = matriz[x][y];
                matriz[x][y] = " ";
                return matriz;
            } else {
                System.out.println("Hay una pieza obstruyendo el movimiento!");
                return matriz;
            }
        } else if (y == y2 && x != x2) {
            //Horizontal
            for (int i = x; i < x2; i++) {

                if (!matriz[i][y].contains(" ") || matriz[x][i].contains("x")) {

                } else {
                    centinela = 1;
                }
            }

            if (centinela == 0) {
                matriz[x2][y2] = matriz[x][y];
                matriz[x][y] = " ";
                return matriz;
            } else {
                System.out.println("Hay una pieza obstruyendo el movimiento!");
                return matriz;
            }
        } else {
            System.out.println("Intento moverse diagonalmente!");
            return matriz;
        }
    }
}
