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
        if ((x >= 0 && x <= 18 && y >= 0 && y <= 18) && (x2 >= 0 && x2 <= 18 && y2 >= 0 && y2 <= 18)) {
            boolean direccion = true;
            int centinela = 0;
            if (x == x2 && y != y2) {
                //H
                direccion = false;
                for (int i = y + 1; i < y2; i++) {
                    if (matriz[x][i].contains("•") || matriz[x][i].contains("x") || matriz[x][i].contains("o") || matriz[x][i].contains("▫")) {
                        centinela = 1;
                    } else {

                    }
                }
                if (centinela == 0) {
                    if (matriz[x2][y2].contains("x")) {
                        System.out.println("No puede moverse hacia una x");
                        return matriz;
                    } else {
                        if (x2 >= 2 && x2 <= 16 || y2 >= 2 && y2 <= 16) {
                            matriz[x2][y2] = matriz[x][y];
                            matriz[x][y] = " ";
                            if (matriz[x2 + 1][y2].contains("•") && matriz[x2 + 2][y2].contains("o") || matriz[x2 + 2][y2].contains("▫")) {
                                matriz[x2 + 1][y2] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else if (matriz[x2 - 1][y2].contains("•") && matriz[x2 - 2][y2].contains("o")) {
                                matriz[x2 - 1][y2] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else if (matriz[x2][y2 + 1].contains("•") && matriz[x2][y2 + 2].contains("o")) {
                                matriz[x2][y2 + 1] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else if (matriz[x2][y2 - 1].contains("•") && matriz[x2][y2 - 2].contains("o")) {
                                matriz[x2][y2 - 1] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else {
                                return matriz;
                            }
                        } else {
                            matriz[x2][y2] = matriz[x][y];
                            matriz[x][y] = " ";
                            return matriz;
                        }
                    }
                } else {
                    System.out.println("Obstrucción en el paso");
                    return matriz;
                }
            } else if (y == y2 && x != x2) {
                //V
                for (int i = x + 1; i < x2; i++) {
                    if (matriz[i][y].contains("•") || matriz[i][y].contains("x") || matriz[i][y].contains("o") || matriz[i][y].contains("▫")) {
                        centinela = 1;
                    } else {

                    }
                }

                if (centinela == 0) {
                    if (matriz[x2][y2].contains("x")) {
                        System.out.println("No puede moverse hacia una x");
                        return matriz;
                    } else {
                        if (x2 >= 2 && x2 <= 16 || y2 >= 2 && y2 <= 16) {
                            matriz[x2][y2] = matriz[x][y];
                            matriz[x][y] = " ";
                            if (matriz[x2 + 1][y2].contains("•") && matriz[x2 + 2][y2].contains("o") || matriz[x2 + 2][y2].contains("▫")) {
                                matriz[x2 + 1][y2] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else if (matriz[x2 - 1][y2].contains("•") && matriz[x2 - 2][y2].contains("o")) {
                                matriz[x2 - 1][y2] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else if (matriz[x2][y2 + 1].contains("•") && matriz[x2][y2 + 2].contains("o")) {
                                matriz[x2][y2 + 1] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else if (matriz[x2][y2 - 1].contains("•") && matriz[x2][y2 - 2].contains("o")) {
                                matriz[x2][y2 - 1] = " ";
                                System.out.println("Capturaste un Rebelde");
                                return matriz;
                            } else {
                                return matriz;
                            }
                        } else {
                            matriz[x2][y2] = matriz[x][y];
                            matriz[x][y] = " ";
                            return matriz;
                        }
                    }
                } else {
                    System.out.println("Obstrucción en el paso");
                    return matriz;
                }
            } else {
                System.out.println("No se puede mover en Diagonal ó muevase a una x");
                return matriz;
            }
        } else {
            System.out.println("Se Salió del Rango!");
            return matriz;
        }
    }
}
