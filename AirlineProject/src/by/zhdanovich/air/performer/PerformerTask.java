package by.zhdanovich.air.performer;

import java.util.List;
import by.zhdanovich.air.action.ActionAirCompany;
import by.zhdanovich.air.creator.FactoryPlane;
import by.zhdanovich.air.entity.AirCompany;
import by.zhdanovich.air.entity.Plane;
import by.zhdanovich.air.exception.NoPlaneException;
import by.zhdanovich.air.reader.ReaderText;


public class PerformerTask {
	
private final String FILE_DATA="text/data.txt";

public void doAction() throws NoPlaneException{
ReaderText reader = new ReaderText();
FactoryPlane factory = new FactoryPlane();
List<String> list = reader.readText(FILE_DATA);
List<Plane> planes = factory.createPlanes(list);		
AirCompany company;
	if(planes.isEmpty()){
			throw new NoPlaneException("List of planes is empty, company can not be creatd");		
	}else{	
		company = new AirCompany();
		company.addPlanes(planes);
		}	
	this.showReport(company);
}	

private void showReport(AirCompany company){	
ActionAirCompany action = new ActionAirCompany();	
action.sortCompany(company);
System.out.println("<<<<Result of Sorting by distanñe:");	
	for(Plane p:company.getPlanes()){
		System.out.println(p);			
	}
	System.out.println("<<<<Totaly Carrying:"+" "+ action.calculationOfCarrying(company) );
	System.out.println("<<<<Totaly Capacity:"+" "+action.calculationOfCapacity(company) );	
	System.out.println("<<<<Search by fuel consumption:");		
	List<Plane> result = action.searchPlane(company, 10, 1000);	
	for(Plane p:result){
		System.out.println(p);			
	}
	}

}


