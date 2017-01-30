/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Utilisateur;
import javax.ejb.Local;

/**
 *
 * @author Mansour
 */
@Local
public interface IUser {
    /**
     * To create a new user (customer or restaurator)
     */
    public void createUser(String name, String firstName, String phone, String address, String mail, String password, String profil) throws  Exception;
    
    /**
     * To edit user
     */
    public void editUser(String name, String firstName, String phone, String address, String mail, String password, String profil);
    
    /**
    * Connecting user
    */
    public Utilisateur toConnect(String mail, String password) throws Exception;
}
