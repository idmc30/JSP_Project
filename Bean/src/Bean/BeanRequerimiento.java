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
public class BeanRequerimiento {
    private Integer codReq;
    private Integer nroReq;
    private BeanPersonal personal;
    private Date fecReq;
    private String descReq;
    private String estadoReq;
    private BeanUsuario usuario;
    private Date fecRegis;
    private String tipoReq;
    private Date fecEnvio;
    private String perAte;
    
    //get and set
    public Integer getCodReq() {
        return codReq;
    }

    public void setCodReq(Integer codReq) {
        this.codReq = codReq;
    }

    public Integer getNroReq() {
        return nroReq;
    }

    public void setNroReq(Integer nroReq) {
        this.nroReq = nroReq;
    }

    public BeanPersonal getPersonal() {
        return personal;
    }

    public void setPersonal(BeanPersonal personal) {
        this.personal = personal;
    }

    public Date getFecReq() {
        return fecReq;
    }

    public void setFecReq(Date fecReq) {
        this.fecReq = fecReq;
    }

    public String getDescReq() {
        return descReq;
    }

    public void setDescReq(String descReq) {
        this.descReq = descReq;
    }

    public String getEstadoReq() {
        return estadoReq;
    }

    public void setEstadoReq(String estadoReq) {
        this.estadoReq = estadoReq;
    }

    public BeanUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(BeanUsuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecRegis() {
        return fecRegis;
    }

    public void setFecRegis(Date fecRegis) {
        this.fecRegis = fecRegis;
    }

    public String getTipoReq() {
        return tipoReq;
    }

    public void setTipoReq(String tipoReq) {
        this.tipoReq = tipoReq;
    }

    public Date getFecEnvio() {
        return fecEnvio;
    }

    public void setFecEnvio(Date fecEnvio) {
        this.fecEnvio = fecEnvio;
    }

    public String getPerAte() {
        return perAte;
    }

    public void setPerAte(String perAte) {
        this.perAte = perAte;
    }
    
    
}
