package sg.com.java.jinjie.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args){
		CD cd = new CD("hibernate", "gongping");
		
		try{
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(cd);
			os.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		try{
			FileInputStream fi = new FileInputStream("foo.ser");
			ObjectInputStream is = new ObjectInputStream(fi);
			CD  o = (CD)is.readObject();
			System.out.println(o.artist);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
