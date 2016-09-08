/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import AccesoDatos.Conexion;
import Bean.BeanCliente;
import Bean.BeanPuesto;

/**
 *
 * @author Alumno
 */
public class DaoPuesto {
    Conexion conn = new Conexion("org.postgresql.Driver", "jdbc:postgresql://", "127.0.0.1", "5432", "java", "postgres", "123456");

    public void ingresarPuesto(BeanPuesto bPuesto) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("INSERT INTO puesto("
              +"  descripcion)"
                + "VALUES (" + bPuesto.getDescripcionPuesto() + ")");
    }
    
     public String actualizarPuesto(BeanPuesto bPuesto) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("UPDATE puesto"
                + "SET descripcion=" + bPuesto.getDescripcionPuesto()+ ""
                + " WHERE codpuesto=" + bPuesto.getCodPuesto());
        return "Actualizado Correctamente";
    }

    public Integer eliminarPuesto(Integer codPuesto) throws Exception {
        conn.Conectar();
        conn.ejecutarActualizacion("DELETE FROM puesto\n"
                + " WHERE codpuesto=" + codPuesto);
        return 1; //Para Cliente Eliminado
    }
}
