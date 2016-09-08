package Dao;

import AccesoDatos.Conexion;
import Bean.BeanArea;
import java.sql.ResultSet;


public class DaoArea {

    Conexion conn = new Conexion("org.postgresql.Driver", "jdbc:postgresql://", "127.0.0.1", "5432", "java", "postgres", "123456");

    public void ingresarArea(BeanArea bArea) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("INSERT INTO area("
                + "descripcion)"
                + "VALUES (" + bArea.getDescripcion()+")");
    }
    
     public String actualizarArea(BeanArea bArea) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("UPDATE area"
                + "SET descripcion=" + bArea.getDescripcion()+ ""
                + " WHERE codarea=" + bArea.getCodArea());
        return "Actualizado Correctamente";
    }
     
     public Integer eliminarArea(Integer codArea) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("DELETE FROM area\n"
                + " WHERE codarea=" + codArea);
        return 1; //Para Cliente Eliminado
    
    
}
     public ResultSet listarArea() {

        return null;
    }

    public ResultSet buscarArea() {

        return null;
    }

}
