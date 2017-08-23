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
public class Rey extends Piezas{
    String tipoR;

    public Rey() {
        super();
    }

    public Rey(String tipoR, String tipo) {
        super(tipo);
        this.tipoR = tipoR;
    }

    public String getTipoR() {
        return tipoR;
    }

    public void setTipoR(String tipoR) {
        this.tipoR = tipoR;
    }

    @Override
    public String toString() {
        return "Rey{" + "tipoR=" + tipoR + '}';
    }
    
    
    
    @Override
    public String[][] movimiento(String[][] matriz, int x, int y, int x2, int y2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
