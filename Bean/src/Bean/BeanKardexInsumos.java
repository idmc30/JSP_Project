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
public class BeanKardexInsumos {
    
  private Integer   codKardex;
  private BeanInsumo codigodeInsumos;
  private double cantentrada;
  private double cantsalida;
  private double stockactual;
  private String descripkar;
  private Date fecha;

    public Integer getCodkardex() {
        return codKardex;
    }

    public void setCodkardex(Integer codkardex) {
        this.codKardex = codkardex;
    }

    public BeanInsumo getCodins() {
        return codigodeInsumos;
    }

    public void setCodins(BeanInsumo codins) {
        this.codigodeInsumos = codins;
    }

  

    public double getCantentrada() {
        return cantentrada;
    }

    public void setCantentrada(double cantentrada) {
        this.cantentrada = cantentrada;
    }

    public double getCantsalida() {
        return cantsalida;
    }

    public void setCantsalida(double cantsalida) {
        this.cantsalida = cantsalida;
    }

    public double getStockactual() {
        return stockactual;
    }

    public void setStockactual(double stockactual) {
        this.stockactual = stockactual;
    }

    public String getDescripkar() {
        return descripkar;
    }

    public void setDescripkar(String descripkar) {
        this.descripkar = descripkar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
  
  
  
  
    
}
