package sg.com.java.interv.eye6_statistics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*http://mouselearnjava.iteye.com/blog/2152420
 http://thecodesample.com/?p=735
 找出三个有序数组共有的元素。
 */

public class CharacterStatictics {

	public static void main(String[] args) {

		int chineseCharCount = 0;
		int spaceCount = 0;
		int digitCount = 0;
		int lettersCount = 0;
		int otherChars = 0;

		String value = "Hello world! Welcome to Java world! 1234567890 Java 字符统计个数小程序！";
		char[] chars = value.toCharArray();
		for (char c : chars) {
			if (isChineseCharacter(c)) {
				chineseCharCount++;
			} //else if (Character.isLetter(c)) {
			else if(isLetter(c)){
				lettersCount++;
			} //else if (Character.isDigit(c)) {
			else if (isDigit(c)) {
				digitCount++;
			} else if (' ' == c) {
				spaceCount++;
			} else {
				otherChars++;
			}
		}

		System.out.println("中文字符:" + chineseCharCount);
		System.out.println("数字:" + digitCount);
		System.out.println("字母:" + lettersCount);
		System.out.println("空格:" + spaceCount);
		System.out.println("其它字符:" + otherChars);
		
		System.out.println(isDigit("012345"));
		System.out.println("isDigit2: " + isDigit2(""));
		System.out.println(isLetter("helloWorld"));
		System.out.println(isString("hello"));
		
	}

	private static boolean isChineseCharacter(char c) {
		return c >= '\u4E00' && c <= '\u9FBF';
	}
	
	private static boolean isDigit(char c){
		
		/*Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(String.valueOf(c));
		boolean matches = matcher.matches();
		return matches;*/
		//return Pattern.compile("\\d+").matcher(String.valueOf(c)).lookingAt();
		return Pattern.compile("\\d+").matcher(String.valueOf(c)).matches();
	}
	
	private static boolean isLetter(char c){
		//Pattern pattern = Pattern.compile("\\w+");
		/*Pattern pattern = Pattern.compile("\\[a-z][A-Z]+");
		Matcher matcher = pattern.matcher(String.valueOf(c));
		boolean matches = matcher.matches();
		return matches;*/
		
		return Pattern.compile("[a-zA-Z]+").matcher(String.valueOf(c)).matches();
	}

	private static boolean isDigit(String input){
		return Pattern.compile("\\d+").matcher(input).matches();
	}
	
	private static boolean isDigit2(String input){
		return Pattern.compile("[\\d]+").matcher(input).matches();
	}
	
	private static boolean isLetter(String input){
		return Pattern.compile("[a-zA-z]+").matcher(input).matches();
	}

	private static boolean isString(String input){
		return Pattern.compile("\\bhello\\b").matcher(input).matches();
	}
}