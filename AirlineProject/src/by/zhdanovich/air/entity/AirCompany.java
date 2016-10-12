package by.zhdanovich.air.entity;

import java.util.ArrayList;
import java.util.List;

public class AirCompany {
	
private String nameAirCompany; 

public String getNameAirCompany() {
	return nameAirCompany;
}
public void setNameAirCompany(String nameAirCompany) {
	this.nameAirCompany = nameAirCompany;
}
public void setPlanes(List<Plane> planes) {
	this.planes = planes;
}

public AirCompany(String nameAirCompany) {
	super();
	this.nameAirCompany = nameAirCompany;	
}


public AirCompany() {
	super();
}

private List<Plane> planes = new ArrayList<Plane>();

public void addPlane(Plane plane){
 planes.add(plane);
} 
public void addPlanes(List<Plane> plane){
	 planes.addAll(plane);
	} 
public List<Plane> getPlanes(){
	return planes;
}
}
