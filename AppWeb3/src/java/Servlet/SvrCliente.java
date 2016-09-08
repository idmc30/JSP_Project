/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.BeanCliente;
import Logica.LogicaCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class SvrCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String varUrl = request.getServletPath();
        
        if (varUrl.equals("/registrarCliente.cl")) {
            registrar(request, response);
        } else if (varUrl.equals("/listarCliente.cl")) {
            listar(request, response);
        } else if (varUrl.equals("/buscarCliente.cl")) {
            buscar(request, response);
        } else if (varUrl.equals("/eliminarCliente.cl")) {
            eliminar(request, response);
        }
        
    }
    
    public void buscar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        LogicaCliente lCliente = new LogicaCliente();
        BeanCliente bCliente = lCliente.buscarCliente(Integer.parseInt(request.getParameter("txtCodigo")));
        out.print("" + bCliente.getCodCliente() + "," + bCliente.getNomCli() + "," + bCliente.getApeCli() + "," + bCliente.getDniCli() + "," + bCliente.getTipoCli());
    }
    
    public void eliminar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        LogicaCliente lCliente = new LogicaCliente();
        Integer valor = lCliente.eliminar(Integer.parseInt(request.getParameter("eliminar")));
        if (valor == 1) {
            out.print("CLIENTE ELIMINADO");
        } else {
            out.print("NO SE HA ELIMINADO EL CLIENTE ");
        }
    }
    
    public void registrar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        LogicaCliente lCliente = new LogicaCliente();
        BeanCliente bCliente = new BeanCliente();
        bCliente.setNomCli(request.getParameter("txtNombre"));
        bCliente.setApeCli(request.getParameter("txtApellido"));
        bCliente.setCelCli(request.getParameter("txtCelular"));
        bCliente.setDirCli(request.getParameter("txtDireccion"));
        bCliente.setDniCli(Integer.parseInt(request.getParameter("txtDni")));
        bCliente.setSexo(request.getParameter("cmbSexo"));
        bCliente.setTipoCli(request.getParameter("cmbTipo"));
        
        if (request.getParameter("txtCodigo") != null && request.getParameter("txtCodigo").toString().trim().length() > 0) {
            bCliente.setCodCliente(Integer.parseInt(request.getParameter("txtCodigo")));
            lCliente.modificar(bCliente);
            out.print("ACTUALIZADO CORRECTAMENTE");
        } else {
            lCliente.insertar(bCliente);
            out.print("REGISTRADO CORRECTAMENTE");
        }
        
        
    }
    
    public void listar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        out.print("<table id=\"tblCliente\" border='1px' name='tblCliente'>"
                + " <tr><th>Cliente</th><th>Apellido</th><th>Acciones</th></tr>");
        
        LogicaCliente lCliente = new LogicaCliente();
        List<BeanCliente> lstCliente = lCliente.listarCliente();
        for (int i = 0; i < lstCliente.size(); i++) {
            out.println("<tr><td>" + lstCliente.get(i).getNomCli() + "</td>");
            out.println("<td>" + lstCliente.get(i).getApeCli() + "</td>");
            out.println("<td><a href='javascript:buscar(" + lstCliente.get(i).getCodCliente() + ")' >Seleccionar </a> / <a href='javascript:eliminar(" + lstCliente.get(i).getCodCliente() + ")' >Eliminar </a> </td></tr>");
            
        }
        out.print(" </table>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SvrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SvrCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
