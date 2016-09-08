

package Bean;

import java.sql.Date;




public class BeanPedido {
    private Integer codPed;
    private double imporPed;
    private Date fechaPed;
    private BeanCliente Cliente;
    private String estadoPe;
    private BeanUsuario usuario;
    private Date fechaPeg;
    private String descrp;
    private String tipoPedido;
    private BeanPersonal personal;
    private BeanSucursal sucursal;
    private String perAte;
    private Integer ticket;

    public Integer getCodPed() {
        return codPed;
    }

    public void setCodPed(Integer codPed) {
        this.codPed = codPed;
    }

    public double getImporPed() {
        return imporPed;
    }

    public void setImporPed(double imporPed) {
        this.imporPed = imporPed;
    }

    public Date getFechaPed() {
        return fechaPed;
    }

    public void setFechaPed(Date fechaPed) {
        this.fechaPed = fechaPed;
    }

    public BeanCliente getCliente() {
        return Cliente;
    }

    public void setCliente(BeanCliente Cliente) {
        this.Cliente = Cliente;
    }

    public String getEstadoPe() {
        return estadoPe;
    }

    public void setEstadoPe(String estadoPe) {
        this.estadoPe = estadoPe;
    }

    public BeanUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(BeanUsuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPeg() {
        return fechaPeg;
    }

    public void setFechaPeg(Date fechaPeg) {
        this.fechaPeg = fechaPeg;
    }

    public String getDescrp() {
        return descrp;
    }

    public void setDescrp(String descrp) {
        this.descrp = descrp;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public BeanPersonal getPersonal() {
        return personal;
    }

    public void setPersonal(BeanPersonal personal) {
        this.personal = personal;
    }

    public BeanSucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(BeanSucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getPerAte() {
        return perAte;
    }

    public void setPerAte(String perAte) {
        this.perAte = perAte;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }
}