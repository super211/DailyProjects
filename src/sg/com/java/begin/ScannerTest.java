package sg.com.java.begin;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) throws IOException{
		double sum = 0.0;
		int count = 0;
		FileWriter fout = new FileWriter("text.txt");
		fout.write("2 2.2 3 3.3 4 4.5 done");
		fout.close();
		FileReader fin = new FileReader("text.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(fin);
		while(scanner.hasNext()){
			if(scanner.hasNextDouble()){
				sum = sum + scanner.nextDouble();
				count ++;
			}else{
				String str = scanner.next();
				if(str.equals("done")){
					break;
				}else{
					System.out.println("File format error!");
					return;
				}
			}
		}
		fin.close();
		System.out.println("The average of file data is: " + sum/count);
	}
}
