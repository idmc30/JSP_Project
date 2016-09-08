
package Bean;


public class BeanDetalle_Comprabante_Ven {
   private  BeanComprobante Comprobante;
   private  BeanProducto Producto;
   private Integer cantidad;
   private double precio;
   private boolean confr;

    public BeanComprobante getComprobante() {
        return Comprobante;
    }

    public void setComprobante(BeanComprobante Comprobante) {
        this.Comprobante = Comprobante;
    }

    public BeanProducto getProducto() {
        return Producto;
    }

    public void setProducto(BeanProducto Producto) {
        this.Producto = Producto;
    }

   
    

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isConfr() {
        return confr;
    }

    public void setConfr(boolean confr) {
        this.confr = confr;
    }
   
   
   
   
    
    
    
    
}
