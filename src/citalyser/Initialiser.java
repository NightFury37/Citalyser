/*****************************************************************
 * @author Abhishek Choudhary
 * @Email-id : abhishek@codeblues.in
 *****************************************************************/
package citalyser;

import java.io.File;
import org.apache.log4j.Logger;

public class Initialiser {
    
    static Logger logger = Logger.getLogger(Initialiser.class.getName());
    
    public static void init()
    {
        logger.info("Initialising App directory");
        String userHome = System.getProperty("user.home");
        if(userHome == null)
            userHome = ".";
        File home = new File(userHome);
        Main.settingsDirectory = new File(home,".citalyser");
        if(!Main.settingsDirectory.exists())
        {
            if(!Main.settingsDirectory.mkdir())
            {
                logger.error("Failed to create Settings Directory. Exiting..");
                //System.exit(0);
                return;
            }
            else
                logger.info("Created app directory at : " + Main.settingsDirectory.getAbsolutePath());
        }
        else
            logger.info("App Directory already present at  " + Main.settingsDirectory.getAbsolutePath());
        
        initCache();
    }
    
    public static void initCache()
    {
        Main.CacheDirectory = new File(Main.settingsDirectory,"Cache");
        if(!Main.CacheDirectory.exists())
        {
            if(!Main.CacheDirectory.mkdir())
            {
                logger.error("Failed to create Cache Directory. Exiting..");
                //System.exit(0);
                return;
            }
            else
                logger.info("Created app directory at : " + Main.settingsDirectory.getAbsolutePath());
        }
        else
            logger.info("App Directory already present at  " + Main.settingsDirectory.getAbsolutePath());
        
    }
    
    
    
}
