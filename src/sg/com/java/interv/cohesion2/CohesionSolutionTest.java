package sg.com.java.interv.cohesion2;


//Cohesion is a measure of how related the responsibilities of a class are.
//This class is downloading from internet, parsing data and storing data to database
//The responsibilities of this classes are not really related. This is not cohesive

/*class DownloadAndStore{
	void downloadFromInternet(){
	}
	
	void parseData(){
		
	}
	
	void storeIntoDatabase(){
		
	}
	
	void doEverything(){
		downloadFromInternet();
		parseData();
		storeIntoDatabase();
	}
}*/


//This a better way of approaching the problem. Different classes have 
//their own responsibilities.
class InternetDownloader{
	public void downloadFromInternet(){
		
	}
}

class DataParser{
	public void parseData(){
		
	}
}

class DatabaseStorer{
	public void storeIntoDatabase(){
		
	}
}

class DownloadAndStore{
	void doEverything(){
		new InternetDownloader().downloadFromInternet();
		new DataParser().parseData();
		new DatabaseStorer().storeIntoDatabase();
	}
}

public class CohesionSolutionTest {

}
