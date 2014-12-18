package dynhome.rest;

import dynhome.cache.SimpleCache;
import dynhome.entity.Identity;
import dynhome.interfaces.IIdentityDao;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/users")
public class UserResource {

    //@Autowired
    IIdentityDao identityDao;
  //  SimpleCache identityCache;

    public void setIdentityDao(IIdentityDao identityDao) {
        this.identityDao = identityDao;
  //      identityCache = new SimpleCache();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Identity> getDefaultIdentityInJSON() throws ExecutionException {
        //return identityDao.findAll();
        return identityDao.getIdentities();
        //IIdentity identity = identityCache.getByEmail("wsh@13s.com");  
//        String key = "wsh@13s.com";
//        IIdentity identity = identityCache.Get(key);
//        if (identity == null) {
//            identity = identityDao.getIdentity();
//            identityCache.Put(key, identity);
//        }
//        return identity;
    }
}
