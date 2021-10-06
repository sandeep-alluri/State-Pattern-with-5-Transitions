package truckbuilder;

public class TruckTyresBuilder extends TruckTypeBuilder{
	
	private Truck truck;

	@Override
	public TruckTypeBuilder addBody() {
		 
		return null;
	}

	@Override
	public TruckTypeBuilder addEngine() {
		 
		return null;
	}

	@Override
	public TruckTypeBuilder addTyres() {
		 System.out.println("Adding truck tyres");
		return new TruckTyresBuilder();
	}

	@Override
	public TruckTypeBuilder addBreaks() {
		 
		return null;
	}

	@Override
	public TruckTypeBuilder addColor() {
		 
		return null;
	}

	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		System.out.println("Building a fire trunk...");
		this.truck = truck;
	}

}
