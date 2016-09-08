package Logica;

import Bean.BeanCliente;
import Bean.BeanSucursal;
import Dao.DaoCliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LogicaCliente {
    DaoCliente dCliente;
    
    

    public void insertar(BeanCliente cliente) throws Exception {
        dCliente = new DaoCliente();
        dCliente.ingresarCliente(cliente);
    }

    public String modificar(BeanCliente wCliente) throws Exception {
        dCliente = new DaoCliente();
        String msj = dCliente.actualizarCliente(wCliente);
        return msj;
    }

    public Integer eliminar(int codigo) throws Exception {
        dCliente = new DaoCliente();
        Integer valor = dCliente.eliminarCliente(codigo);
        return valor;
    }
    
     public List<BeanCliente> listarCliente() throws Exception {
        ResultSet rs;
        dCliente = new DaoCliente();
        rs = dCliente.listarCliente();
        //Lista
        List<BeanCliente> lista =new ArrayList<BeanCliente>();
        BeanCliente bCliente;
        BeanSucursal bSucursal;
        if(rs!=null){
            while (rs.next()){
                bCliente=new BeanCliente();
                bCliente.setCodCliente(rs.getInt("codcli"));
                bCliente.setNomCli(rs.getString("nomcli"));
                bCliente.setApeCli(rs.getString("apecli"));
                bCliente.setCelCli(rs.getString("celcli"));
                bSucursal=new BeanSucursal();
                bSucursal.setCodSuc(rs.getInt("codsuc"));
                bCliente.setSucursal(bSucursal);
                lista.add(bCliente);
            }
        }
        return lista;
    }
     
     
       public BeanCliente buscarCliente(int cod) throws Exception {
        ResultSet rs;
        dCliente = new DaoCliente();
        rs = dCliente.buscarCliente(cod);
        BeanCliente bCliente=new BeanCliente();
        if(rs!=null){
            while (rs.next()){
                bCliente.setCodCliente(rs.getInt("codcli"));
                bCliente.setNomCli(rs.getString("nomcli"));
                bCliente.setApeCli(rs.getString("apecli"));
                bCliente.setDniCli(rs.getInt("dnicli"));
                bCliente.setTipoCli(rs.getString("tipocli"));
            }
        }
        return bCliente;
    }
}
