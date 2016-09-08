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
public class BeanInsumo {
    private Integer codigo;
    private String nomInsumo;
    private Double cantInsumo;
    private Date fechaVcmto;
    private String unidMed;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomInsumo() {
        return nomInsumo;
    }

    public void setNomInsumo(String nomInsumo) {
        this.nomInsumo = nomInsumo;
    }

    public Double getCantInsumo() {
        return cantInsumo;
    }

    public void setCantInsumo(Double cantInsumo) {
        this.cantInsumo = cantInsumo;
    }

    public Date getFechaVcmto() {
        return fechaVcmto;
    }

    public void setFechaVcmto(Date fechaVcmto) {
        this.fechaVcmto = fechaVcmto;
    }

    public String getUnidMed() {
        return unidMed;
    }

    public void setUnidMed(String unidMed) {
        this.unidMed = unidMed;
    }
    
    
}
