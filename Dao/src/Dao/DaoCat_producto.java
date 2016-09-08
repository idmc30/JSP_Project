
package Dao;

import AccesoDatos.Conexion;
import Bean.BeanCatProducto;
import java.sql.ResultSet;

public class DaoCat_producto {
     Conexion conn = new Conexion("org.postgresql.Driver", "jdbc:postgresql://", "127.0.0.1", "5432", "java", "postgres", "123456");

public void ingresarCatProducto(BeanCatProducto bCatProducto) throws Exception{
    conn.Conectar();
    conn.ejecutarActualizacion("INSERT INTO cat_producto("
            +"cat_descripcion)"
            +"VALUES ("+bCatProducto.getCatDescripcion()+")");

}
public String actualizarCatProducto(BeanCatProducto bCatProducto) throws Exception{
    conn.Conectar();
    conn.ejecutarActualizacion("UPDATE cat_producto"
   +"SET cat_descripcion="+bCatProducto.getCatDescripcion()+""
   +"WHERE catcodigo="+bCatProducto.getCatCodigo());
     return "Actualizado Correctamente";
}

public Integer eliminarCatProducto(Integer catCodigo )throws Exception{
    conn.Conectar();
    conn.ejecutarActualizacion("DELETE FROM cat_producto\n"
    +"WHERE catcodigo="+catCodigo);
         return 1;
    
}
public ResultSet listarcatProducto() {

        return null;
    }

    public ResultSet buscarCatProducto() {

        return null;
    }

}
