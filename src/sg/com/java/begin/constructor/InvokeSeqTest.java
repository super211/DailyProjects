/*
��������Ǹ���������Ĺ��캯�����ô�����Java�У�����Ĺ�������б�������丸��Ĺ��캯��������Ϊ�м̳й�ϵ����ʱ������Ҫ�Ѹ�������ݼ̳�����������������ж�����캯��ʱ�������ѡ������أ�

��һ����������Ĺ�������У���������丸��Ĺ��췽����һ���࣬������ǲ�д���췽������ô������������Ǽ���һ��Ĭ�ϵĹ��췽��������û�в����Ĺ��췽����������������Լ�д�˹��췽������ô�������Ͳ����������ˣ�������ʱ����newһ����������ʱ�򣬿϶�����������Ĺ��췽����������������๹�췽�������ǲ�û����ʾ�ĵ��û���Ĺ��췽�����磺super();  �����ͻ���ø���û�в����Ĺ��췽����    

�ڶ��������������Ĺ��췽���м�û����ʾ�ĵ��û��๹�췽��������������û���޲εĹ��췽���������������ԣ�ͨ��������Ҫ��ʾ�ģ�super(�����б�)�������ø����в����Ĺ��캯������ʱ�޲εĹ��캯���Ͳ��ᱻ���á�

��֮��һ�仰������û����ʾ���ø��๹�캯�����������๹�캯���Ƿ��������Ĭ�ϵ��ø����޲εĹ��캯����������û����������
 */

package sg.com.java.begin.constructor;

class People {
    String name;

    //Implicit super constructor People() is undefined. Must explicitly invoke another constructor
    public People() {
        System.out.print(1);
    }

    public People(String name) {
        System.out.print(2);
        this.name = name;
    }
}

class Child extends People {
    People father;

    public Child(String name) {
        System.out.print(3);
        this.name = name;
        father = new People(name + ":F");
    }

    public Child() {
        System.out.print(4);
    }
    
}

public class InvokeSeqTest {
	public static void main(String[] args){
		new Child("Mike");
	}
}
