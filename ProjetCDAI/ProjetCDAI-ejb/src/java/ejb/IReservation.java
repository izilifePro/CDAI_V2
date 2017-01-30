/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author Mansour
 */
@Local
public interface IReservation {
    public void effectuerReservation(String date, String HeureDebut, String heureFin, String nbrePersonnes, String restaurant); 
    
}
