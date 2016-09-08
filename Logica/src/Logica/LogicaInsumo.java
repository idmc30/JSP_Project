/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Bean.BeanInsumo;
import Dao.DaoInsumo;

/**
 *
 * @author Alumno
 */
public class LogicaInsumo {
    DaoInsumo dInsumo;
    public void insertar (BeanInsumo insumo) throws  Exception{
        dInsumo = new DaoInsumo();
        dInsumo.ingresarInsumo(insumo);       
    }
    public String modificar(BeanInsumo wInsumo) throws Exception{
        dInsumo= new DaoInsumo();
        String msj = dInsumo.actualizarInsumo(wInsumo);
        return msj;
    }
    public Integer eliminar(int insumo)throws Exception{
        dInsumo = new DaoInsumo();
        Integer valor = dInsumo.eliminarInsumo(insumo);
        return  valor;
    }

    
}
