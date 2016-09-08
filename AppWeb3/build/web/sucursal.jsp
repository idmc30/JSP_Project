<%-- 
    Document   : sucursal
    Created on : 30/10/2014, 04:00:46 PM
    Author     : Pecsa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SUCURSAL</title>
    </head>
    <body>
        <h1>FORMULARIO SUCURSAL</h1>
        <form method="Post" id="frm" name="frm" action="registrarSucursal.cl">
           <label>Sucursal</label>
            <input type="text" name="txtNomSucursal" id="txtNomSucursal" >
            <br><br>
            <label>Dirección</label>
            <input type="text" name="txtDirSucursal" id="txtDirSucursal" >
            <br><br>
             <label>Factura Sucursal</label>
            <input type="text" name="txtFactSucursal" id="txtFactSucursal" />
            <br><br>
            <label>Boleta Sucursal</label>
            <input type="text" name="txtBolSucursal" id="txtBolSucursal" />
            <br><br>
            <label>Estado Sucursal</label>
            <select id="cmbEst" name="cmbEst">
                <option value="ACTIVO">Activo</option>
                <option value="INACTIVO">Inactivo</option>
            </select>
            <br><br>
            <label>Nota</label>
            <input type="text" name="txtNotaSucursal" id="txtNotaSucursal" />
            <br><br>
            <label>Nº Factura</label>
            <input type="text" name="txtNumFactSuc" id="txtNumFactSuc" />
            <br><br>
            <label>Nº Boleta</label>
            <input type="text" name="txtNumBolSuc" id="txtNumBolSuc" />
            <br><br>
            <label>Nº Ticket</label>
            <input type="text" name="txtNumTicSuc" id="txtNumTicSuc" />
            <br><br>
            <input type="submit" id="btnRegistrar" name="btnRegistrar" value="Registrar"/>
        </form>
    </body>
</html>
