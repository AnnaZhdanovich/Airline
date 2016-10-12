package by.zhdanovich.air.action;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import by.zhdanovich.air.entity.AirCompany;
import by.zhdanovich.air.entity.Plane;

public class ActionAirCompany {
public int calculationOfCapacity(AirCompany company){
	int	totalCapacity = 0;
	for(Plane p : company.getPlanes()){
	totalCapacity += p.getCapacity();
	}
	return totalCapacity;	
}
public int calculationOfCarrying(AirCompany company){
	int	totalCapacity = 0;
	for(Plane p : company.getPlanes()){
	totalCapacity += p.getCarrying();
	}
	return totalCapacity;
}
public void sortCompany(AirCompany company){
	company.getPlanes().sort(new Comparator<Plane>(){ 
		public int compare(Plane o1, Plane o2) {        
        return o1.getFuelConsumption()-o2.getFuelConsumption();
      }		
	});
}

public List<Plane> searchPlane(AirCompany company, int min, int max){	
	List<Plane> result = new ArrayList<Plane>();
     for(Plane plane : company.getPlanes()){
             if (plane.getFuelConsumption() >= min && plane.getFuelConsumption()<= max) {
                 result.add(plane);
         }
     }
	return result;	
}
	

}
