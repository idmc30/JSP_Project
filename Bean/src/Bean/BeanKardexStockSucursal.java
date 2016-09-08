/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bean;

import java.sql.Date;

/**
 *
 * @author Alumno
 */
public class BeanKardexStockSucursal {
    private BeanSucursal sucursal;
    private BeanPedido pedido;
    private BeanProducto producto;
    private Integer cantidadEn;
    private Double precioEn;
    private Double precioSal;
    private String descStock;
    private Date fecha;
    private Integer cantSal;
    private Integer saldoCant;
    private Double saldoValorun;
    private Double saldoCostot;
    private Double costoTalent;
    private Double costoTalsal;
    private Integer codStockSuc;
    private BeanComprobante comprobante;
    
    //get and set
    public BeanSucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(BeanSucursal sucursal) {
        this.sucursal = sucursal;
    }

    public BeanPedido getPedido() {
        return pedido;
    }

    public void setPedido(BeanPedido pedido) {
        this.pedido = pedido;
    }

    public BeanProducto getProducto() {
        return producto;
    }

    public void setProducto(BeanProducto producto) {
        this.producto = producto;
    }

    public Integer getCantidadEn() {
        return cantidadEn;
    }

    public void setCantidadEn(Integer cantidadEn) {
        this.cantidadEn = cantidadEn;
    }

    public Double getPrecioEn() {
        return precioEn;
    }

    public void setPrecioEn(Double precioEn) {
        this.precioEn = precioEn;
    }

    public Double getPrecioSal() {
        return precioSal;
    }

    public void setPrecioSal(Double precioSal) {
        this.precioSal = precioSal;
    }

    public String getDescStock() {
        return descStock;
    }

    public void setDescStock(String descStock) {
        this.descStock = descStock;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCantSal() {
        return cantSal;
    }

    public void setCantSal(Integer cantSal) {
        this.cantSal = cantSal;
    }

    public Integer getSaldoCant() {
        return saldoCant;
    }

    public void setSaldoCant(Integer saldoCant) {
        this.saldoCant = saldoCant;
    }

    public Double getSaldoValorun() {
        return saldoValorun;
    }

    public void setSaldoValorun(Double saldoValorun) {
        this.saldoValorun = saldoValorun;
    }

    public Double getSaldoCostot() {
        return saldoCostot;
    }

    public void setSaldoCostot(Double saldoCostot) {
        this.saldoCostot = saldoCostot;
    }

    public Double getCostoTalent() {
        return costoTalent;
    }

    public void setCostoTalent(Double costoTalent) {
        this.costoTalent = costoTalent;
    }

    public Double getCostoTalsal() {
        return costoTalsal;
    }

    public void setCostoTalsal(Double costoTalsal) {
        this.costoTalsal = costoTalsal;
    }

    public Integer getCodStockSuc() {
        return codStockSuc;
    }

    public void setCodStockSuc(Integer codStockSuc) {
        this.codStockSuc = codStockSuc;
    }

    public BeanComprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(BeanComprobante comprobante) {
        this.comprobante = comprobante;
    }
    
}
