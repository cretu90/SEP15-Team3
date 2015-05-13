/**
 * 
 */
package de.OfCourse.system;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * @author 
 *
 */
@ManagedBean
@ApplicationScoped
public class LaunchSystem {
    
    /**
     * 
     */
    @PostConstruct
    public void startSystem() {
    }

    /**
     * 
     */
    @PreDestroy
    public void shutdownMaintenance() {
    }
}
