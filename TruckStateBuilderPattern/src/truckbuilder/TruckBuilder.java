package truckbuilder;

public abstract class TruckBuilder {
	
	String truckName;
	
	TruckType truckType;
	Truck truck = new Truck();
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
	
	public abstract TruckBuilder addBody();
	public abstract TruckBuilder addEngine();
	public abstract TruckBuilder addTyres();
	public abstract TruckBuilder addBreaks();
	public abstract TruckBuilder addColor();
	 

}
