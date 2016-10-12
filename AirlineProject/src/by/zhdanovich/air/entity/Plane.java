package by.zhdanovich.air.entity;

public abstract class Plane {	
	private int capacity;
	private int carrying;	
	private int distance;
	private int fuelConsumption;
	private int idPlane;
public Plane(int capacity, int carrying, int distance, int fuelConsumption, int id) {
		super();
		this.capacity = capacity;
		this.carrying = carrying;
		this.distance = distance;
		this.fuelConsumption = fuelConsumption;
		this.idPlane = id;
	}

	@Override
	public String toString() {
		return "capacity=" + capacity + ", carrying=" + carrying + ", distance=" + distance
				+ ", fuelConsumption=" + fuelConsumption + ", id=" + idPlane ;
	}

	public int getId() {
		return idPlane;
	}

	public void setId(int id) {
		this.idPlane = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + capacity;
	result = prime * result + carrying;
	result = prime * result + distance;
	result = prime * result + fuelConsumption;
	result = prime * result + idPlane;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Plane other = (Plane) obj;
	if (capacity != other.capacity)
		return false;
	if (carrying != other.carrying)
		return false;
	if (distance != other.distance)
		return false;
	if (fuelConsumption != other.fuelConsumption)
		return false;
	if (idPlane != other.idPlane)
		return false;
	return true;
}

}
