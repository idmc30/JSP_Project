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
public class BeanDetalleComprobanteComp {
    
    private BeanComprobante comprobante;
    private BeanCotizacion cotizacion;
    private BeanRequerimiento requerimiento;
    private BeanOrdenCompra ordenCompra;
    private BeanProveedor proveedor;
    private Date fechaRecep;
    private BeanUsuario usuario;

    public BeanComprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(BeanComprobante comprobante) {
        this.comprobante = comprobante;
    }

    public BeanCotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(BeanCotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public BeanOrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(BeanOrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public BeanProveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(BeanProveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFechaRecep() {
        return fechaRecep;
    }

    public void setFechaRecep(Date fechaRecep) {
        this.fechaRecep = fechaRecep;
    }

    public BeanUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(BeanUsuario usuario) {
        this.usuario = usuario;
    }
    
         
    
}
