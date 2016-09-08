/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Bean.BeanArea;
import Dao.DaoArea;


/**
 *
 * @author Administrador
 */
public class LogicaArea {
    
     DaoArea dArea;

    public void insertar(BeanArea area) throws Exception {
        dArea = new DaoArea();
        dArea.ingresarArea(area);
    }

    public String modificar(BeanArea mArea) throws Exception {
        dArea = new DaoArea();
        String msj = dArea.actualizarArea(mArea);
        return msj;
    }

    public Integer eliminar(int cod_area) throws Exception {
        dArea = new DaoArea();
        Integer valor = dArea.eliminarArea(cod_area);
        return valor;
    }
}
