package sg.com.java.jinjie.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Shape{
	public String name = "shape";
	public int area = 20;
}

class Circle extends Shape implements Serializable{
	private float radius = 10.0f;
	transient int color = 10;
	public static String type = "Circle";
	
	public float getRadius(){
		return this.radius;
	}
}

class Circle2 extends Shape implements Externalizable{
	private float radius = 10.0f;
	transient int color = 10;
	public static String type = "Circle";
	
	public Circle2(){
		/* No valid constructor during serialization
		 should have an accessible (public or protected) no-args constructor 
		 so that the serialization reflection mechanism can create an instance of the class:
		 */
	}
	
	public float getRadius(){
		return this.radius;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeFloat(radius);
		out.write(color);
		out.writeObject(type);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		radius = in.readFloat();
		color = in.read();
		type = (String)in.readObject();
	}
}

public class TransientTest {
	
	public static void main(String[] args){
		Circle circle = new Circle();
		
		try {
			FileOutputStream fs = new FileOutputStream("Circle.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(circle);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fi = new FileInputStream("Circle.ser");
			ObjectInputStream is = new ObjectInputStream(fi);
			Circle cir = (Circle)is.readObject();
			System.out.println(cir.color);
			System.out.println(cir.name);
			System.out.println(cir.getRadius());
			System.out.println(cir.area);
			System.out.println(cir.type);
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Circle2 cir2 = new Circle2();
		try {
			FileOutputStream fs2 = new FileOutputStream("Circle2.ser");
			ObjectOutputStream os2 = new ObjectOutputStream(fs2);
			os2.writeObject(cir2);
			os2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fi2 = new FileInputStream("Circle2.ser");
			ObjectInputStream is2 = new ObjectInputStream(fi2);
			Circle2 cir3 = (Circle2)is2.readObject();
			System.out.println(cir3.color);
			System.out.println(cir3.name);
			System.out.println(cir3.getRadius());
			System.out.println(cir3.area);
			System.out.println(cir3.type);
			is2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
