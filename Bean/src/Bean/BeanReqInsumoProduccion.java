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
public class BeanReqInsumoProduccion {
    
    private BeanRatiosProduccion ratiosProduccion;
    private double cantReq;
    private BeanRequerimiento requerimiento;

    public BeanRatiosProduccion getRatiosProduccion() {
        return ratiosProduccion;
    }

    public void setRatiosProduccion(BeanRatiosProduccion ratiosProduccion) {
        this.ratiosProduccion = ratiosProduccion;
    }

    public double getCantReq() {
        return cantReq;
    }

    public void setCantReq(double cantReq) {
        this.cantReq = cantReq;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }
    
    
}
