/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class BeanOrdenCompra {

    private Integer codOrdCompra;
    private Integer numOrdCompra;
    private BeanProveedor proveedor;
    private BeanRequerimiento requerimiento;
    private BeanCotizacion cotizacion;
    private Double montoOrdenCompra;
    private Date fechaOrdenCompra;
    private String estOrdenCompra;
    private String dsctoCotizacion;
    private BeanUsuario usuario;
    private Date fechaAtencion;
    private String montoAnual;
    private Date fechaAnual;

    public Integer getCodOrdCompra() {
        return codOrdCompra;
    }

    public void setCodOrdCompra(Integer codOrdCompra) {
        this.codOrdCompra = codOrdCompra;
    }

    public Integer getNumOrdCompra() {
        return numOrdCompra;
    }

    public void setNumOrdCompra(Integer numOrdCompra) {
        this.numOrdCompra = numOrdCompra;
    }

    public BeanProveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(BeanProveedor proveedor) {
        this.proveedor = proveedor;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public BeanCotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(BeanCotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Double getMontoOrdenCompra() {
        return montoOrdenCompra;
    }

    public void setMontoOrdenCompra(Double montoOrdenCompra) {
        this.montoOrdenCompra = montoOrdenCompra;
    }

    public Date getFechaOrdenCompra() {
        return fechaOrdenCompra;
    }

    public void setFechaOrdenCompra(Date fechaOrdenCompra) {
        this.fechaOrdenCompra = fechaOrdenCompra;
    }

    public String getEstOrdenCompra() {
        return estOrdenCompra;
    }

    public void setEstOrdenCompra(String estOrdenCompra) {
        this.estOrdenCompra = estOrdenCompra;
    }

    public String getDsctoCotizacion() {
        return dsctoCotizacion;
    }

    public void setDsctoCotizacion(String dsctoCotizacion) {
        this.dsctoCotizacion = dsctoCotizacion;
    }

    public BeanUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(BeanUsuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getMontoAnual() {
        return montoAnual;
    }

    public void setMontoAnual(String montoAnual) {
        this.montoAnual = montoAnual;
    }

    public Date getFechaAnual() {
        return fechaAnual;
    }

    public void setFechaAnual(Date fechaAnual) {
        this.fechaAnual = fechaAnual;
    }
    
    
}
