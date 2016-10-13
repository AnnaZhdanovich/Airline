package by.zhdanovich.air.creator;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.zhdanovich.air.entity.Airliner;
import by.zhdanovich.air.entity.Freighter;
import by.zhdanovich.air.entity.Plane;
import by.zhdanovich.air.exception.WrongDataException;
import by.zhdanovich.air.parser.ParserText;

public class FactoryPlane {	
	
private static Logger log = LogManager.getLogger(FactoryPlane.class);
	
public List<Plane> createPlanes(List <String> list){	
	ParserText parser = new ParserText();
	List<Plane> planes = new ArrayList<Plane>();
	Plane p;
	int idPlane = 1;
	List<Integer> parametrs;	
	for(String s: list){		
	try {
		parametrs = parser.parseText(s);		
		parametrs.add(6,idPlane);		
		p = this.createPlane(parametrs);
		planes.add(p);
		idPlane++;
	} catch (WrongDataException e) {
		log.error("Error source data", e);	
	}
	}
	return planes;	
}
	
public Plane createPlane(List<Integer> background) throws WrongDataException{	
	 switch(background.get(0)){
	   case 0:		  
		  	   return  new Airliner(background.get(1),background.get(2), background.get(3), background.get(4), background.get(5), background.get(6));	   
	  
	   case 1:
		       return  new Freighter(background.get(1),background.get(2), background.get(3), background.get(4), background.get(5), background.get(6));
		   
	   default: throw new WrongDataException("Data are wrong, this type of plane does not exist ");
	   }  
}
}