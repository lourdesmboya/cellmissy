/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ugent.maf.cellmissy.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Paola
 */
@Entity
@Table(name = "ecm_composition")
@XmlType(namespace = "http://maf.ugent.be/beans/cellmissy")
@XmlAccessorType(XmlAccessType.FIELD)
@NamedQueries({
    @NamedQuery(name = "EcmComposition.findAll", query = "SELECT e FROM EcmComposition e"),
    @NamedQuery(name = "EcmComposition.findByCompositionTypeid", query = "SELECT e FROM EcmComposition e WHERE e.compositionTypeid = :compositionTypeid"),
    @NamedQuery(name = "EcmComposition.findByCompositionType", query = "SELECT e FROM EcmComposition e WHERE e.compositionType = :compositionType"),
    @NamedQuery(name = "EcmComposition.findByCompositionTypeAndMatrixDimensionName", query = "SELECT e FROM EcmComposition e WHERE e.compositionType = :compositionType AND e.matrixDimension.dimension = :matrixDimension"),
    @NamedQuery(name = "EcmComposition.findByMatrixDimensionName", query = "SELECT e FROM EcmComposition e WHERE e.matrixDimension.dimension = :matrixDimension")})
public class EcmComposition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "composition_typeid")
    @XmlTransient
    private Long compositionTypeid;
    @Column(name = "composition_type")
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(EmptyStringXMLAdapter.class)
    private String compositionType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ecmComposition")
    @XmlTransient
    private List<Ecm> ecmList;
    @JoinColumn(name = "l_matrix_dimensionid", referencedColumnName = "matrix_dimensionid")
    @ManyToOne(optional = false)
    @XmlElement
    private MatrixDimension matrixDimension;

    public EcmComposition() {
    }

    public EcmComposition(Long compositionTypeid) {
        this.compositionTypeid = compositionTypeid;
    }

    public Long getCompositionTypeid() {
        return compositionTypeid;
    }

    public void setCompositionTypeid(Long compositionTypeid) {
        this.compositionTypeid = compositionTypeid;
    }

    public String getCompositionType() {
        return compositionType;
    }

    public void setCompositionType(String compositionType) {
        this.compositionType = compositionType;
    }

    @XmlTransient
    public List<Ecm> getEcmList() {
        return ecmList;
    }

    public void setEcmList(List<Ecm> ecmList) {
        this.ecmList = ecmList;
    }

    public MatrixDimension getMatrixDimension() {
        return matrixDimension;
    }

    public void setMatrixDimension(MatrixDimension matrixDimension) {
        this.matrixDimension = matrixDimension;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compositionTypeid != null ? compositionTypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcmComposition)) {
            return false;
        }
        EcmComposition other = (EcmComposition) object;
        return !((this.compositionTypeid == null && other.compositionTypeid != null) || (this.compositionTypeid != null && !this.compositionTypeid.equals(other.compositionTypeid)));
    }

    @Override
    public String toString() {
        return compositionType;
    }
}
