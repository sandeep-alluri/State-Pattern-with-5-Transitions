package truckbuilder;

public class Truck {
	
	public Truck() {
		
	}
	
	public String truckBody ;
	
	public String truckEngine ;
	
	public String truckTyre;
	
	public String truckBreak;
	
	public String truckColor;

	public String getTruckBody() {
		return truckBody;
	}

	public void setTruckBody(String truckBody) {
		this.truckBody = truckBody;
	}

	public String getTruckEngine() {
		return truckEngine;
	}

	public void setTruckEngine(String truckEngine) {
		this.truckEngine = truckEngine;
	}

	public String getTruckTyre() {
		return truckTyre;
	}

	public void setTruckTyre(String truckTyre) {
		this.truckTyre = truckTyre;
	}

	public String getTruckBreak() {
		return truckBreak;
	}

	public void setTruckBreak(String truckBreak) {
		this.truckBreak = truckBreak;
	}

	public String getTruckColor() {
		return truckColor;
	}

	public void setTruckColor(String truckColor) {
		this.truckColor = truckColor;
	}

	public Truck(String truckBody, String truckEngine, String truckTyre, String truckBreak, String truckColor) {
		super();
		this.truckBody = truckBody;
		this.truckEngine = truckEngine;
		this.truckTyre = truckTyre;
		this.truckBreak = truckBreak;
		this.truckColor = truckColor;
	}
	
	
	

}
