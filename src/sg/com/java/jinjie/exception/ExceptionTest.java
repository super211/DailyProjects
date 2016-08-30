/*
 * 
Checked异常，由编程与环境互动造成程序在运行时出错。是在java环境之外的，并不是程序员所能控制的。可以利用异常处理机制来制定应对预案。

Unchecked异常：
Error类通常是指java的内部错误以及如资源耗尽的错误。当Error发生时，我们不能在编程层面上解决Error，所以应该直接退出程序。
RuntimeException，是由java程序自身造成的，也就是说，由于程序员在编程时犯错。完全可以通过修正java程序避免。
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
