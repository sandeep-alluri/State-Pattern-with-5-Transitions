package truckbuilder;

public class TruckBodyBuilder extends TruckTypeBuilder{

	@Override
	public TruckTypeBuilder addBody() {
		 System.out.println("Adding truck body ");
		return new TruckBodyBuilder();
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
		 
		return null;
	}

	@Override
	public TruckTypeBuilder addColor() {
		 
		return null;
	}

}
