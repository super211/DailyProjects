/*
���������һ�����==����equals����   
��==���ǱȽ����������ǲ���������ͬһ������   
��equals�������ǱȽ�������������ݡ�  
���һ���ø���������������������ʱ�򣬿����ǻ�����ץ��ġ� 
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
