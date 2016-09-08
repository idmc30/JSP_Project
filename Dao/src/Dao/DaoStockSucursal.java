/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import AccesoDatos.Conexion;
import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public class DaoStockSucursal {

    Conexion conn = new Conexion("org.postgresql.Driver", "jdbc:postgresql://", "127.0.0.1", "5432", "java", "postgres", "123456");

    public ResultSet listar() throws Exception {
        conn.Conectar();
        ResultSet rs;
        rs = conn.ejecutarListas("select ss.codsuc,s.nomsuc, ss.codprod,p.nomprod, stock , precio"
                + "from stock_sucursal ss"
                + "inner join sucursal s on ss.codsuc=s.codsuc"
                + "inner join producto p on ss.codprod=p.codprod"
                + "order by codsuc asc");
        return rs;

    }

}
