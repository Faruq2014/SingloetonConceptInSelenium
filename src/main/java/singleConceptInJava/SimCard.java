package singleConceptInJava;

public class SimCard {
	
	private static SimCard att=null;
	public static String str;
	
	private SimCard(){
		str="verizon sim card";
	}
	
	public static SimCard getSimCard() {
		
		if (att==null) {
			att=new SimCard();
		} 
		
		return att;
		
	}
	
	
	public void call() {
		System.out.println("I am calling safa");
	}
	
	
	
	

	public static void main(String[] args) {
	
		SimCard s = new SimCard();
	}

}
