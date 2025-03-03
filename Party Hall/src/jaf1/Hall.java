package jaf1;

public abstract class Hall {
	
	private float price;
	private String hallType;
	private String hallId;
	private static int counter=101;
	public Hall(float price, String hallType) {
		
		this.price = price;
		this.hallType = hallType;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getHallType() {
		return hallType;
	}
	public void setHallType(String hallType) {
		this.hallType = hallType;
	}
	public String getHallId() {
		return hallId;
	}
	public void setHallId(String hallId) {
		this.hallId = hallId;
	}
	
	public void genId() {
		if(hallType.equals("Party")) {
		this.hallId="P"+ Hall.counter++;	
        }
		
			if(hallType.equals("Wedding")) {
			this.hallId="W"+ Hall.counter++;	
	        }
		
	}
	
	public void calTax() {
	}
	
	public abstract void calcPrice();
	}
	
