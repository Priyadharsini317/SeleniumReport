package week3.day2;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("The id is: "+id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The id is: "+id);
		
		System.out.println("Name is: "+name);

	}
	public void getStudentInfo(String email,long mobileNum) {
		System.out.println("Email is: "+email);
		
		System.out.println("MoileNumber is: "+mobileNum);

	}
	
	public static void main(String[] args) {
		
		Students stu = new Students();
		stu.getStudentInfo(001);
		stu.getStudentInfo(002, "priya");
		stu.getStudentInfo("pri678@gmail.com", 9876543210l);
	}

}
