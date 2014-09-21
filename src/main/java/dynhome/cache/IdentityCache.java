/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynhome.cache;

import com.google.common.cache.*;
import dynhome.entity.Identity;
import dynhome.interfaces.IIdentityDao;
import java.util.concurrent.Callable; 
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Administrator
 */
public class IdentityCache {

    IIdentityDao identityDao;

    Cache<String, Identity> identityCache
            = CacheBuilder.newBuilder()
            .expireAfterAccess(10, TimeUnit.MINUTES).build(
                    new CacheLoader<String, Identity>() {
                        public Identity load(String email) {
                            return identityDao.getIdentity();
                        }
                    }
            );

    public void setIdentityDao(IIdentityDao identityDao) {
        this.identityDao = identityDao;
    }
    
    Callable<Identity> callable = new Callable<Identity>() {  
  
        public Identity call() throws Exception {  
               return null;
        }  
    };  
    public Identity getByEmail(String email) throws ExecutionException  {
        return identityCache.get(email, callable );
    }
}