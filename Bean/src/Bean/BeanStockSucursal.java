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

public class BeanStockSucursal {

 private  BeanSucursal  sucursal;
 private  BeanProducto producto;
 private  Integer stock ;
 private  double precio ;

    public BeanSucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(BeanSucursal sucursal) {
        this.sucursal = sucursal;
    }

    public BeanProducto getProducto() {
        return producto;
    }

    public void setProducto(BeanProducto producto) {
        this.producto = producto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  
    
    
    
    
    
}
