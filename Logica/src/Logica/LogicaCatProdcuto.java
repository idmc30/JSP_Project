
package Logica;
import Bean.BeanCatProducto;
import Dao.DaoCat_producto;

public class LogicaCatProdcuto {

    DaoCat_producto dCatProducto;
    
    public void insertar (BeanCatProducto producto) throws Exception{
      dCatProducto = new DaoCat_producto();
      dCatProducto.ingresarCatProducto(producto);
    }
    
   public String modificar(BeanCatProducto wProducto) throws Exception{
       dCatProducto = new DaoCat_producto();
       String ms= dCatProducto.actualizarCatProducto(wProducto);
        return ms;
   }
   
   public Integer eliminar(int codigo) throws Exception{
       dCatProducto= new DaoCat_producto();
       Integer valor = dCatProducto.eliminarCatProducto(codigo);
       return valor;
   }
}
