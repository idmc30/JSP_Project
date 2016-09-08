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
public class BeansIngresodeinsumos {
  
  private BeanInsumo insumo ;
           
  private BeanComprobante comprobante ;
          
  private Date fechareg ; 
          
  private BeanUsuario usuario ;
          
  private Double cantidad  ;
          
  private double precio ;
          
  private double stockactual ;
          
  private double stockinial   ;
          
  private Integer codingreso;
  
  
     public BeanInsumo getInsumo() {
        return insumo;
    }

    public void setInsumo(BeanInsumo insumo) {
        this.insumo = insumo;
    }

    public BeanComprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(BeanComprobante comprobante) {
        this.comprobante = comprobante;
    }


    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    public BeanUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(BeanUsuario usuario) {
        this.usuario = usuario;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getStockactual() {
        return stockactual;
    }

    public void setStockactual(double stockactual) {
        this.stockactual = stockactual;
    }

    public double getStockinial() {
        return stockinial;
    }

    public void setStockinial(double stockinial) {
        this.stockinial = stockinial;
    }

    public Integer getCodingreso() {
        return codingreso;
    }

    public void setCodingreso(Integer codingreso) {
        this.codingreso = codingreso;
    }
}
