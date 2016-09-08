/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author IDMC
 */
public class Conexion {

    private Connection cnx;
    private String driver;
    private String motor;
    private String ip;
    private String puerto;
    private String bd;
    private String usuario;
    private String  clave;
    private String cadenaConexion;

    public Conexion(String driver, String motor, String ip, String puerto, String bd, String usuario, String clave) {
        this.driver =""+ driver+"";
        this.motor = ""+motor+"";
        this.ip = ip;
        this.puerto = puerto;
        this.bd = bd;
        this.usuario = usuario;
        this.clave = clave;
        this.cadenaConexion=this.motor+""+this.ip+":"+this.puerto+"/"+this.bd;
    }
    
   public String Conectar() throws Exception{
       Class.forName(this.driver);
       this.cnx=DriverManager.getConnection(this.cadenaConexion, this.usuario, this.clave);
      return "CONECTADO CORRECTAMENTE";
   }

    
   public void ejecutarActualizacion(String consulta) throws Exception{
       Statement st;
       st=this.cnx.createStatement();
       st.executeUpdate(consulta);
   }
   
   public ResultSet ejecutarListas(String consulta) throws Exception{
       ResultSet rs;
       Statement st;
       st=this.cnx.createStatement();
       rs=st.executeQuery(consulta);
       return rs;
   }
    
    
    
    public Connection getCnx() {
        return cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCadenaConexion() {
        return cadenaConexion;
    }

    public void setCadenaConexion(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }
    
}
