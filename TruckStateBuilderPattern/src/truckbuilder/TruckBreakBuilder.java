package truckbuilder;

public class TruckBreakBuilder extends TruckTypeBuilder{

	@Override
	public TruckTypeBuilder addBody() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TruckTypeBuilder addEngine() {
		 
		return null;
	}

	@Override
	public TruckTypeBuilder addTyres() {
		 
		return null;
	}

	@Override
	public TruckTypeBuilder addBreaks() {
		 System.out.println("Adding Truck Break system ");
		return new TruckBreakBuilder();
	}

	@Override
	public TruckTypeBuilder addColor() {
		 
		return null;
	}

}
