/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import AccesoDatos.Conexion;
import Bean.BeanProveedor;
import java.sql.ResultSet;

/**
 *
 * @author Alumno
 */
public class DaoProveedor {
    
    
        Conexion conn=new Conexion("org.postgresql.Driver","jdbc:postgresql://","127.0.0.1","5432","java","postgres","123");

   
    public void ingresarProveedor(BeanProveedor bProveedor) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("   INSERT INTO proveedor("
                + "razsocialprov, contacprov, telprov, dirprov, celrpmprov, rucprov)"
                + "VALUES ('" + bProveedor.getRazonSocial()+"', '"+bProveedor.getContacProv()+"', '"
                +bProveedor.getTelProv()+"', '"+bProveedor.getDirProv()+"', '"
                +bProveedor.getCelProv()+"', '"+bProveedor.getRucProv()+ "')      ");
    }

    public String actualizarProveedor(BeanProveedor bProveedor) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("UPDATE proveedor"
                + "SET razsocialprov= '" + bProveedor.getRazonSocial()+"',"
                + " contacprov= '" + bProveedor.getContacProv() +"', "
                + "telprov= '" + bProveedor.getTelProv() + "', "
                + "dirprov= '" + bProveedor.getDirProv() + "',"
                + "celrpmprov= '" + bProveedor.getCelProv()+ "',"
                + "rucprov= '" + bProveedor.getRucProv()+ "',"
                + " WHERE codprov= " + bProveedor.getCodProv()+"");
        return "Actualizado Correctamente";
    }

    public Integer eliminarProveedor(Integer codProv) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("DELETE FROM proveedor\n"
                + " WHERE codprov=" + codProv);
        return 1;
    }
//
//    public ResultSet listarProveedor() throws Exception {
//
//        conn.Conectar();
//        ResultSet res = conn.ejecutarListas("SELECT codprov, razsocialprov, contacprov, telprov, "
//                + "dirprov, celrpmprov, rucprov  FROM proveedor");
//
//        return res;
//    }
//    
    

    
    public ResultSet ListarProveedor() throws Exception {
        conn.Conectar();
        ResultSet rs;
        rs = conn.ejecutarListas("SELECT codprov, razsocialprov, contacprov, telprov,"
               + "dirprov, celrpmprov, rucprov  FROM proveedor order by codprov asc");
        return rs;
        
        
        
    }

    public ResultSet buscarProveedor(int cod) throws Exception {//Devuelve una fila
        conn.Conectar();
        ResultSet rs;
        rs = conn.ejecutarListas("SELECT codprov, razsocialprov, contacprov, telprov,"
               + "dirprov, celrpmprov, rucprov  FROM proveedor where codprov=" + cod);
        return rs;
    }

    public ResultSet buscarProveedor2(String contacprov) throws Exception {
        conn.Conectar();
        ResultSet rs;
        rs = conn.ejecutarListas("SELECT codprov, razsocialprov, contacprov, telprov,"
               + "dirprov, celrpmprov, rucprov  FROM proveedor  where contacprov like '" + contacprov + "%'");
        return rs;
    }

          
    
    
    
}
