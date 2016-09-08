package Logica;

import Bean.BeanCliente;
import Bean.BeanPersonal;
import Dao.DaoCliente;
import Dao.DaoPersonal;


public class LogicaPersonal {
DaoPersonal dPersonal;

public void insert(BeanPersonal personal) throws Exception{
    dPersonal=new DaoPersonal();
    dPersonal.ingresarPersonal(personal);
}
 public String modificar(BeanPersonal xPersonal) throws Exception {
        dPersonal = new DaoPersonal();
        String msj = dPersonal.actualizarPersonal(xPersonal);
        return msj;
    }

    public Integer eliminar(int codigo) throws Exception {
        dPersonal = new DaoPersonal();
        Integer valor = dPersonal.eliminarPersonal(codigo);
        return valor;
    }    
}
