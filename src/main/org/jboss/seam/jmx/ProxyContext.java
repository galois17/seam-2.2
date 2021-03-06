package org.jboss.seam.jmx;

import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 *
 * @author  <a href="mailto:juha@jboss.org">Juha Lindfors</a>.
 * @version $Revision: 81019 $
 *   
 */
public interface ProxyContext
{
   void setExceptionHandler(ProxyExceptionHandler handler);
   
   MBeanServer getMBeanServer();
   
   ObjectName getObjectName();
}
      



