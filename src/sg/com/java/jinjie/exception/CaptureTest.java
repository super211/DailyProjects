/*
������catch�����ִ��˳�򡣵��ö��catch���ʱ��catch�����ڴ��������Ⱥ�֮�֡�
����ǰ���catch���������Ⱥ�����쳣����ƥ�䣬����������쳣�����쳣��֮ǰ��
��ô����ƥ��Ľ��Ǹ��쳣�࣬���쳣�ཫ������ƥ��Ļ��ᣬ
Ҳ�����쳣�������ڵ�catch���齫�ǲ��ɵ������䡣
���ԣ�һ�㽫�����쳣�༴Exception�ϴ����catch��������һ����
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

