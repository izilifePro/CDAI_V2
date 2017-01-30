/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetCDAI.servlets;

import ejb.IUser;
import entity.Utilisateur;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mansour
 */
public class Connexion extends HttpServlet {
    @EJB
    private IUser userSession;
    
    final String CUSTOMER = "Client";
    final String OWNER = "restaurateur";

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mail = request.getParameter("login");
        String password = request.getParameter("password");       
        Utilisateur user = null;
        try{
            user = userSession.toConnect(mail, password);
        }catch(Exception e){
            System.out.println("Error when connecting ..."+e.getMessage());
        } 
        
        if(user != null && user.getProfil().equals(CUSTOMER)){
            String firstName = user.getPrenom();
            String name = user.getNom();
            
            PrintWriter out = response.getWriter();  
            response.setContentType("text/html"); 
            out.println("<script type=\"text/javascript\">");  
            out.println("alert('Vous etes connecté en tant que client');");
            out.println("window.location.href = 'http://localhost:8080/ProjetCDAI-war/PageWeb/dashboard_Client.jsp'");
            out.println("</script>");
            //this.getServletContext().getRequestDispatcher("/PageWeb/dashboard_Client.jsp").forward(request, response);
        }else if(user != null && user.getProfil().equals(OWNER)){
            PrintWriter out = response.getWriter();  
            response.setContentType("text/html"); 
            out.println("<script type=\"text/javascript\">");  
            out.println("alert('Vous etes connecté en tant que restaurateur');");
            out.println("window.location.href = 'http://localhost:8080/ProjetCDAI-war/PageWeb/dashboard_Restaurateur.jsp'");
            out.println("</script>");
            //this.getServletContext().getRequestDispatcher("http://localhost:8080/ProjetCDAI-war/PageWeb/dashboard_Restaurateur.jsp").forward(request, response);
        } else {
            PrintWriter out = response.getWriter();  
            response.setContentType("text/html"); 
            out.println("<script type=\"text/javascript\">");  
            out.println("alert('Login ou mot de passe incorrect ! ');");
            out.println("window.location.href = 'http://localhost:8080/ProjetCDAI-war/PageWeb/connexion.jsp'");
            out.println("</script>");
            //this.getServletContext().getRequestDispatcher("/PageWeb/connexion.jsp").forward(request, response);
        }
    }
}
