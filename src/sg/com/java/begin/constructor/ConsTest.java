/*
���췽�� Ҳ��һ�ַ���
Ψһ����������
1) ���췽����û�з������͵ġ�
2�����췽���������ͬ��

4. ����˵����ȷ���У���

A�� class�е�constructor����ʡ��

B�� constructor������classͬ����������������classͬ��

C�� constructor��һ������newʱִ��

D��һ��classֻ�ܶ���һ��constructor

�𰸣�C 

������������ܻ�����������ʵ��ͨ���෽���ǿ��Ժ�����ͬ���ģ��͹��췽��Ψһ�����־��ǣ����췽��û�з������͡�

����Ȩ���������С�
��ҵת������ϵ���߻����Ȩ������ҵת����ע��������
���ߣ����ɷ�
���ӣ�http://www.zhihu.com/question/20473938/answer/15265721
��Դ��֪��

����������ڲ���ɲ��֣�������������ض��Ķ�����      �����Ķ������Ҫ�з���ֵ�������η�������һ��������������û�з���ֵ������ؼ�����void��void���η���������ʾ����û�з���ֵ������nullʲô�ģ�
����û�з���ֵ��       ���췽�������캯������һ������ķ���������������ͬ�����֣�û����ʽ�ķ���ֵ������Ĭ��ǿ��void��      ����˵���췽���Ϳշ�������void������       ����˵�շ����͹��췽�������𡣹��췽�����౻��ʼ��ʱ��
���ݲ������漰�������أ��Զ����ù��췽�������������ͬʱ���������ù��캯�������ԣ������ڹ��췽����дһЩ��ʼ�����Ժ����ʻ�������˽�з�������䡣�������������շ������൱�ڶ���Ķ������ڶ�����Ҫ���øö����ǲŻ�ȥ��
ʽ���������������á�

����ûvoid���������캯������ͨ��������ǰ�����Զ���ʼ����
*/
package sg.com.java.begin.constructor;

public class ConsTest {
	public static void main(String[] args){
		Human aPerson = new Human(160);
		System.out.println(aPerson.getHeight());
		
		Human neZha = new Human(150, "shit");
		System.out.println(neZha.getHeight());
		
		System.out.println("Breath one time: ");
		aPerson.breath();
		
		System.out.println("Breath ten times: ");
		aPerson.breath(10);
		
		aPerson.Human();
		
		Human bPerson = new Human();
		
	}
}

class Human{
	Human(int h){
		this.height = h;
		System.out.println("I'm born");
	}
	
	Human(int h, String s){
		this.height = h;
		System.out.println("Ne Zha: I'm born, " + s);
	}
	
	protected Human(){ //Constructor Method
		System.out.println("Human CONSTRUCTOR method");
	}
	
	public void Human(){//Normal Method
		System.out.println("Human NORMAL method");
	}
	
	int getHeight(){
		return this.height;
	}
	
	void breath(){
		System.out.println("hu...hu...");
	}
	
	void breath(int rep){
		for(int i=0; i<rep; i++){
			System.out.println("hu...hu...");
		}
	}
	
	int height = 170; // explicit initialization
}