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
public class BeanKardexProductosAlmacen {
    
    private Integer codKardexPro;
    private BeanProducto producto;
    private Integer cantEntrada;
    private Integer cantSalida;
    private Integer stockActual;
    private String descripKar;
    private BeanRequerimiento requerimiento;
    private BeanSucursal sucursal;
    private Date fecha;
    private BeanPedido pedido;

    public Integer getCodKardexPro() {
        return codKardexPro;
    }

    public void setCodKardexPro(Integer codKardexPro) {
        this.codKardexPro = codKardexPro;
    }

    public BeanProducto getProducto() {
        return producto;
    }

    public void setProducto(BeanProducto producto) {
        this.producto = producto;
    }

    public Integer getCantEntrada() {
        return cantEntrada;
    }

    public void setCantEntrada(Integer cantEntrada) {
        this.cantEntrada = cantEntrada;
    }

    public Integer getCantSalida() {
        return cantSalida;
    }

    public void setCantSalida(Integer cantSalida) {
        this.cantSalida = cantSalida;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public String getDescripKar() {
        return descripKar;
    }

    public void setDescripKar(String descripKar) {
        this.descripKar = descripKar;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public BeanSucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(BeanSucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BeanPedido getPedido() {
        return pedido;
    }

    public void setPedido(BeanPedido pedido) {
        this.pedido = pedido;
    }
    
   
    
}
