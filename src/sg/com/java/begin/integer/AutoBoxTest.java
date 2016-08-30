/*
在这里，区别一个概念“==”和equals（）   
“==”是比较两个对象是不是引用自同一个对象。   
“equals（）”是比较两个对象的内容。  
这个一定得搞清楚，否则，在遇到问题的时候，可真是会让人抓狂的。 
*/
package sg.com.java.begin.integer;

public class AutoBoxTest {
	public static void main(String[] args){
/*		Integer data1 = 500; //false
		Integer data2 = 500; //false
*/		Integer data1 = -128; //-128 ~ 127 true
		Integer data2 = -128; //-128 ~ 127 true
		System.out.println(data1 == data2);
	}
}
