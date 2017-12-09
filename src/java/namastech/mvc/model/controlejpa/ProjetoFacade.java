/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namastech.mvc.model.controlejpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import namastech.mvc.entidades.Projeto;

/**
 *
 * @author ygor
 */
@Stateless
public class ProjetoFacade extends AbstractFacade<Projeto> {

    @PersistenceContext(unitName = "namastech-webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProjetoFacade() {
        super(Projeto.class);
    }
    
}
