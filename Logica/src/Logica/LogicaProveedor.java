

package Logica;

import Bean.BeanProveedor;
import Dao.DaoProveedor;

public class LogicaProveedor {
    DaoProveedor dProveedor;
    
     public void insertar(BeanProveedor inProveedor) throws Exception {
        dProveedor = new DaoProveedor();
        dProveedor.ingresarProveedor(inProveedor);
    }

    public String modificar(BeanProveedor moProveedor) throws Exception {
       dProveedor = new DaoProveedor();
        String msj = dProveedor.actualizarProveedor( moProveedor);
        return msj;
    }

    public Integer eliminar(int codigo) throws Exception {
        dProveedor = new DaoProveedor();
        Integer valor = dProveedor.eliminarProveedor(codigo);
        return valor;
    }

    
    
}
