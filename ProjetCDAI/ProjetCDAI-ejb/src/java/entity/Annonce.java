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
@Table(name = "annonce")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Annonce.findAll", query = "SELECT a FROM Annonce a")
    , @NamedQuery(name = "Annonce.findByIdannonce", query = "SELECT a FROM Annonce a WHERE a.idannonce = :idannonce")
    , @NamedQuery(name = "Annonce.findByRestaurateur", query = "SELECT a FROM Annonce a WHERE a.restaurateur = :restaurateur")
    , @NamedQuery(name = "Annonce.findByRestaurant", query = "SELECT a FROM Annonce a WHERE a.restaurant = :restaurant")
    , @NamedQuery(name = "Annonce.findByPlagedispo", query = "SELECT a FROM Annonce a WHERE a.plagedispo = :plagedispo")
    , @NamedQuery(name = "Annonce.findByNbreplacedispo", query = "SELECT a FROM Annonce a WHERE a.nbreplacedispo = :nbreplacedispo")
    , @NamedQuery(name = "Annonce.findByDatededispo", query = "SELECT a FROM Annonce a WHERE a.datededispo = :datededispo")
    , @NamedQuery(name = "Annonce.findByReduction", query = "SELECT a FROM Annonce a WHERE a.reduction = :reduction")
    , @NamedQuery(name = "Annonce.findByPourcreduction", query = "SELECT a FROM Annonce a WHERE a.pourcreduction = :pourcreduction")
    , @NamedQuery(name = "Annonce.findByTel", query = "SELECT a FROM Annonce a WHERE a.tel = :tel")
    , @NamedQuery(name = "Annonce.findByEmail", query = "SELECT a FROM Annonce a WHERE a.email = :email")})
public class Annonce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idannonce")
    private Integer idannonce;
    @Size(max = 2147483647)
    @Column(name = "restaurateur")
    private String restaurateur;
    @Size(max = 2147483647)
    @Column(name = "restaurant")
    private String restaurant;
    @Size(max = 2147483647)
    @Column(name = "plagedispo")
    private String plagedispo;
    @Size(max = 2147483647)
    @Column(name = "nbreplacedispo")
    private String nbreplacedispo;
    @Size(max = 2147483647)
    @Column(name = "datededispo")
    private String datededispo;
    @Size(max = 2147483647)
    @Column(name = "reduction")
    private String reduction;
    @Size(max = 2147483647)
    @Column(name = "pourcreduction")
    private String pourcreduction;
    @Size(max = 10)
    @Column(name = "tel")
    private String tel;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 30)
    @Column(name = "email")
    private String email;

    public Annonce() {
    }

    public Annonce(Integer idannonce) {
        this.idannonce = idannonce;
    }

    public Integer getIdannonce() {
        return idannonce;
    }

    public void setIdannonce(Integer idannonce) {
        this.idannonce = idannonce;
    }

    public String getRestaurateur() {
        return restaurateur;
    }

    public void setRestaurateur(String restaurateur) {
        this.restaurateur = restaurateur;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getPlagedispo() {
        return plagedispo;
    }

    public void setPlagedispo(String plagedispo) {
        this.plagedispo = plagedispo;
    }

    public String getNbreplacedispo() {
        return nbreplacedispo;
    }

    public void setNbreplacedispo(String nbreplacedispo) {
        this.nbreplacedispo = nbreplacedispo;
    }

    public String getDatededispo() {
        return datededispo;
    }

    public void setDatededispo(String datededispo) {
        this.datededispo = datededispo;
    }

    public String getReduction() {
        return reduction;
    }

    public void setReduction(String reduction) {
        this.reduction = reduction;
    }

    public String getPourcreduction() {
        return pourcreduction;
    }

    public void setPourcreduction(String pourcreduction) {
        this.pourcreduction = pourcreduction;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idannonce != null ? idannonce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Annonce)) {
            return false;
        }
        Annonce other = (Annonce) object;
        if ((this.idannonce == null && other.idannonce != null) || (this.idannonce != null && !this.idannonce.equals(other.idannonce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Annonce[ idannonce=" + idannonce + " ]";
    }
    
}
