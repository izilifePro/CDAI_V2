/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mansour
 */
@Entity
@Table(name = "reservation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
    , @NamedQuery(name = "Reservation.findByIdreservation", query = "SELECT r FROM Reservation r WHERE r.idreservation = :idreservation")
    , @NamedQuery(name = "Reservation.findByDate", query = "SELECT r FROM Reservation r WHERE r.date = :date")
    , @NamedQuery(name = "Reservation.findByHeuredebut", query = "SELECT r FROM Reservation r WHERE r.heuredebut = :heuredebut")
    , @NamedQuery(name = "Reservation.findByHeurefin", query = "SELECT r FROM Reservation r WHERE r.heurefin = :heurefin")
    , @NamedQuery(name = "Reservation.findByNbrepersonnes", query = "SELECT r FROM Reservation r WHERE r.nbrepersonnes = :nbrepersonnes")
    , @NamedQuery(name = "Reservation.findByRestaurant", query = "SELECT r FROM Reservation r WHERE r.restaurant = :restaurant")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreservation")
    private Integer idreservation;
    @Size(max = 45)
    @Column(name = "date")
    private String date;
    @Size(max = 45)
    @Column(name = "heuredebut")
    private String heuredebut;
    @Size(max = 45)
    @Column(name = "heurefin")
    private String heurefin;
    @Size(max = 45)
    @Column(name = "nbrepersonnes")
    private String nbrepersonnes;
    @Size(max = 45)
    @Column(name = "restaurant")
    private String restaurant;

    public Reservation() {
    }

    public Reservation(Integer idreservation) {
        this.idreservation = idreservation;
    }

    public Integer getIdreservation() {
        return idreservation;
    }

    public void setIdreservation(Integer idreservation) {
        this.idreservation = idreservation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeuredebut() {
        return heuredebut;
    }

    public void setHeuredebut(String heuredebut) {
        this.heuredebut = heuredebut;
    }

    public String getHeurefin() {
        return heurefin;
    }

    public void setHeurefin(String heurefin) {
        this.heurefin = heurefin;
    }

    public String getNbrepersonnes() {
        return nbrepersonnes;
    }

    public void setNbrepersonnes(String nbrepersonnes) {
        this.nbrepersonnes = nbrepersonnes;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservation != null ? idreservation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idreservation == null && other.idreservation != null) || (this.idreservation != null && !this.idreservation.equals(other.idreservation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Reservation[ idreservation=" + idreservation + " ]";
    }
    
}
