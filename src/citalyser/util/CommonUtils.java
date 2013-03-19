/*****************************************************************
 * @author Abhishek Choudhary
 * @Email-id : abhishek@codeblues.in
 *****************************************************************/

package citalyser.util;

import citalyser.util.CProxy;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.apache.log4j.Logger;

public class CommonUtils {
    static Logger logger = Logger.getLogger(CommonUtils.class.getName());
    public static void setSystemProxy(CProxy proxy)
    {
        logger.debug("Setting System Proxy : ");
        System.getProperties().put("http.proxyHost", proxy.getHostName());
        System.getProperties().put("http.proxyPort", proxy.getPort());
        System.getProperties().put("http.proxyUser", proxy.getUsername());
        System.getProperties().put("http.proxyPassword", proxy.getPassword());
    }
    
    public static Proxy getJavaProxyFromCProxy(CProxy cproxy)
    {
        Proxy proxy;
        if(!cproxy.getnoProxy())
            proxy = new Proxy(Proxy.Type.HTTP, 
                                new InetSocketAddress(cproxy.getHostName(),cproxy.getPort()));
        else
            proxy = Proxy.NO_PROXY;
        return proxy;
    }
    
    public static Proxy getBestJavaProxy()
    {
        CProxy cproxy = Config.getProxylist().get(0);
        return getJavaProxyFromCProxy(cproxy);
    }
}
