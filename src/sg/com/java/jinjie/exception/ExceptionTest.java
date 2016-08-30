/*
 * 
Checked�쳣���ɱ���뻷��������ɳ���������ʱ��������java����֮��ģ������ǳ���Ա���ܿ��Ƶġ����������쳣����������ƶ�Ӧ��Ԥ����

Unchecked�쳣��
Error��ͨ����ָjava���ڲ������Լ�����Դ�ľ��Ĵ��󡣵�Error����ʱ�����ǲ����ڱ�̲����Ͻ��Error������Ӧ��ֱ���˳�����
RuntimeException������java����������ɵģ�Ҳ����˵�����ڳ���Ա�ڱ��ʱ������ȫ����ͨ������java������⡣
 */

package sg.com.java.jinjie.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try{
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while(line != null){
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			String everything = sb.toString();
			System.out.println(everything);
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("IO Problem");
		}finally{
			br.close();
		}
	}
}
