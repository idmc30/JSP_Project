<%-- 
    Document   : stockSucursal
    Created on : 09/11/2014, 11:27:03 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="jquery/jquery-1.11.1.min.js" type="text/javascript" ></script>
        <script src="jquery/jquery-migrate-1.2.1.min.js" type="text/javascript" ></script>
  <script type="text/javascript">
            function mostrarCmbSucursal() {
                $.post("cmbSucursal.cl", function(datoObtenido) {
                    $("#mostrarLista").html(datoObtenido);
                });
            }
            
            function mostraListadoProductoLike(nombre){
                $.post("listarProductoLike.cl","txtNombreProducto="+nombre,function(datoObtenido){
                    $("#mostrarListaProducto").html(datoObtenido);
                });
            }
            
</script>
    </head>
    <body onload="mostrarCmbSucursal()" >
        
        
        <div id="mostrarLista"></div>
        
        <label> Nombre de producto </label>
        <input type="text" id="txtNombre" name="txtNombre" value="" onkeyup="mostraListadoProductoLike(this.value)" />
        <div id="mostrarListaProducto"></div>
    </body>
</html>
