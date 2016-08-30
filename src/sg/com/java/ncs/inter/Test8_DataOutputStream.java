package sg.com.java.ncs.inter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8_DataOutputStream {
	public static void main(String[] args) throws Exception{
		File file = new File("temp.test");
		FileOutputStream stream = new FileOutputStream(file);
		DataOutputStream filter = new DataOutputStream(stream);
		for(int i=0; i<10; i++){
			filter.writeInt(i);
			//filter.write(i);
		}
		filter.flush();
		//filter.close();
		
		FileInputStream istream = new FileInputStream(file);
		DataInputStream ifilter = new DataInputStream(istream);
		while(ifilter.available() > 0){
			int k = ifilter.readInt();
			System.out.println(k + "");
		}
		
		/*for(int i=0; i<10; i++){
			stream.writeInt(i);
		}*/
	}
}
