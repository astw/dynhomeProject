/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynhome.interfaces;

import dynhome.entity.Identity;
import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
//
//@Repository("identityDao")
//public interface IIdentityDao extends JpaRepository<Identity, Long>{
////    Identity getIdentity();
////    List<Identity> getIdentities();
//}

//@Repository("identityDao")
public interface IIdentityDao {
    Identity getIdentity();
    List<Identity> getIdentities();
}
