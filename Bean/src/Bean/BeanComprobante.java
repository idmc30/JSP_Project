
package Bean;

import java.sql.Date;

public class BeanComprobante {
    private Integer Codcomp;     
    private String Tipocomp;
    private String Ser_comp;
    private Integer Num_comp;
    private double Monto_total;
    private String Estado;
    private BeanUsuario Usuario;
    private  Date Fechareg;
    private String Descomp;
    private BeanSucursal Sucursal;
    private BeanCliente Cliente;
    private String Tipodoc;
    private BeanPedido Pedido;

    public Integer getCodcomp() {
        return Codcomp;
    }

    public void setCodcomp(Integer Codcomp) {
        this.Codcomp = Codcomp;
    }

    public String getTipocomp() {
        return Tipocomp;
    }

    public void setTipocomp(String Tipocomp) {
        this.Tipocomp = Tipocomp;
    }

    public String getSer_comp() {
        return Ser_comp;
    }

    public void setSer_comp(String Ser_comp) {
        this.Ser_comp = Ser_comp;
    }

    public Integer getNum_comp() {
        return Num_comp;
    }

    public void setNum_comp(Integer Num_comp) {
        this.Num_comp = Num_comp;
    }

    public double getMonto_total() {
        return Monto_total;
    }

    public void setMonto_total(double Monto_total) {
        this.Monto_total = Monto_total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public BeanUsuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(BeanUsuario Usuario) {
        this.Usuario = Usuario;
    }

    public Date getFechareg() {
        return Fechareg;
    }

    public void setFechareg(Date Fechareg) {
        this.Fechareg = Fechareg;
    }

    public String getDescomp() {
        return Descomp;
    }

    public void setDescomp(String Descomp) {
        this.Descomp = Descomp;
    }

    public BeanSucursal getSucursal() {
        return Sucursal;
    }

    public void setSucursal(BeanSucursal Sucursal) {
        this.Sucursal = Sucursal;
    }

    public BeanCliente getCliente() {
        return Cliente;
    }

    public void setCliente(BeanCliente Cliente) {
        this.Cliente = Cliente;
    }

    public String getTipodoc() {
        return Tipodoc;
    }

    public void setTipodoc(String Tipodoc) {
        this.Tipodoc = Tipodoc;
    }

    public BeanPedido getPedido() {
        return Pedido;
    }

    public void setPedido(BeanPedido Pedido) {
        this.Pedido = Pedido;
    }

   
}
