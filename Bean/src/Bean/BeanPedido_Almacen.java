package Bean;

import java.sql.Date;

public class BeanPedido_Almacen {  /*pedido personal sucursal usuario*/
    private BeanPedido Pedido;
    private BeanPersonal Personal;
    private BeanSucursal Sucursal;
    private Date Fechapedalm;
    private String Estadopedalm;
    private String Descpedalm;
    private BeanUsuario Usuario;
    private Date Fechreg;
    private Integer Cantenviada;

    public BeanPedido getPedido() {
        return Pedido;
    }

    public void setPedido(BeanPedido Pedido) {
        this.Pedido = Pedido;
    }

    public BeanPersonal getPersonal() {
        return Personal;
    }

    public void setPersonal(BeanPersonal Personal) {
        this.Personal = Personal;
    }

    public BeanSucursal getSucursal() {
        return Sucursal;
    }

    public void setSucursal(BeanSucursal Sucursal) {
        this.Sucursal = Sucursal;
    }

    public Date getFechapedalm() {
        return Fechapedalm;
    }

    public void setFechapedalm(Date fechapedalm) {
        this.Fechapedalm = fechapedalm;
    }

    public String getEstadopedalm() {
        return Estadopedalm;
    }

    public void setEstadopedalm(String estadopedalm) {
        this.Estadopedalm = estadopedalm;
    }

    public String getDescpedalm() {
        return Descpedalm;
    }

    public void setDescpedalm(String descpedalm) {
        this.Descpedalm = descpedalm;
    }

    public BeanUsuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(BeanUsuario Usuario) {
        this.Usuario = Usuario;
    }

    public Date getFechreg() {
        return Fechreg;
    }

    public void setFechreg(Date Fechreg) {
        this.Fechreg = Fechreg;
    }

    public Integer getCantenviada() {
        return Cantenviada;
    }

    public void setCantenviada(Integer Cantenviada) {
        this.Cantenviada = Cantenviada;
    }
}
