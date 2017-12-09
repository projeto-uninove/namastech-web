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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ygor
 */
@Entity
@Table(name = "desenvolvimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Desenvolvimento.findAll", query = "SELECT d FROM Desenvolvimento d")
    , @NamedQuery(name = "Desenvolvimento.findById", query = "SELECT d FROM Desenvolvimento d WHERE d.id = :id")
    , @NamedQuery(name = "Desenvolvimento.findByArquivo", query = "SELECT d FROM Desenvolvimento d WHERE d.arquivo = :arquivo")
    , @NamedQuery(name = "Desenvolvimento.findByAprovado", query = "SELECT d FROM Desenvolvimento d WHERE d.aprovado = :aprovado")
    , @NamedQuery(name = "Desenvolvimento.findByData", query = "SELECT d FROM Desenvolvimento d WHERE d.data = :data")
    , @NamedQuery(name = "Desenvolvimento.findByIdProjeto", query = "SELECT d FROM Desenvolvimento d WHERE d.idProjeto = :idProjeto")})
public class Desenvolvimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "arquivo")
    private String arquivo;
    @Column(name = "aprovado")
    private Integer aprovado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_projeto")
    private int idProjeto;

    public Desenvolvimento() {
    }

    public Desenvolvimento(Integer id) {
        this.id = id;
    }

    public Desenvolvimento(Integer id, String arquivo, Date data, int idProjeto) {
        this.id = id;
        this.arquivo = arquivo;
        this.data = data;
        this.idProjeto = idProjeto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
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

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
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
        if (!(object instanceof Desenvolvimento)) {
            return false;
        }
        Desenvolvimento other = (Desenvolvimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "namastech.mvc.entidades.Desenvolvimento[ id=" + id + " ]";
    }
    
}
