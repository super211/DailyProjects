package sg.com.java.interv.eye20_zerototal.ok;

public class MyTest {

	public static int zeroTotalNum(int[] array){
		int total = 0;
		StringBuffer strBuf = new StringBuffer();
		
		for(int val:array){
			strBuf.append(String.valueOf(val));
		}
		System.out.println(strBuf.toString());
		total = strBuf.toString().replaceAll("1", "").length();		
		return total;
	}
	
	public static int zeroTotalNum2(int[] array){
		if(array==null||array.length==0){
			return 0;
		}
		int total = 0;
		for(int i=array.length-1; i>0; i--){
			if(array[i]==0){
				total++;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
 
        //int[] array1 = { 1, 1, 1 };
 
        int[] array = { 1, 1, 1, 0, 0 };
        int total = zeroTotalNum(array);
        total = zeroTotalNum2(array);
        System.out.println(total);
 
        //int[] array3 = { 0, 0, 0 };
 
    }
}
