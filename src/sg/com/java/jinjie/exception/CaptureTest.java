/*
考察多个catch语句块的执行顺序。当用多个catch语句时，catch语句块在次序上有先后之分。
从最前面的catch语句块依次先后进行异常类型匹配，这样如果父异常在子异常类之前，
那么首先匹配的将是父异常类，子异常类将不会获得匹配的机会，
也即子异常类型所在的catch语句块将是不可到达的语句。
所以，一般将父类异常类即Exception老大放在catch语句块的最后一个。
*/
package sg.com.java.jinjie.exception;

public class CaptureTest {

	public void getCustomerInfo() {

	    try {

	        // do something that may cause an Exception

	    } catch (java.io.FileNotFoundException ex) {

	        System.out.print("FileNotFoundException!");

	    } catch (java.io.IOException ex) {

	        System.out.print("IOException!");

	    } catch (java.lang.Exception ex) {

	        System.out.print("Exception!");

	    }

	}
	
	public static void main(String[] args){
		
	}
}

