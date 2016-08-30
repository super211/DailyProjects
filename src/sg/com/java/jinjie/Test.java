package sg.com.java.jinjie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	/*public static void main(String[] args) throws IOException{
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader("file.txt"));
			String str = bf.readLine();
			System.out.println(str);
			bf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bf.close();
		}
		
	}*/
	
	public static void main(String[] args){
		for(int i=0; i<1000000000; i++){
			SessionFactory insSF = new Configuration().configure()
					.buildSessionFactory();
			Session insSession = insSF.openSession();
			System.out.println(i);
		}
	}
}
