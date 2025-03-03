package jaf2;

public class BookCatering {
	private static String[] availCuiArr= {"indian","italian","chinese"};
	private String cusName;
	private String cuis;
	public BookCatering(String cusName, String cuis) {
		
		this.cusName = cusName;
		this.cuis = cuis;
	}
	
	public boolean valCustomer() {
		if(this.cusName.length() >=3) {
			return true;
		}
		else {
			return false;
		}
}
	
	public Boolean valCuis() {
		for (int i = 0; i < availCuiArr.length; i++) {
			if(availCuiArr[i].equalsIgnoreCase(cuis)) {
				return true;
			}
		}
		
				return false;
			}
		
	}
		
	
