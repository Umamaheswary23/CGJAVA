import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;
public class DemoLog4J {

	public static void main(String[] args) {
	Logger myLogger = Logger.getLogger(DemoLog4J.class.getName());
	PropertyConfigurator.configure("resources/log4j.properties");
	int a=-1;
	boolean flag=false;
	//myLogger.setLevel((Level)Priority.WARN);
	myLogger.info("Logging information");
	myLogger.debug("code debugging strted");
	if(a<0) {
		myLogger.warn("This is last time warning");
	}
	if(flag==false) {
		myLogger.error("Error occured due to false value");
	}
	}

}
