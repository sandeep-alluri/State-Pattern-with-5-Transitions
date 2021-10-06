package truckbuilder;

public class FireTruckTypeBuilder extends TruckTypeBuilder{

	@Override
	public TruckTypeBuilder addBody() {
		System.out.println("Fire truck type body added");
		return new FireTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addEngine() {
		System.out.println("Fire truck Engine added ");
		return new FireTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addTyres() {
		System.out.println("Fire truck Tyres added ");
		return new FireTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addBreaks() {
		System.out.println("Fire truck breaks added ");
		return new FireTruckTypeBuilder();
	}

	@Override
	public TruckTypeBuilder addColor() {
		System.out.println("Fire truck color added  ");
		return new FireTruckTypeBuilder();
	}

	 
}
