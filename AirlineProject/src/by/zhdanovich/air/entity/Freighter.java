package by.zhdanovich.air.entity;



public class Freighter extends Plane {
	
private int rampArea;

public Freighter(int capacity, int carrying, int distance, int fuelConsumption, int id) {
	super(capacity, carrying, distance, fuelConsumption, id);	
}

public Freighter(int capacity, int carrying, int distance, int fuelConsumption, int rampArea, int id) {
	super(capacity, carrying, distance, fuelConsumption, id);
	this.rampArea = rampArea;
}

public int getRampArea() {
	return rampArea;
}

public void setRampArea(int rampArea) {
	this.rampArea = rampArea;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + rampArea;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Freighter other = (Freighter) obj;
	if (rampArea != other.rampArea)
		return false;
	return true;
}

@Override
public String toString() {
	return "Freighter [ "+ super.toString()+" "+"rampArea=" + rampArea + " ]";
}



}
