package AccesoDatos;

import java.sql.ResultSet;

public class VerificarConexion {


    public static void main(String[] args) throws Exception {
        Conexion conn=new Conexion("org.postgresql.Driver","jdbc:postgresql://","127.0.0.1","5432","java","postgres","123456");
         System.out.println(conn.Conectar());
      
//      conn.ejecutarActualizacion("INSERT INTO colegio( nombre, fechacreacion)" +
//            "VALUES ('COLEGIO SAN JOSae', '2014-09-14')");
        
//       ResultSet  res=conn.ejecutarListas("select codigo, nombre, fechacreacion from colegio");
//       
//       while(res.next()){
//           System.out.println(res.getInt("codigo") +" nombre :" 
//                   + res.getString("nombre") + " fecha : " 
//                   + res.getDate("fechacreacion"));
//       }
      
      
              
             
    }
    
}
