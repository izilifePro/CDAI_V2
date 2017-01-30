/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Utilisateur;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Mansour
 */
@Stateless
public class UserSession implements IUser{
    @PersistenceContext
    private EntityManager em;
    
    /**
     * to create a new user, client ou restaurateur 
     */
    public void createUser(String name, String firstName, String phone, String address, String mail, String password, String profil) throws  Exception{
        Utilisateur user = new Utilisateur();
        user.setNom(name);
        user.setPrenom(firstName);
        user.setTelephone(phone);
        user.setAdresse(address);
        user.setEmail(mail);
        user.setMotdepasse(password);
        user.setProfil(profil);
        
        /*To check if user exist in database before persist*/
        Utilisateur utilisateur = null;
        String mailUserInDB = null;
        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email=:login AND u.motdepasse=:pwd");
            List<Utilisateur> resultsQuery = query
                    .setParameter("login", mail)
                    .setParameter("pwd", password)
                    .getResultList();
                if(!resultsQuery.isEmpty()){ 
                   utilisateur = resultsQuery.get(0);
                   mailUserInDB = utilisateur.getEmail();
                }
                if(mail.equals(mailUserInDB)){
                    throw new Exception("Votre login existe déjà en base ! ");
                }else{
                    em.persist(user);
                }
    }
    
    public void editUser(String name, String firstName, String phone, String address, String mail, String password, String profil){
        Utilisateur user = new Utilisateur();
        
        user.setNom(name);
        user.setPrenom(firstName);
        user.setTelephone(phone);
        user.setAdresse(address);
        user.setEmail(mail);
        user.setMotdepasse(password);
        user.setProfil(profil);
        try{
            em.merge(user);
        }catch(Exception e){
            System.out.println("Error when merging object user "+e.getMessage());
        };
    }
    
    public Utilisateur toConnect(String mail, String password) throws Exception{ 
        Utilisateur utilisateur = null;
        Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email= :email AND u.motdepasse= :pwd");
            List<Utilisateur> resultsQuery = query
                    .setParameter("email", mail)
                    .setParameter("pwd", password)
                    .getResultList();
                if(!resultsQuery.isEmpty()){
                   utilisateur = resultsQuery.get(0);
                }
        return utilisateur;
    }
}
