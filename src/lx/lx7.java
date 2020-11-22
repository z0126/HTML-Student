package lx;

class Outer{
	private int num=4;
	public void test()
	{
		Inner inner=new Inner();
		inner.show();
	}
	class Inner{
		void show()
		{
			System.out.print("num="+num);
		}
	}
}
public class lx7 {
	public static void main(String[] args) {
		Outer.Inner inner=new Outer().new Inner();
		inner.show();
	}
}