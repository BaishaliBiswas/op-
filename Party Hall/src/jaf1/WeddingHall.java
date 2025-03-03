package jaf1;

public class WeddingHall extends Hall {
	
	private int noOfDays;
	private String[] decRequired;
	private static String[] decMaterials= {"flowers","lights","royalchair","LEDTV"};
	private static int[] decMatlsPrice= {5000,4000,1000,3000};
	
	public WeddingHall(float price, String hallType, int noOfDays, String[] decRequired) {
		super(price, "Wedding");
		this.noOfDays = noOfDays;
		this.decRequired = decRequired;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public String[] getDecRequired() {
		return decRequired;
	}
	
	public Integer calcDecAmt() {
		int amount =0;
		for (int i = 0; i < decMaterials.length; i++) {
		if(decMaterials[i].equals(decMaterials)) {
			amount=amount+decMatlsPrice[i];
		}
		}
		return amount;
	}
	
	@Override
	public void calcPrice() {
		
		float priceb=super.getPrice()+calcDecAmt();
		float baseprice=priceb*noOfDays;
		float totalPrice=0;
		
		if(baseprice>100000 ) {
		
		int discPercent=7;
		
		totalPrice = (float)(baseprice*(1-7/100.0));
		}
		else if(baseprice>80000 ) {
			
			int discPercent=3;
			
		totalPrice = (float)(baseprice*(1-3/100.0));
			}
		else {
			totalPrice=baseprice;
		}
		super.setPrice(totalPrice);
		super.calTax();
		super.genId();
			
	}

	
	
	
	
	
	
	
	

}