package sg.com.java.interv.cohesion;


//Cohesion is a measure of how related the responsibilities of a class are.
//This class is downloading from internet, parsing data and storing data to database
//The responsibilities of this classes are not really related. This is not cohesive

class DownloadAndStore{
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
}

public class CohesionTest {

}
