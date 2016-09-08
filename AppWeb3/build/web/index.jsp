<%-- 
    Document   : index
    Created on : 26/10/2014, 10:47:37 AM
    Author     : Alumno
--%>

<%@page import="java.util.List"%>
<%@page import="Bean.BeanCliente"%>
<%@page import="Logica.LogicaCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FORMULARIO</title>

        <link type="text/css" rel="stylesheet" href="css/style.css" />
        <script src="jquery/jquery-1.11.1.min.js" type="text/javascript" ></script>
        <script src="jquery/jquery-migrate-1.2.1.min.js" type="text/javascript" ></script>

        <script type="text/javascript">
            function eliminar(cod){
                $.post("eliminarCliente.cl","eliminar="+cod, function (datosObtenidos){
                    alert(datosObtenidos);
                    mostrar();
                });
            }
            
            function mostrar() {
                $.post("listarCliente.cl", function(datoObtenido) {
                    $("#mostraLista").html(datoObtenido);
                });
            }

            function registrarDatosAjax() {
                $.post("registrarCliente.cl", "cmbTipo=" + $("#cmbTipo").val()
                        + "&txtNombre=" + $("#txtNombre").val() + "&txtApellido=" + $("#txtApellido").val() + "&txtDni=" + $("#txtDni").val()
                +"&txtCodigo="+$("#txtCodigo").val(), function(datoObtenidos) {
                            alert(datoObtenidos);
                            mostrar();
                            limpiar();
                        });
            }

            function limpiar() {
                $("#cmbTipo").val("");
                $("#txtNombre").val("");
                $("#txtApellido").val("");
                $("#txtDni").val("");

            }

            function buscar(cod) {
                $.post("buscarCliente.cl", "txtCodigo=" + cod + "", function(datoObtenido) {
                    var datos = datoObtenido.toString().split(",");
                    $("#txtNombre").val(datos[1]);
                    $("#txtApellido").val(datos[2]);
                    $("#txtDni").val(datos[3]);
                    $("#cmbTipo").val(datos[4]);
                    $("#txtCodigo").val(datos[0]);
                    $("#btnRegistrarC").val("ACTUALIZAR X AjaX");
                });
            }


            function validar(mensaje, idcampo) {
                var exp_reg = /^[a-z\u00C0-\u00ff]+$/i; // expresión regular para letras(máy o minus), acentuadas o no,
                if (exp_reg.test(mensaje) == true) {
                } else {
                    alert("No ingresar numeros" + idcampo);
                    $("#" + idcampo).val("");
                }
            }


            function validarNumeros(e) { // 1
                tecla = (document.all) ? e.keyCode : e.which; // 2
                if (tecla == 8)
                    return true; // backspace
                if (tecla == 109)
                    return true; // menos
                if (tecla == 110)
                    return true; // punto
                if (tecla == 189)
                    return true; // guion
                if (e.ctrlKey && tecla == 86) {
                    return true
                }
                ; //Ctrl v
                if (e.ctrlKey && tecla == 67) {
                    return true
                }
                ; //Ctrl c
                if (e.ctrlKey && tecla == 88) {
                    return true
                }
                ; //Ctrl x
                if (tecla >= 96 && tecla <= 105) {
                    return true;
                } //numpad

                patron = /[0-9]/; // patron

                te = String.fromCharCode(tecla);
                return patron.test(te); // prueba
            }
            
             function validarLetras(e) { // 1
                 
    tecla = (document.all) ? e.keyCode : e.which; 
    // alert(tecla);  me envia  el numero de letra que ingreso por teclado
    if (tecla==8) return true; // backspace
		if (tecla==32) return true; // espacio
		if (e.ctrlKey && tecla==86) { return true;} //Ctrl v
		if (e.ctrlKey && tecla==67) { return true;} //Ctrl c
		if (e.ctrlKey && tecla==88) { return true;} //Ctrl x
		if (tecla==192) { return true;} // aqui agrego la letra para que se ingresado por vista
		patron = /[a-zA-Z]/; //patron
		te = String.fromCharCode(tecla); 
		return patron.test(te); // prueba de patron
	}	
        </script>

    </script>
</head>
<body onload="mostrar()" >
    <div class="boxed">
        <div class="content">
            <label onclick="mostrar()"  >Mostrar Lista</label>
            <label onclick="registrarDatosAjax()"  >REGISTRAR</label>
            <h1>FORMULARIO CLIENTE</h1>

            <form method="Post" id="frm" name="frm" action="registrarCliente.cl">
                <input type="hidden"  id="txtCodigo" name="txtCodigo" value="">
                <br>
                <label>Tipo Cliente</label>
                <select id="cmbTipo" name="cmbTipo">
                    <option value="NAT">NATURAL</option>
                    <option value="JUR">JURIDICA</option>
                </select>
                <br><br>
                <label>Nombre</label>
                <input type="text" name="txtNombre" id="txtNombre" onkeyup="validar(this.value, 'txtNombre');"  >
                <br><br>
                <label>Apellidos</label>
                <input type="text" name="txtApellido" id="txtApellido" onkeyup="validar(this.value, 'txtApellido')" >
                <br><br>
                <label>Celular</label>
                <input type="text" name="txtCelular" id="txtCelular" />
                <br><br>
                <label>Direccion</label>
                <input type="text" name="txtDireccion" id="txtDireccion"  onkeydown="return validarLetras(event)" />
                <br><br>
                <label>Email</label>
                <input type="text" name="txtEmail" id="txtEmail" />
                <br><br>
                <div id="divNatural"><hr>
                    DATOS DE PERSONA NATURAL<br>
                    <label>Dni</label>
                    <input type="text" name="txtDni" maxlength="8" id="txtDni" onkeydown="return validarNumeros(event)"/>
                    <br><br>
                    <label>Sexo</label>
                    <select id="cmbSexo" name="cmbSexo">
                        <option value="MASCULINO">MASCULINO</option>
                        <option value="FEMENINO">FEMENINO</option>
                    </select><br><br><hr>
                </div>
                <div id="divJuridica">
                    DATOS DE PERSONA JURICA<br>
                    <label>RUC</label>
                    <input type="text" name="txtRuc" id="txtRuc"/>
                    <br><br>
                    <label>RAZON SOCIAL</label>
                    <input type="text" name="txtRazonSocial" id="txtRazonSocial"/>
                    <br><br> <hr>
                </div>

                <input type="submit" id="btnRegistrarS" name="btnRegistrarS" value="Registrar"/>
                <input type="button" id="btnRegistrarC" name="btnRegistrarC" value="Registrar X ajax  " onclick="registrarDatosAjax();"  />
            </form>
        </div>


        <div id="mostraLista" name="mostrarLista"></div>

        <!--<div >
            <center> <div class="datagrid"> 
        <%--<table id="tblCliente" border="1px" name="tblCliente">
            <tr>
                <th>Nombre Cliente</th>
                <th>Apellido Cliente</th>
            </tr>--%>

        <%
            out.print("<table id=\"tblCliente\" border='1px' name='tblCliente'>"
                    + " <tr><th>Nombre Cliente</th><th>Apellido Cliente</th></tr>");

            LogicaCliente lCliente = new LogicaCliente();
            List<BeanCliente> lstCliente = lCliente.listarCliente();
            for (int i = 0; i < lstCliente.size(); i++) {
                out.println("<tr><td>" + lstCliente.get(i).getNomCli() + "</td>");
                out.println("<td>" + lstCliente.get(i).getApeCli() + "</td></tr>");

            }
            out.print(" </table>");
        %>
        <%--</table>--%>

    </div></center>
</div>
</div>-->


</body>
</html>