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
public class BeanProduccion {
    private Integer codProduccion;
    private BeanProducto producto;
    private Integer cantReq;
    private Integer cantSal;
    private Integer cantProduccion;
    private Integer stockParcial;
    private Date fecha;
    private String descripcion;
    private BeanRequerimiento requerimiento;
    private Integer cantreqalma;
    private Integer stockTotal;

    public Integer getCodProduccion() {
        return codProduccion;
    }

    public void setCodProduccion(Integer codProduccion) {
        this.codProduccion = codProduccion;
    }

    public BeanProducto getProducto() {
        return producto;
    }

    public void setProducto(BeanProducto producto) {
        this.producto = producto;
    }

    public Integer getCantReq() {
        return cantReq;
    }

    public void setCantReq(Integer cantReq) {
        this.cantReq = cantReq;
    }

    public Integer getCantSal() {
        return cantSal;
    }

    public void setCantSal(Integer cantSal) {
        this.cantSal = cantSal;
    }

    public Integer getCantProduccion() {
        return cantProduccion;
    }

    public void setCantProduccion(Integer cantProduccion) {
        this.cantProduccion = cantProduccion;
    }

    public Integer getStockParcial() {
        return stockParcial;
    }

    public void setStockParcial(Integer stockParcial) {
        this.stockParcial = stockParcial;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public Integer getCantreqalma() {
        return cantreqalma;
    }

    public void setCantreqalma(Integer cantreqalma) {
        this.cantreqalma = cantreqalma;
    }

    public Integer getStockTotal() {
        return stockTotal;
    }

    public void setStockTotal(Integer stockTotal) {
        this.stockTotal = stockTotal;
    }  
}