package sg.com.java.jinjie.createobj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class CD implements Serializable{
	String title;
	String artist;
	
	public CD(String title, String artist){
		this.title = title;
		this.artist = artist;
	}
}

public class Method4SerializationTest {
	public static void main(String[] args){
		CD cd = new CD("hello", "world");
		
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
			CD cd1 = (CD)is.readObject();
			System.out.println(cd.artist);
			System.out.println(cd.title);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
