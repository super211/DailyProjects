package sg.com.java.interv.eye3_recursionrevert.ok;

/*http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=712
使用递归算法反转字符串

联想：C语言中可直接使用指针移动，每次打印输出第一位字符串
 */

public class MineTest {
	public static String recursionRevert(String str){
		if(str.isEmpty())
			return str;

		return recursionRevert(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args){
		String str="hello";
		String str2;
		str2 = recursionRevert(str);
		System.out.println(str2);
	}
}
