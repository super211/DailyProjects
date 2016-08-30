/*
 * 
 The main difference between checked and unchecked exception is that the checked exceptions are checked at compile-time 
 while unchecked exceptions are checked at runtime.
 
Here are the few most frequently seen unchecked exceptions:

NullPointerException
ArrayIndexOutOfBoundsException
ArithmeticException
IllegalArgumentException

ArithmeticException is also an unchecked exception.
Note: It doesn’t mean that compiler is not checking these exceptions so we shouldn’t handle them. 
In fact, we should handle them more carefully. For e.g. In the below example there should be a exception message 
to user that they are trying to display a value which doesn’t exist in array so that user would be able to correct the issue.
 */

package sg.com.java.jinjie.exception;

public class UncheckedArithmeticTest {
	public static void main(String[] args){
		/*
		Unreachable code
		 第二种用法是，代码执行到此处终止。
		比如当代码执行到某个地方会出现几种结果，然后其中一种结果就不能执行后续代码，这时候在那里加上一个return就可以终止后面的代码执行。
		 */
		//return; 
		try{
			int num1 = 10;
			int num2 = 0;
			
			int res = num1/num2;
			System.out.println(res);
		}catch(ArithmeticException e){
			System.out.println("You cannot divided by 0");
		}
	}
}
