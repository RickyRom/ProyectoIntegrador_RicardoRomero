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
public class Duques extends Piezas{
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
