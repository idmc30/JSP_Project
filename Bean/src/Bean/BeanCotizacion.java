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
public class BeanCotizacion {
    private int codCot;
    private BeanRequerimiento requerimiento;
    private BeanProveedor proveedor;
    private int numeroCot;
    private Date fecCot;
    private String estadoCot;
    private String descCot;
    private double montoCot;
    private BeanUsuario usuario;
    private String motAnual;
    private Date fecAnual;

    public int getCodCot() {
        return codCot;
    }

    public void setCodCot(int codCot) {
        this.codCot = codCot;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public BeanProveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(BeanProveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumeroCot() {
        return numeroCot;
    }

    public void setNumeroCot(int numeroCot) {
        this.numeroCot = numeroCot;
    }

    public Date getFecCot() {
        return fecCot;
    }

    public void setFecCot(Date fecCot) {
        this.fecCot = fecCot;
    }

    public String getEstadoCot() {
        return estadoCot;
    }

    public void setEstadoCot(String estadoCot) {
        this.estadoCot = estadoCot;
    }

    public String getDescCot() {
        return descCot;
    }

    public void setDescCot(String descCot) {
        this.descCot = descCot;
    }

    public double getMontoCot() {
        return montoCot;
    }

    public void setMontoCot(double montoCot) {
        this.montoCot = montoCot;
    }

    public BeanUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(BeanUsuario usuario) {
        this.usuario = usuario;
    }

    public String getMotAnual() {
        return motAnual;
    }

    public void setMotAnual(String motAnual) {
        this.motAnual = motAnual;
    }

    public Date getFecAnual() {
        return fecAnual;
    }

    public void setFecAnual(Date fecAnual) {
        this.fecAnual = fecAnual;
    }
    
    
    
    
    
    
   

    

 
    
    
 
    
}
