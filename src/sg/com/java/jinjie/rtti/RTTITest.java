package sg.com.java.jinjie.rtti;

class Human{
	public int getHeight(){
		return this.height;
	}
	
	public void growHeight(int h){
		this.height = this.height + h;
	}
	
	private int height;
}

class Woman extends Human{
	public Human giveBirth(){
		System.out.println("Give Birth");
		return (new Human());
	}
}


public class RTTITest {

	public static void main(String[] args) throws ClassNotFoundException{
		//Human aPerson =new RTTITest().new Human();
		Human aPerson =new Human();
		Class c1 = aPerson.getClass();
		System.out.println(c1.getName());
		Human anotherPerson = new Woman();
		//Class c2 = (anotherPerson).getClass();
		Class c2 = ((Human)anotherPerson).getClass();//�����������ǿ��ת��������������Ӧ��Class������ͬһ��������Class����Ĵ��ڣ�Java������Ϊ���͵�����ת������ʧ������Ƕ�̬��ԭ��
		System.out.println(c2.getName());
		
		Class c3 = Class.forName("Human");
		System.out.println(c3.getName());
		
		Class c4 = Woman.class;
		System.out.println(c4.getName());
	}
	
/*	class Human{
		public int getHeight(){
			return this.height;
		}
		
		public void growHeight(int h){
			this.height = this.height + h;
		}
		
		private int height;
	}
	
	class Woman extends Human{
		public Human giveBirth(){
			System.out.println("Give Birth");
			return (new Human());
		}
	}*/
}

