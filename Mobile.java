package week1.day1.assignment1;

public class Mobile {
	
	public void makeCall() {
	    String mobileModel = "Infinix";
		float mobileWeight = 654.32f;
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 17000;
		
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	
	}
	
	public static void main(String[] args) {
		
		Mobile mb = new Mobile();
		mb.makeCall();
		mb.sendMsg();
		System.out.println("This is my mobile");
	}

}
