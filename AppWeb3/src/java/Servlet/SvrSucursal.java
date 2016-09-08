/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Bean.BeanSucursal;
import Logica.LogicaSucursal;
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
 * @author Pecsa
 */
public class SvrSucursal extends HttpServlet {

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
        String varUrl=request.getServletPath();
        
        if(varUrl.equals("/registrarSucursal.cl")){
            reg_sucursal(request,response);
        }else if(varUrl.equals("/cmbSucursal.cl")){
            cmb_sucursal(request,response);
        }
    }
    
    public void cmb_sucursal(HttpServletRequest request,HttpServletResponse response ) throws Exception{
        PrintWriter out = response.getWriter();
        LogicaSucursal lSucursal= new LogicaSucursal();
        List<BeanSucursal> lista=lSucursal.listarSucursal();
        out.print("<select id='cmbSucursal' name='cmbSucursal'>");
        for(int i=0;i<lista.size();i++){
            out.print("<option value="+lista.get(i).getCodSuc()+">"+lista.get(i).getNomSuc()+"</option>");
        }
        out.print("</select>");
                
        
    }
    
    
    public void reg_sucursal(HttpServletRequest request,HttpServletResponse response ) throws Exception{
        LogicaSucursal lSucursal=new LogicaSucursal();
        BeanSucursal bSucursal=new BeanSucursal();
        bSucursal.setNomSuc(request.getParameter("txtNomSucursal"));
        bSucursal.setDirSuc(request.getParameter("txtDirSucursal"));
        bSucursal.setSerieFactSuc(request.getParameter("txtFactSucursal"));
        bSucursal.setSerieBolSuc(request.getParameter("txtBolSucursal"));
        bSucursal.setEstadoSuc(request.getParameter("cmbEst"));
        bSucursal.setSerieNota(request.getParameter("txtNotaSucursal"));
        bSucursal.setNunFact(Integer.parseInt(request.getParameter("txtNumFactSuc")));
        bSucursal.setNumBol(Integer.parseInt(request.getParameter("txtNumBolSuc")));
        bSucursal.setNumTic(Integer.parseInt(request.getParameter("txtNumTicSuc")));
        lSucursal.insertar(bSucursal);
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
            Logger.getLogger(SvrSucursal.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SvrSucursal.class.getName()).log(Level.SEVERE, null, ex);
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
