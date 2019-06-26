
public class test {
	
	public static int num=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t1=new test();
		t1.getnum();
	
	}

	
	public  static void getnum()
	{
		num=20;
		System.out.println(num);
	
		
	}
	public void printnum()
	{  num=50;
	System.out.println(num);
	
		getnum();
		System.out.println("Hi I am here");
	}
}
