package truckbuilder;

public class TruckEngineBuilder extends TruckTypeBuilder {

	@Override
	public TruckTypeBuilder addBody() {
		 
		return null;
	}

	@Override
	public TruckTypeBuilder addEngine() {
		 System.out.println("Adding truck engine");
		return new TruckEngineBuilder();
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
