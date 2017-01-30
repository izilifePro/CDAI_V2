/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetCDAI.servlets;

import ejb.IUser;
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
public class User extends HttpServlet {
    
    @EJB
    private IUser userSession; 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nom");
        String firstName = request.getParameter("prenom");
        String phone = request.getParameter("tel");
        String address = request.getParameter("adresse");
        String login = request.getParameter("login");
        String password = request.getParameter("mdp");
        String profil = request.getParameter("profil");
        
        try{
            userSession.createUser(name, firstName, phone, address, login, password, profil);
            PrintWriter out = response.getWriter();  
            response.setContentType("text/html"); 
            out.println("<script type=\"text/javascript\">");  
            out.println("alert('Votre inscription a été prise en compte');");
            out.println("window.location.href = 'http://localhost:8080/ProjetCDAI-war/index.jsp'");
            out.println("</script>");
        }catch(Exception e){
            System.out.println("Error when creating user : "+e.getMessage());
        }    
    }

}
