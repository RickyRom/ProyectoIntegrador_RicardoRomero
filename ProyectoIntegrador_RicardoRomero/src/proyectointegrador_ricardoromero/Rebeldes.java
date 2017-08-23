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
public class Rebeldes extends Piezas{
    String tipoR2;

    public Rebeldes() {
    }

    public Rebeldes(String tipoR2, String tipo) {
        super(tipo);
        this.tipoR2 = tipoR2;
    }

    public String getTipoR2() {
        return tipoR2;
    }

    public void setTipoR2(String tipoR2) {
        this.tipoR2 = tipoR2;
    }

    @Override
    public String toString() {
        return "Rebeldes{" + "tipoR2=" + tipoR2 + '}';
    }
    
    @Override
    public String[][] movimiento(String[][] matriz, int x, int y, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
