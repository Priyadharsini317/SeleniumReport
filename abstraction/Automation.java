package week4.abstraction;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public void Selenium() {
		System.out.println("Automation");
		
	}

	public void Java() {
		System.out.println("Most used language");
		
	}

	@Override
	public void ruby() {
		System.out.println("Programming Language");
		
	}
	
	public static void main(String[] args) {
		
		Automation obj = new Automation();
		obj.Java();
		obj.Python();
		obj.ruby();
		obj.Selenium();
	}

}
