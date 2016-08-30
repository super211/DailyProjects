package sg.com.java.jinjie.serialization;

import java.io.Serializable;

public class CD implements Serializable{
	String title;
	String artist;
	
	public CD(String title, String artist){
		this.title = title;
		this.artist = artist;
	}
}
