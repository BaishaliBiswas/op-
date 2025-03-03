package jaf2;

public abstract class Caterer {
	
	private static int Counter=1001;
	private BookCatering bookCatering;
	private int noOfPlates;
	private double billAmt;
	private String bookingId;
	public Caterer(BookCatering bookCatering, int noOfPlates) {
		
		this.bookCatering = bookCatering;
		this.noOfPlates = noOfPlates;
	}
	public BookCatering getBookCatering() {
		return bookCatering;
	}
	
	public int getNoOfPlates() {
		return noOfPlates;
	}
	
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	
	public int idenDiscountPercent(double cost) {
		
	}
	
	public void genBookingId() {
		this.bookingId="C"+ Caterer.Counter++;
		
	}
	
	public int findCostPerPlate() {
		int costPerPlate=0;
		
		if(noOfPlates<25) {
			costPerPlate=-1;
		}
		else if (noOfPlates>=25 && noOfPlates <=100) {
			costPerPlate=300;	
		}
		else if (noOfPlates>=25 && noOfPlates <=100) {
			costPerPlate=200;		
		}
		else {
			costPerPlate=150;
		}
		return costPerPlate;
	}
	public abstract void calcBillAmount();
		
}
