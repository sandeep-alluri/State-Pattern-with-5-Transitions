package truckbuilder;

public abstract class TruckTypeBuilder {
	
private Truck truck;
	
	String truckName;
	
	TruckType truckType;
	 
	public String getTruckName() {
		return truckName;
	}
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}
	public TruckType getTruckType() {
		return truckType;
	}
	public void setTruckType(TruckType truckType) {
		this.truckType = truckType;
	}
	
	public abstract TruckTypeBuilder addBody();
	public abstract TruckTypeBuilder addEngine();
	public abstract TruckTypeBuilder addTyres();
	public abstract TruckTypeBuilder addBreaks();
	public abstract TruckTypeBuilder addColor();
	public Truck getTruck() {
		return truck;
	}
	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	 



}
