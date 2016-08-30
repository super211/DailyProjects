package sg.com.java.mastercard.caterpillar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaterpillarTest {

	public static void main(String[] args) throws IOException{
	    Scanner in = new Scanner(System.in);
	    //final String fileName = System.getenv("OUTPUT_PATH");
	    //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	    long res;
	    
	    int num = Integer.parseInt(in.nextLine());
	    
	    int _arr_size = Integer.parseInt(in.nextLine());
	    int[] _arr = new int[_arr_size];
	    int _arr_item;
	    for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	        _arr_item = Integer.parseInt(in.nextLine());
	        _arr[_arr_i] = _arr_item;
	    }
	    
	    res = countUneatenLeaves(num, _arr);
	    //bw.write(String.valueOf(res));
	    //bw.newLine();
	    
	    //bw.close();
	    System.out.println(res);
	}
	
/*	public static int countUneatenLeaves(int N, int[] A) {
	    ArrayList<Integer> uneatenLeaves = new ArrayList<Integer>();
	    ArrayList<Integer> eatenLeaves = new ArrayList<Integer>();
	    for (int i = 1; i <= N; i++) {
	        uneatenLeaves.add(i);
	    }
	    
	    System.out.println("uneatenLeaves size: " + uneatenLeaves.size());
	    System.out.println("A size: " + A.length);
	    // 1. find the multiple of the eatenLeaves
	    for (int i = 0; i < A.length; i++) {
	        eatenLeaves.add(A[i]);
	        //for (int j = 1; j < uneatenLeaves.size(); j++) {
	        for (int j = 1; j < N; j++) {
	            if (A[i] * uneatenLeaves.get(j) <= N) {
	                eatenLeaves.add(A[i] * uneatenLeaves.get(j));
	            }
	        }
	    }
	    
	    //for(int i=0; i<eatenLeaves.size(); i++){
		//	System.out.print(eatenLeaves.get(i));
		//}
	    
	    for (int i = 0; i < eatenLeaves.size(); i++) {
	        for (int j = 1; j < uneatenLeaves.size(); j++) {
	            if (eatenLeaves.get(i) == uneatenLeaves.get(j)) {
	                uneatenLeaves.remove(uneatenLeaves.get(j));
	            }
	        }
	    }
	    //System.out.println(uneatenLeaves.size());
	    return uneatenLeaves.size();
	}*/
	
	public static int countUneatenLeaves(int N, int[] A) {
		List<Integer> eaten = new ArrayList<Integer>();
		List<Integer> uneaten = new ArrayList<Integer>();
		
		for(int i=1; i<=N; i++){
			uneaten.add(i);
		}
		
		for(int i=0; i<A.length; i++){
			eaten.add(A[i]);
			for(int j=1; j<N; j++){
				if(A[i]*uneaten.get(j) <= N){
					eaten.add(A[i]*uneaten.get(j));
				}
			}
		}
		
		for(int i=0; i<eaten.size(); i++){
			System.out.print(eaten.get(i));
		}
		
		for(int i=0; i<eaten.size(); i++){
			for(int j=1; j<uneaten.size(); j++){
				//if(eaten.get(i) == uneaten.get(j)){
				if(eaten.contains(uneaten.get(j))){
					uneaten.remove(j);
				}
			}
		}
		
		return uneaten.size();
	}
}
