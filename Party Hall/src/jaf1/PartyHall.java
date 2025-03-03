package jaf1;

public class PartyHall extends Hall {
	private int numOfHours;

	public PartyHall(int numOfHours, float price) {
		super(price,"Party");
		this.numOfHours = numOfHours;
	}

	public int getNumOfHours() {
		return numOfHours;
	}

	@Override
	public void calcPrice() {
		float totalPrice=0;
		int count1=0;
		int count2=0;
	
		if(numOfHours>=4 && numOfHours<=9){
			if(numOfHours==4) {
				totalPrice=super.getPrice();
				super.setPrice(totalPrice);
			}
			else if(numOfHours>=5 && numOfHours<=7) {
				for (int i = 5; i <=numOfHours; i++) {
					count1++;
				}
				totalPrice=super.getPrice()+1000*count1;
				super.setPrice(totalPrice);	
				}
			else if(numOfHours>7) {
				for (int i = 8; i < numOfHours; i++) {
					count2++;	
				}
				totalPrice=super.getPrice()+3000+2000*count2;
				super.setPrice(totalPrice);	
			}
			}
		}
				
		
	}
	
	
	
	
