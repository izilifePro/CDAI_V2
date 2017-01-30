/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.AnnonceFacade;
import entity.Annonce;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;


/**
 *
 * @author Lahat
 */
@Named(value = "annonceController")
@SessionScoped
public class AnnonceController implements Serializable {

    @EJB
    private AnnonceFacade annonceFacade;
    private Annonce a = new Annonce();

    public Annonce getA() {
        return a;
    }

    public void setA(Annonce a) {
        this.a = a;
    }

    
    
    public AnnonceController() {
    }
    
    public List<Annonce> findAll(){
        return this.annonceFacade.findAll();
    }
    
    public String addAnnonce(){
        this.annonceFacade.create(this.a);
        this.a = new Annonce();
        return "listeAnnonce";
    }

   public void delete(Annonce a){
       this.annonceFacade.remove(a);
   }
         
    @PostConstruct
    public void init() {
       a = new Annonce();
    }
}
