package sg.com.java.begin.numeric;

/*
ע������case����û�м�break�����Դ�case 2��ʼһֱ�������С�
 */

public class SwithTest {
	
	public static void main(String[] ags){
		int value = getValue(2);
		System.out.println(value);
	}
	public static int getValue(int i) {
        int result = 0;
        switch (i) {
        case 1:
            result = result + i;
        case 2:
            result = result + i * 2;
        case 3:
            result = result + i * 3;
        }
        return result;
    }
}
