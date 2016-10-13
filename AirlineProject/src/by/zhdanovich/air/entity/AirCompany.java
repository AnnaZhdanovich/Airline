package by.zhdanovich.air.entity;

import java.util.ArrayList;
import java.util.List;

public class AirCompany {
	
private List<Plane> planes = new ArrayList<Plane>();

public AirCompany() {
	super();
}

public void addPlane(Plane plane){
 planes.add(plane);
}
 
public void addPlanes(List<Plane> plane){
	 planes.addAll(plane);
} 

public void setPlanes(List<Plane> planes) {
	this.planes = planes;
}

public List<Plane> getPlanes(){
	return planes;
}
}
