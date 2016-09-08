/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import Bean.BeanSucursal;
import Dao.DaoSucursal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class LogicaSucursal {
    DaoSucursal dSucursal;

    public void insertar(BeanSucursal sucursal) throws Exception {
        dSucursal = new DaoSucursal();
        dSucursal.ingresarSucursal(sucursal);
    }

    public String modificar(BeanSucursal mSucursal) throws Exception {
        dSucursal = new DaoSucursal();
        String msj = dSucursal.actualizarSucursal(mSucursal);
        return msj;
    }

    public Integer eliminar(int cod_sucursal) throws Exception {
        dSucursal = new DaoSucursal();
        Integer valor = dSucursal.eliminarSucursal(cod_sucursal);
        return valor;
    }
    
         public List<BeanSucursal> listarSucursal() throws Exception {
        ResultSet rs;
        dSucursal = new DaoSucursal();
        rs = dSucursal.listar();
        List<BeanSucursal> lista =new ArrayList<BeanSucursal>();
        BeanSucursal bSucursal;
        if(rs!=null){
            while (rs.next()){
                bSucursal=new BeanSucursal();
                bSucursal.setCodSuc(rs.getInt("codsuc"));
                bSucursal.setNomSuc(rs.getString("nomsuc"));
                bSucursal.setDirSuc(rs.getString("dirsuc"));
                bSucursal.setSerieFactSuc(rs.getString("seriefactsuc"));
                bSucursal.setSerieBolSuc(rs.getString("seriebolsuc"));
                bSucursal.setEstadoSuc(rs.getString("estadosuc"));
                bSucursal.setSerieNota(rs.getString("serienota"));
                lista.add(bSucursal);
            }
        }
        return lista;
    }
     
}
