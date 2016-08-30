package sg.com.java.jinjie.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			
			String content = "Thank you for your fish.";
			File file = new File("file.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		}catch(IOException e){
			//e.printStackTrace();
			System.out.println("IO Problem");
		}
	}
}
