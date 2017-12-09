/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namastech.mvc.entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ygor
 */
@Entity
@Table(name = "projeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projeto.findAll", query = "SELECT p FROM Projeto p")
    , @NamedQuery(name = "Projeto.findById", query = "SELECT p FROM Projeto p WHERE p.id = :id")
    , @NamedQuery(name = "Projeto.findByCodProjeto", query = "SELECT p FROM Projeto p WHERE p.codProjeto = :codProjeto")
    , @NamedQuery(name = "Projeto.findByQuantidade", query = "SELECT p FROM Projeto p WHERE p.quantidade = :quantidade")
    , @NamedQuery(name = "Projeto.findByDescricao", query = "SELECT p FROM Projeto p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "Projeto.findByAtivo", query = "SELECT p FROM Projeto p WHERE p.ativo = :ativo")
    , @NamedQuery(name = "Projeto.findByNomeCliente", query = "SELECT p FROM Projeto p WHERE p.nomeCliente = :nomeCliente")
    , @NamedQuery(name = "Projeto.findByObservacao", query = "SELECT p FROM Projeto p WHERE p.observacao = :observacao")})
public class Projeto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "cod_projeto")
    private String codProjeto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ativo")
    private boolean ativo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nome_cliente")
    private String nomeCliente;
    @Size(max = 300)
    @Column(name = "observacao")
    private String observacao;

    public Projeto() {
    }

    public Projeto(Integer id) {
        this.id = id;
    }

    public Projeto(Integer id, String codProjeto, int quantidade, String descricao, boolean ativo, String nomeCliente) {
        this.id = id;
        this.codProjeto = codProjeto;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.ativo = ativo;
        this.nomeCliente = nomeCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(String codProjeto) {
        this.codProjeto = codProjeto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
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
        if (!(object instanceof Projeto)) {
            return false;
        }
        Projeto other = (Projeto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "namastech.mvc.entidades.Projeto[ id=" + id + " ]";
    }
    
}
