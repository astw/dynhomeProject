package dynhome.cache;

import dynhome.entity.Identity;
import dynhome.interfaces.IIdentity;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager; 
import net.sf.ehcache.Element;

public class SimpleCache {

    CacheManager singletonManager = CacheManager.create();
    Cache memoryOnlyCache = new Cache("IentityCache", 5000, false, false, 5, 2);
   
    Cache identityCache;
    
    public SimpleCache(){ 
        singletonManager.addCache (memoryOnlyCache); 
        identityCache= singletonManager.getCache("IentityCache"); 
    }
    
    public void Put(String key, IIdentity identity)
    { 
        identityCache.put(new Element(key, identity)); 
    }
    
    public IIdentity Get(String key)
    {  
        Element ele = identityCache.get(key);
        if(ele != null)
        { 
            ele.getValue();
        }
        return null;
    }
    
}
