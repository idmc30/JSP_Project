
package Dao;

import AccesoDatos.Conexion;
import Bean.BeanCliente;
import Bean.BeanPersonal;
import java.sql.ResultSet;


public class DaoPersonal {
 Conexion conn = new Conexion("org.postgresql.Driver", "jdbc:postgresql://", "127.0.0.1", "5432", "java", "postgres", "123456");
public void ingresarPersonal(BeanPersonal bPersonal) throws Exception{
    conn.Conectar();
        conn.ejecutarActualizacion("INSERT INTO personal(\n" +
"nomper, apeper, dirper, estadoper, sexo, dni)"
                + "VALUES (" + bPersonal.getNomPer()+ ", " + bPersonal.getApePer() + ","
                + bPersonal.getDirPer()+ "," + bPersonal.getEstadoPer()+ "," + bPersonal.getSexo()+ ","
                + bPersonal.getDni() + ")");
    }

    
    public String actualizarPersonal(BeanPersonal bPersonal) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("UPDATE personal"
                +"SET nomper='"+bPersonal.getNomPer()+"', apeper='"+bPersonal.getApePer()+"', dirper='"+bPersonal.getDirPer()+"'"
                + ",estadoper='"+bPersonal.getEstadoPer()+", sexo='"+bPersonal.getSexo()+"', dni='"+bPersonal.getDni() 
                + " WHERE codper=" + bPersonal.getCodPer());
        return "Actualizado Correctamente";
    }
    
    public Integer eliminarPersonal(Integer codPer) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("DELETE FROM \n"
                + " WHERE codPer=" + codPer);
        return 1; //Para Personal Eliminado
    }

    public ResultSet listarPersonal() {

        return null;
    }

    public ResultSet buscarPersonal() {

        return null;
    }

    
    
    
    
    
    
    
    

}   


    
    
    
    
    
