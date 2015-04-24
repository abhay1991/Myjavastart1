
class OverloadingDemo{

	public static void main (String args[]){
		Overloading ob =new Overloading();
		double result;
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result = ob.test(123.25);
		System.out.println("result of ob.test : " +result);
	
	}
}
