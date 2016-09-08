

package Bean;

import java.sql.Date;


public class BeanSalidaProductosProduccion {
    
    private BeanProducto producto;
    private Integer cantidad;
    private BeanRequerimiento requerimiento;
    private Date fechapp;
    private boolean confRecep;
    private Date fechaRecep;
    private Integer cantFaxEnv;
    private Integer cantTotal;

    public BeanProducto getProducto() {
        return producto;
    }

    public void setProducto(BeanProducto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BeanRequerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(BeanRequerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public Date getFechapp() {
        return fechapp;
    }

    public void setFechapp(Date fechapp) {
        this.fechapp = fechapp;
    }

    public boolean isConfRecep() {
        return confRecep;
    }

    public void setConfRecep(boolean confRecep) {
        this.confRecep = confRecep;
    }

    public Date getFechaRecep() {
        return fechaRecep;
    }

    public void setFechaRecep(Date fechaRecep) {
        this.fechaRecep = fechaRecep;
    }

    public Integer getCantFaxEnv() {
        return cantFaxEnv;
    }

    public void setCantFaxEnv(Integer cantFaxEnv) {
        this.cantFaxEnv = cantFaxEnv;
    }

    public Integer getCantTotal() {
        return cantTotal;
    }

    public void setCantTotal(Integer cantTotal) {
        this.cantTotal = cantTotal;
    }

}
