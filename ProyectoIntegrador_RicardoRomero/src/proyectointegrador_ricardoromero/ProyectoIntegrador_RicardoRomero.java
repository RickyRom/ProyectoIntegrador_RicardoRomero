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
public class ProyectoIntegrador_RicardoRomero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String table[][] = new String[19][19];
        Matriz(imprimematriz(table, 0, 0));
    }

    public static String[][] imprimematriz(String matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz.length - 1) {
            return matriz;
        } else {
            if (cols == matriz.length - 1) {
                return imprimematriz(matriz, filas + 1, 0);
            } else {
                return imprimematriz(matriz, filas, cols + 1);
            }
        }
    }

    public static void Matriz(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == 1) || (i == 1 && j == 0) || (i == 1 && j == 1) || (i == 0 && j == 17)
                        || (i == 0 && j == 18) || (i == 1 && j == 17) || (i == 1 && j == 18) || (i == 17 && j == 0) || (i == 17 && j == 1)
                        || (i == 18 && j == 0) || (i == 18 && j == 1) || (i == 17 && j == 17) || (i == 17 && j == 18) || (i == 18 && j == 18)
                        || (i == 18 && j == 17) || (i == 18 / 2 && j == 18 / 2)) {
                    System.out.print("[x]");
                } else if ((i == 0 && j == 2) || (i == 0 && j == 5) || (i == 0 && j == 16) || (i == 0 && j == 13) || (i == 2 && j == 0) || (i == 2 && j == 5) || (i == 2 && j == 18) || (i == 2 && j == 13) || (i == 5 && j == 0)
                        || (i == 16 && j == 0) || (i == 13 && j == 0) || (i == 2 && j == 18) || (i == 5 && j == 18) || (i == 16 && j == 18) || (i == 13 && j == 18) || (i == 16 && j == 5) || (i == 16 && j == 13) || (i == 18 && j == 13)
                        || (i == 18 && j == 5) || (i == 18 && j == 16) || (i == 18 && j == 2) || (i == 13 && j == 16) || (i == 13 && j == 2) || (i == 5 && j == 16) || (i == 5 && j == 2) || (i == 3 && j == 9) || (i == 3 && j == 11)
                        || (i == 4 && j == 12) || (i == 5 && j == 13) || (i == 6 && j == 14) || (i == 7 && j == 15) || (i == 3 && j == 7) || (i == 4 && j == 6) || (i == 5 && j == 5) || (i == 6 && j == 4) || (i == 7 && j == 3)
                        || (i == 9 && j == 3) || (i == 11 && j == 3) || (i == 12 && j == 4) || (i == 13 && j == 5)
                        || (i == 14 && j == 6) || (i == 15 && j == 7) || (i == 15 && j == 9) || (i == 15 && j == 11)
                        || (i == 14 && j == 12) || (i == 13 && j == 13) || (i == 12 && j == 14) || (i == 11 && j == 15) || (i == 9 && j == 15)) {
                    System.out.print("[•]");
                    //•)
                } else if ((i == 4 && j == 8) || (i == 4 && j == 10) || (i == 6 && j == 9) || (i == 7 && j == 8) || (i == 7 && j == 10) || (i == 8 && j == 7)
                        || (i == 8 && j == 11) || (i == 9 && j == 6) || (i == 9 && j == 12) || (i == 10 && j == 11) || (i == 10 && j == 7)
                        || (i == 11 && j == 8) || (i == 11 && j == 10) || (i == 12 && j == 9) || (i == 14 && j == 10) || (i == 14 && j == 8)
                        || (i == 8 && j == 4) || (i == 10 && j == 4) || (i == 8 && j == 14) || (i == 10 && j == 14) || (i == 8 && j == 4)
                        || (i == 9 && j == 8) || (i == 9 && j == 10) || (i == 10 && j == 9) || (i == 8 && j == 9)) {
                    System.out.print("[o]");
                } else {
                    x[i][j] = " ";
                    System.out.print("[" + x[i][j] + "]");
                }
            }
            System.out.println(" ");
        }
    }
}