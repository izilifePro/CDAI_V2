/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Reservation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mansour
 */
@Stateless
public class ResaSession implements IReservation{
    @PersistenceContext
    private EntityManager em; 

    @Override
    public void effectuerReservation(String date, String HeureDebut, String heureFin, String nbrePersonnes, String restaurant) {
        Reservation resa = new Reservation();
        resa.setDate(date);
        resa.setHeuredebut(HeureDebut);
        resa.setHeurefin(heureFin);
        resa.setNbrepersonnes(nbrePersonnes);
        resa.setRestaurant(restaurant);
        
        em.persist(resa);
    }
    
}
