package sg.com.java.begin.cycle;

public class For_ForTest {
	public static void main(String[] args){
		int i, j, l;
		/*for(i=1; i<=9; i++){
			for(j=i; j<=9; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
		/*for(i=1; i<=9; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
/*		for(i=9; i>=1; i--){
			for(j=9; j>=i; j--){
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
/*		for(i=9; i>=1; i--){
			for(j=i; j>=1; j--){
				System.out.print(" ");
			}
			for(l=9; l>=i; l--){
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
		/*
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
		 */
		
		itcast:for(i=1; i<=9; i++){
			for(j=1; j<=i; j++){
				if(i > 4){
					break itcast;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
