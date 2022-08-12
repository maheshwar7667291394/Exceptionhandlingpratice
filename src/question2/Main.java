package question2;

public class Main {
	public static void display(int age)throws Exception {
		if(age<40) {
			System.out.println("valid age");
		}
		else {
			InvalidAge ae=new InvalidAge("enter the valid age");
			throw ae;
		}
	}
	public static void main(String[] args) {
		try {
			display(50);
		} catch (Exception e) {
//		
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(	e.getMessage());
			
		}
	}

}
