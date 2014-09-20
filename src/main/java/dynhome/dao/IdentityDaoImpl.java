/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynhome.dao;

import dynhome.domain.User;
import dynhome.entity.Identity;
import dynhome.interfaces.IIdentityDao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Administrator
 */
public class IdentityDaoImpl extends HibernateDaoSupport implements IIdentityDao {

    public Identity getIdentity() {
        
        List<Identity> users = this.getHibernateTemplate().loadAll(Identity.class);
        
        return this.getHibernateTemplate().loadAll(Identity.class).get(0);
    }

    public List<Identity> getIdentities() {
        return this.getHibernateTemplate().loadAll(Identity.class);
    }  
 
 
}
