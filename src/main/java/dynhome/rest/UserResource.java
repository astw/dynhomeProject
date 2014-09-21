package dynhome.rest;

import dynhome.cache.IdentityCache;
import dynhome.entity.Identity;
import dynhome.interfaces.IIdentity;
import dynhome.interfaces.IIdentityDao;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

    IIdentityDao  identityDao; 
    IdentityCache identityCache ;
    public void setIdentityDao(IIdentityDao identityDao) {
        this.identityDao = identityDao;
       identityCache = new IdentityCache();
       identityCache.setIdentityDao(identityDao);
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public IIdentity getDefaultIdentityInJSON() { 
        //return identityDao.getIdentity();
        IIdentity identity = identityCache.getByEmail("wsh@13s.com");
        if(identity == null) 
            return identityDao.getIdentity();
        return identity;
    }
}
