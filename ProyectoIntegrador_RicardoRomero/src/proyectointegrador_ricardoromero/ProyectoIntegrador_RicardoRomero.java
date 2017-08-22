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
        String table [][] = new String[19][19];
        Matriz(imprimematriz(table,0,0));
    }
    public static String[][] imprimematriz(String matriz [][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz.length - 1) {
            return matriz;
        }else{
            if (cols == matriz.length - 1) {
                return imprimematriz(matriz, filas + 1, 0);
            }else{
                return imprimematriz(matriz, filas, cols + 1);
            }
        }
    }
    
    public static void Matriz(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("[x]");
                }else{
                    x[i][j] = " ";
                    System.out.print("[" + x[i][j] + "]");
                }
            }
            System.out.println(" ");
        }
    }
}
