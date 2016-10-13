package by.zhdanovich.air.start;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.zhdanovich.air.exception.NoPlaneException;
import by.zhdanovich.air.performer.PerformerTask;

public class StartProject {		
	
private static Logger log = LogManager.getLogger(StartProject.class);

public static void main (String[] args){
PerformerTask performer = new PerformerTask();
		try {
			performer.doAction();
		} catch (NoPlaneException e) {
			log.error("Can not create aircompany", e);	
		}catch (RuntimeException e) {
			log.error("File of data do not found", e);	
		}
	}	
}
