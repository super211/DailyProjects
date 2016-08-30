package sg.com.java.ncs.inter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

		public static void main(String[] args){
			Test3 t = new Test3();
			System.out.println(t.myMethod());
		}
		
		public int myMethod(){
			//return 0;
			try{
				FileInputStream dis = new FileInputStream("Hello.txt");
			}catch(FileNotFoundException fne){
				System.out.println("No such file found");
				return -1;
			}catch(IOException  ioe){
				
			}finally{
				System.out.println("Doing Finally");
				return 3;
			}
			//return 0;
		}
}
