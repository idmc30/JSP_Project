/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import java.sql.Date;

/**
 *
 * @author Administrador
 */
public class BeanSalida_insumo {

  
  private BeanInsumo insumo ;
  private double cantsal ;
  private BeanRequerimiento requerimiento ;
  private Date fechasal ;
  private double cantfaxenv ;
  private double canttotal ;
  private boolean confrecep ;
  private Date fecharecep ;
  
    public BeanInsumo getInsumo() {
        return insumo;
    }

    public void setInsumo(BeanInsumo insumo) {
        this.insumo = insumo;
    }

    public double getCantsal() {
        return cantsal;
    }

    public void setCantsal(double cantsal) {
        this.cantsal = cantsal;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public Date getFechasal() {
        return fechasal;
    }

    public void setFechasal(Date fechasal) {
        this.fechasal = fechasal;
    }

    public double getCantfaxenv() {
        return cantfaxenv;
    }

    public void setCantfaxenv(double cantfaxenv) {
        this.cantfaxenv = cantfaxenv;
    }

    public double getCanttotal() {
        return canttotal;
    }

    public void setCanttotal(double canttotal) {
        this.canttotal = canttotal;
    }

    public boolean isConfrecep() {
        return confrecep;
    }

    public void setConfrecep(boolean confrecep) {
        this.confrecep = confrecep;
    }

    public Date getFecharecep() {
        return fecharecep;
    }

    public void setFecharecep(Date fecharecep) {
        this.fecharecep = fecharecep;
    }
     
}
