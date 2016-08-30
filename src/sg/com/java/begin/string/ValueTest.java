package sg.com.java.begin.string;

public class ValueTest {
	
	String str = new String("good");

    char[] ch = { 'a', 'b', 'c' };

    public static void main(String args[]) {

    	ValueTest ex = new ValueTest();

        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");

        System.out.println(ex.ch);
        
        System.out.println(ex.ch.getClass().getName());
        
        ex.change(ex.str, ex.ch[0]);

        System.out.print(ex.str + " and ");

        System.out.println(ex.ch);

    }

    public void change(String str, char ch[]) {

        str = "test ok";
        str = str.replace('g', 'h');

        ch[0] = 'g';

    }
    
    public void change(String str, char ch){
    	str = "test ok";
        //str = str.replace('g', 'h');

        ch = '9';
    }
}