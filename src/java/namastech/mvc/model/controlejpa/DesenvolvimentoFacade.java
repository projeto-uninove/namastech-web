/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namastech.mvc.model.controlejpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import namastech.mvc.entidades.Desenvolvimento;

/**
 *
 * @author ygor
 */
@Stateless
public class DesenvolvimentoFacade extends AbstractFacade<Desenvolvimento> {

    @PersistenceContext(unitName = "namastech-webPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DesenvolvimentoFacade() {
        super(Desenvolvimento.class);
    }
    
}
