/*****************************************************************
 * @author Abhishek Choudhary
 * @Email-id : abhishek@codeblues.in
 *****************************************************************/

package citalyser;

import citalyser.ui.model.Proxy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;
public class Config
{
    static final Logger logger = Logger.getLogger(Config.class.getName());
    
    private static Properties properties;
    private static List<Proxy> proxyList;
  
    private static File configFile = null;
     
    public static void init(File settingsDir)
    {
        properties = new Properties();
        configFile = new File("Settings.txt");
        if(configFile.exists())
        {
            /*Settings Directory exists. Read the config info. */
            logger.debug("Config file exists");
            readConfigFile();
        }
        if(!configFile.exists())
        {
            try
            {
                configFile.createNewFile();
                writeConfigFile();
            }
            catch(Exception ex)
            {
                logger.error("Error creating Settings File.Using Default Settings..");
                configFile = null;
            }
            
        }
        
    }
    
    private static int readConfigFile()
    {
        try
        {
            properties.load(new FileInputStream(configFile));
            return 0;
        }
        catch(Exception ex)
        {
            logger.debug("Error Reading properties from Settings File. Rewriting properties file.");
            writeConfigFile();
            return -1;
        }
    }
    
    private static int writeConfigFile()
    {
        try
        { 
            properties.store(new FileOutputStream(configFile), null);
            return 0;
        }
        catch(Exception ex)
        {
            logger.error("Error writing Properties to file.");
            return -1;
        }
    }
    
    private static int updateConfigFile()
    {
        int wresult = writeConfigFile();
        int rresult = readConfigFile();
        if(wresult > 0 && rresult > 0) {
            return 0;
        }
        else {
            return -1;
        }
    }
 /* 
  * PROXY Configuration as a hashmap
  */   
    public static int setProxyList(List<Proxy> list)
    {
        logger.debug("Writing the proxies to a file");
        File file = new File(Main.getSettingsDirectory(),"proxies");
        if(!file.exists())
        {
            try{
              logger.debug("Creating new proxies file.");
              file.createNewFile();
            }catch(Exception ex){
                logger.error("Failed to create proxies file");
                return -2;
            }
        }
        try {
            HashMap<Integer,Proxy> hm = new HashMap<Integer,Proxy>();
            for(int i = 0;i<list.size();i++)
                hm.put(i, list.get(i));
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(file));
            s.writeObject(hm);
            s.flush();
            s.close();
            logger.info("Dumped the proxyList to file.");
            return 0;
        } catch (IOException ex) {
            ex.printStackTrace();
            logger.error("Error writing Proxy hashmap to file : " + ex.getMessage());
            return -1;
        }
    }
    
    public static List<Proxy> getProxylist()
    {
        List<Proxy> proxyList = new ArrayList<Proxy>();
        HashMap<Integer,Proxy> hm;  
        File f = new File(Main.getSettingsDirectory(),"proxies");
        if(!f.exists())
            return null;
        try{
            ObjectInputStream s = new ObjectInputStream(new FileInputStream(f));
            hm = (HashMap<Integer,Proxy>)s.readObject();
            s.close();
            for (Proxy proxy : hm.values()) {
                proxyList.add(proxy);
            }
            return proxyList;
        }catch(Exception ex){
            logger.error("Error getting proxies.");
            return null;
        }
    }
    
    /* The methods below are util functions not used now. Might be used in the future.*/
    private static int getInteger(int var, String val)
    {
        try{
            return Integer.parseInt(val); 
        }catch(Exception ex)
        {
            return var;
        }
    }
    
    private static boolean getBoolean(boolean var,String val)
    {
        if(val.toLowerCase().equals("true"))
            return true;
        else if(val.toLowerCase().equals("false"))
            return false;
        else return var; 
    }
    
    private static long getLong(long var, String val)
    {
        try{
            return Long.parseLong(val); 
        }catch(Exception ex)
        {
            return var;
        }
    }
    
}