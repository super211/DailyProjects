package sg.com.nets.pattern.test;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;

public class URLTest {
	public static void main(String[] args) throws UnsupportedEncodingException{
		URLClassLoader ucl = (URLClassLoader)Thread.currentThread().getContextClassLoader();
		for(URL url: ucl.getURLs()){
			File file = new File(URLDecoder.decode(url.getFile(), "UTF-8"));
			if(!(file.exists()&&file.canRead())) continue;
			if(file.isDirectory()){
				System.out.println(file);
			}else{
				System.out.println(file);
			}
		}
	}
}
