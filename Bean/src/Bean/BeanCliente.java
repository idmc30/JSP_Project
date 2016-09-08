/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

public class BeanCliente {

    private Integer codCliente;
    private String nomCli;
    private String apeCli;
    private String celCli;
    private String dirCli;
    private String emailCli;
    private Integer dniCli;
    private String tipoCli;
    private String rucCli;
    private String razonCocial;
    private String sexo;
    private Integer telefono;
    private BeanSucursal sucursal;

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getCelCli() {
        return celCli;
    }

    public void setCelCli(String celCli) {
        this.celCli = celCli;
    }

    public String getDirCli() {
        return dirCli;
    }

    public void setDirCli(String dirCli) {
        this.dirCli = dirCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public Integer getDniCli() {
        return dniCli;
    }

    public void setDniCli(Integer dniCli) {
        this.dniCli = dniCli;
    }

    public String getTipoCli() {
        return tipoCli;
    }

    public void setTipoCli(String tipoCli) {
        this.tipoCli = tipoCli;
    }

    public String getRucCli() {
        return rucCli;
    }

    public void setRucCli(String rucCli) {
        this.rucCli = rucCli;
    }

    public String getRazonCocial() {
        return razonCocial;
    }

    public void setRazonCocial(String razonCocial) {
        this.razonCocial = razonCocial;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public BeanSucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(BeanSucursal sucursal) {
        this.sucursal = sucursal;
    }
}