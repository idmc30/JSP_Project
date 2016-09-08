/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

/**
 *
 * @author Administrador
 */
public class BeanRatiosProduccion {
    private BeanProduccion produccion;
    private BeanInsumo insumo;
    private double cantCom;
    private Integer codRatioProd;

    public BeanProduccion getProduccion() {
        return produccion;
    }

    public void setProduccion(BeanProduccion produccion) {
        this.produccion = produccion;
    }

    public BeanInsumo getInsumo() {
        return insumo;
    }

    public void setInsumo(BeanInsumo insumo) {
        this.insumo = insumo;
    }

    public double getCantCom() {
        return cantCom;
    }

    public void setCantCom(double cantCom) {
        this.cantCom = cantCom;
    }

    public Integer getCodRatioProd() {
        return codRatioProd;
    }

    public void setCodRatioProd(Integer codRatioProd) {
        this.codRatioProd = codRatioProd;
    }
    
    
}
