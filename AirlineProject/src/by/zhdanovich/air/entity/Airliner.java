package by.zhdanovich.air.entity;

public class Airliner extends Plane{
	
private  int  speed;
	
public Airliner(int capacity, int carrying, int distance, int fuelConsumption, int id) {
super(capacity, carrying, distance, fuelConsumption, id);

}
	public Airliner(int capacity, int carrying, int distance, int fuelConsumption, int speed, int id) {
	super(capacity, carrying, distance, fuelConsumption, id );
	this.speed = speed;
}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + speed;
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
	Airliner other = (Airliner) obj;
	if (speed != other.speed)
		return false;
	return true;
}


	public int getSpeed() {
	return speed;
}


public void setSpeed(int speed) {
	this.speed = speed;
}


	@Override
	public String toString() {
		return "Airliner [ "+ super.toString()+" "+"speed=" + speed+" ]";
	}
	
	
	

}
