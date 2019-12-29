/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_oop_181080200213;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ROBBY
 */
@Entity
@Table(name = "satuan", catalog = "uas_oop_181080200213", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Satuan.findAll", query = "SELECT s FROM Satuan s")
    , @NamedQuery(name = "Satuan.findByKdSat", query = "SELECT s FROM Satuan s WHERE s.kdSat = :kdSat")
    , @NamedQuery(name = "Satuan.findByKetSat", query = "SELECT s FROM Satuan s WHERE s.ketSat = :ketSat")})
public class Satuan implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_sat")
    private String kdSat;
    @Column(name = "ket_sat")
    private String ketSat;

    public Satuan() {
    }

    public Satuan(String kdSat) {
        this.kdSat = kdSat;
    }

    public String getKdSat() {
        return kdSat;
    }

    public void setKdSat(String kdSat) {
        String oldKdSat = this.kdSat;
        this.kdSat = kdSat;
        changeSupport.firePropertyChange("kdSat", oldKdSat, kdSat);
    }

    public String getKetSat() {
        return ketSat;
    }

    public void setKetSat(String ketSat) {
        String oldKetSat = this.ketSat;
        this.ketSat = ketSat;
        changeSupport.firePropertyChange("ketSat", oldKetSat, ketSat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdSat != null ? kdSat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Satuan)) {
            return false;
        }
        Satuan other = (Satuan) object;
        if ((this.kdSat == null && other.kdSat != null) || (this.kdSat != null && !this.kdSat.equals(other.kdSat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uas_oop_181080200213.Satuan[ kdSat=" + kdSat + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
