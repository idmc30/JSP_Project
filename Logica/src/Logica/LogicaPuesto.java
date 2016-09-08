/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Bean.BeanCliente;
import Bean.BeanPuesto;
import Dao.DaoCliente;
import Dao.DaoPuesto;

/**
 *
 * @author Alumno
 */
public class LogicaPuesto {
    DaoPuesto dPuesto;

    public void insertar(BeanPuesto puesto) throws Exception {
        dPuesto = new DaoPuesto();
        dPuesto.ingresarPuesto(puesto);
    }

    public String modificar(BeanPuesto wPuesto) throws Exception {
        dPuesto = new DaoPuesto();
        String msj = dPuesto.actualizarPuesto(wPuesto);
        return msj;
    }

    public Integer eliminar(int codigo) throws Exception {
        dPuesto = new DaoPuesto();
        Integer valor = dPuesto.eliminarPuesto(codigo);
        return valor;
    }
    
    
    
    
}
