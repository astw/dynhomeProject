/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynhome.interfaces;

import dynhome.entity.Identity;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IIdentityDao {
    Identity getIdentity();
    List<Identity> getIdentities();
}
