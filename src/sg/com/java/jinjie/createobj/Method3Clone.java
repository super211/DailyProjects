

package sg.com.java.jinjie.createobj;
	
class Cars implements Cloneable{
	private String a = "hello";
	public void drive(){
		System.out.println("Drive many cars");
	}
	
	public String getA(){
		return this.a;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return (Cars)super.clone();
	}
}
public class Method3Clone {
	public static void main(String[] args) throws CloneNotSupportedException{
		Cars car1 = new Cars();
		Cars car2 = (Cars)car1.clone();
		System.out.println(car1.getA() == car2.getA());
		car2.drive();
	}
}
