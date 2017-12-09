/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namastech.mvc.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ygor
 */
@Entity
@Table(name = "financeiro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Financeiro.findAll", query = "SELECT f FROM Financeiro f")
    , @NamedQuery(name = "Financeiro.findById", query = "SELECT f FROM Financeiro f WHERE f.id = :id")
    , @NamedQuery(name = "Financeiro.findByIdProjeto", query = "SELECT f FROM Financeiro f WHERE f.idProjeto = :idProjeto")
    , @NamedQuery(name = "Financeiro.findByStatusId", query = "SELECT f FROM Financeiro f WHERE f.statusId = :statusId")
    , @NamedQuery(name = "Financeiro.findByValor", query = "SELECT f FROM Financeiro f WHERE f.valor = :valor")
    , @NamedQuery(name = "Financeiro.findByAprovado", query = "SELECT f FROM Financeiro f WHERE f.aprovado = :aprovado")
    , @NamedQuery(name = "Financeiro.findByData", query = "SELECT f FROM Financeiro f WHERE f.data = :data")})
public class Financeiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_projeto")
    private int idProjeto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status_id")
    private int statusId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private float valor;
    @Column(name = "aprovado")
    private Integer aprovado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;

    public Financeiro() {
    }

    public Financeiro(Integer id) {
        this.id = id;
    }

    public Financeiro(Integer id, int idProjeto, int statusId, float valor, Date data) {
        this.id = id;
        this.idProjeto = idProjeto;
        this.statusId = statusId;
        this.valor = valor;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Integer getAprovado() {
        return aprovado;
    }

    public void setAprovado(Integer aprovado) {
        this.aprovado = aprovado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Financeiro)) {
            return false;
        }
        Financeiro other = (Financeiro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "namastech.mvc.entidades.Financeiro[ id=" + id + " ]";
    }
    
}
