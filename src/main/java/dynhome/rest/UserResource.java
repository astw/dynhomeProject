package dynhome.rest;

import dynhome.interfaces.IIdentity;
import dynhome.interfaces.IIdentityDao;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

    IIdentityDao  identityDao; 

    public void setIdentityDao(IIdentityDao identityDao) {
        this.identityDao = identityDao;
    } 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public IIdentity getDefaultIdentityInJSON() { 
        return identityDao.getIdentity();
    }
}
