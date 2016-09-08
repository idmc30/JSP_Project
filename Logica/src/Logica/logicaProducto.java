/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Bean.BeanCatProducto;
import Bean.BeanProducto;
import Bean.BeanProducto;
import Dao.DaoProducto;
import Dao.DaoProducto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class logicaProducto {

    DaoProducto dProducto;

    public void insertar(BeanProducto bProducto) throws Exception {
        dProducto = new DaoProducto();
        dProducto.ingresarProducto(bProducto);
    }

    public String actualizar(BeanProducto wProducto) throws Exception {
        dProducto = new DaoProducto();
        String msje = dProducto.actualizarProducto(wProducto);
        return msje;
    }

    public Integer eliminar(int codigo) throws Exception {
        dProducto = new DaoProducto();
        int valor = dProducto.eliminarProducto(codigo);
        return valor;
    }
    
        public List<BeanProducto> listarProductoXnombre(String pNombre) throws Exception {
        ResultSet rs;
        dProducto = new DaoProducto();
        rs = dProducto.buscarProductoXnombre(pNombre);
        List<BeanProducto> lista =new ArrayList<BeanProducto>();
        BeanProducto bProducto;
        BeanCatProducto bCategoria;
        if(rs!=null){
            while (rs.next()){
                bProducto=new BeanProducto();
                bProducto.setCodProd(rs.getInt("codprod"));
                bProducto.setNomProd(rs.getString("nomprod"));
                bProducto.setPrecProd(rs.getDouble("precprod"));
                bCategoria=new BeanCatProducto();
                bCategoria.setCatCodigo(rs.getInt("catcodigo"));
                bProducto.setCategoriaProducto(bCategoria);
                lista.add(bProducto);
            }
        }
        return lista;
    }
}
