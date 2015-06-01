package de.ofCourse.system;

import java.io.IOException;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import de.ofCourse.utilities.PropertyManager;

/**
 * @author blacky
 *
 */
public class LogSetup {
    /**
     * 
     */
    private static final Logger logger = LogManager.getLogger("OfCourse");

    
    /**
     * @throws IOException
     */
    LogSetup() throws IOException{
        logSetup();
        //TODO Error Handling
    }
    /**
     * @throws IOException
     */
    private void logSetup() throws IOException {
        PatternLayout layout = new PatternLayout("%-5p [%t]: %m%n");
        DailyRollingFileAppender fileAppender = new DailyRollingFileAppender(
                layout, PropertyManager.getInstance().getPropertyLogger(
                        "logfilepath")
                        + "MyLog", "'.'yyyy-MM-dd_HH-mm");
        logger.addAppender(fileAppender);
        //Sets the level input from properties
        logger.setLevel(Level.toLevel(PropertyManager.getInstance().getPropertyLogger("loglvl")));
        //TODO Error Handling
    }
    
    /**
     * @param log
     */
    public static void fatal(String log){
        logger.fatal(log);
    }
    
    public static void error(String log){
        logger.error(log);
    }
    
    public static void debug(String log){
        logger.debug(log);
    }
}
