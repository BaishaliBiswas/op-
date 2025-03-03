package jaf2;

public class WeddingCaterer extends Caterer {
private int noOfDays;
private String serviceType;


public WeddingCaterer(BookCatering bookCatering, int noOfPlates, int noOfDays, String serviceType) {
	super(bookCatering, noOfPlates);
	this.noOfDays = noOfDays;
	this.serviceType = serviceType;
}

@Override
public void calcBillAmount() {
	boolean isCustomer = getBookCatering().valCustomer();
	boolean isCuisine = getBookCatering().valCuis();
	if(isCustomer ==true && isCuisine==true && noOfDays>=1) {
		int costPerPlate = findCostPerPlate();
		if(costPerPlate !=-1) {
		 genBookingId();
		 
		 double basicCost=(costPerPlate)*(getNoOfPlates());
		 
		 int discountPercentage= idenDiscountPercent(basicCost);
		 
		  basicCost=basicCost-(basicCost*discountPercentage/100);
	
         if (serviceType.equals("Buffet")) {
        	 basicCost=basicCost+5000.0;
         }
		
         setBillAmt(basicCost*noOfDays);
		}
		
		else {
			setBookingId("-1");
			setBillAmt(-1.0);
		}
	}
	
		else {
			setBookingId("-1");
			setBillAmt(-1.0);
		}
		
		}
}