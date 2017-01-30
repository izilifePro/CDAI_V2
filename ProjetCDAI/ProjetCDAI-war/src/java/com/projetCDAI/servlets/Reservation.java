/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetCDAI.servlets;

import ejb.IReservation;
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
public class Reservation extends HttpServlet {
    @EJB
    private IReservation resaSession;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String date = request.getParameter("date");
        String heureDebut = request.getParameter("heureDebut");
        String heureFin = request.getParameter("heureFin");
        String nbrePersonne = request.getParameter("nbrePersonne");
        String restaurant = request.getParameter("restaurant");
        
        try{
            resaSession.effectuerReservation(date, heureDebut, heureFin, nbrePersonne, restaurant);
            PrintWriter out = response.getWriter();  
            response.setContentType("text/html"); 
            out.println("<script type=\"text/javascript\">");  
            out.println("alert('Votre reservation a été enrégistré ! ');");
            out.println("window.location.href = 'http://localhost:8080/ProjetCDAI-war/PageWeb/dashboard_Client.jsp'");
            out.println("</script>");
        }catch(Exception e){
            System.out.println("Error when adding reservation "+e.getMessage());
        }
    }

}
