/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import AccesoDatos.Conexion;
import Bean.BeanCliente;
import Bean.BeanProducto;
import java.sql.ResultSet;

public class DaoProducto {

    Conexion cnn = new Conexion("org.postgresql.Driver", "jdbc:postgresql://", "127.0.0.1", "5432", "java", "postgres", "123456");

    public void ingresarProducto(BeanProducto bProducto) throws Exception {
        cnn.Conectar();
        cnn.ejecutarActualizacion("INSERT INTO producto("
                + "             catcodigo, nomprod, precprod, stockactualprod, descprod,"
                + "            estadopro, desckar)"
                + "    VALUES (" + bProducto.getCategoriaProducto().getCatCodigo() + ", '" + bProducto.getNomProd() + "', '" + bProducto.getPrecProd() + "', " + bProducto.getStockActualProd() + ", '" + bProducto.getDescProd() + "', '" + bProducto.getEstadoProd() + "',"
                + "             '" + bProducto.getDesckar() + "');");
    }

    public String actualizarProducto(BeanProducto bProducto) throws Exception {
        cnn.Conectar();
        cnn.ejecutarActualizacion("UPDATE producto"
                + "   SET catcodigo=" + bProducto.getCategoriaProducto() + ", nomprod='" + bProducto.getNomProd() + "', precprod='" + bProducto.getPrecProd() + "', stockactualprod=" + bProducto.getStockActualProd() + ", "
                + "       descprod='" + bProducto.getDescProd() + "', estadopro='" + bProducto.getEstadoProd() + "', desckar='" + bProducto.getDesckar() + "' "
                + " WHERE codprod=" + bProducto.getCodProd() + "");
        return "Successful Updated Row(s)..";
    }

    public Integer eliminarProducto(Integer codProd) throws Exception {
        cnn.Conectar();
        cnn.ejecutarActualizacion("DELETE FROM producto"
                + " WHERE codProd=" + codProd + "");
        return 1;
    }
    
       public ResultSet buscarProductoXnombre(String pNombre) throws Exception {
        cnn.Conectar();
        ResultSet rs;
        rs = cnn.ejecutarListas("Select codprod, nomprod, precprod,stockactualprod,"
                + "catcodigo from producto where cast(nomprod as text) like '"+pNombre+"%'");
        return rs;
    }
}
