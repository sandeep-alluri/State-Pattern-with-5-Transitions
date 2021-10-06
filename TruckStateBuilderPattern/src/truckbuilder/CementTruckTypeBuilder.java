package truckbuilder;

public class CementTruckTypeBuilder extends TruckTypeBuilder{

	@Override
	public TruckTypeBuilder addBody() {
		System.out.println("Fire truck type body add");
		return new CementTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addEngine() {
		System.out.println("Fire truck Engine added ");
		return new CementTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addTyres() {
		System.out.println("Fire truck Engine added ");
		return new CementTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addBreaks() {
		System.out.println("Fire truck breaks added ");
		return new CementTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addColor() {
		System.out.println("Fire truck color added  ");
		return new CementTruckTypeBuilder();
	}

	 
}
