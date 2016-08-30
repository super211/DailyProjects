package sg.com.nets.pattern.proxy;

/*
 * 
 *抽象类就是不能使用new方法进行实例化的类，即没有具体实例对象的类。抽象类有点类似“模板”的作用，目的是根据其格式来创建和修改新的类。对象不能由抽象类直接创建，
 *只可以通过抽象类派生出新的子类，再由其子类来创建对象。当一个类被声明为抽象类时，要在这个类前面加上修饰符abstract。 在抽象类中的成员方法可以包括一般方法和
 *抽象方法。抽象方法就是以abstract修饰的方法，这种方法只声明返回的数据类型、方法名称和所需的参数，没有方法体，也就是说抽象方法只需要声明而不需要实现。当一个
 *方法为抽象方法时，意味着这个方法必须被子类的方法所重写，否则其子类的该方法仍然是abstract的，而这个子类也必须是抽象的，即声明为abstract。 抽象类中不一定
 *包含抽象方法，但是包含抽象方法的类一定要被声明为抽象类。抽象类本身不具备实际的功能，只能用于派生其子类。抽象类中可以包含构造方法，但是构造方法不能被声明为抽象。 
 *调用抽象类中的方法(抽象方法和非抽象方法)，如果方法是static的，直接 抽象类.方法  就可以了；如果是非static的则必须需要一个继承的非抽象类，然后用这个非抽象类的实例来调用方法。
 */

/*
 * 
 * 
 * 这个是静态代理。真实角色必须是事先已经存在的，并将其作为代理对象的内部属性。但是实际使用时，一个真实角色必须对应一个代理角色，如果大量使用会导致类的急剧膨胀；此外，
 * 如果事先并不知道真实角色，该如何使用代理呢？这个问题可以通过Java的动态代理类来解决。
	动态代理，就相当于代理者不仅仅只是代理一个真实对象，也可以代理很多对象，而且对象是动态指定的。
 */

abstract class Subjects{
	public abstract void request();
}

abstract class SubSubjects extends Subjects{
	
}

class RealSubjects extends Subjects{

	public RealSubjects(){
		
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		
	}
}

class ProxySubjects extends Subjects{
	private RealSubject realSubject;
	
	public ProxySubjects(){
		
	}
	
	private void preRequest(){
		System.out.println("Now doing the preRequest");
	}
	
	private void postRequest(){
		System.out.println("Now doing the postRequest");
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		
		preRequest();
			
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		
		realSubject.request();
		
		postRequest();
	}
	
}


public class ProxyTest2 {
	public static void main(String[] args){
		Subjects sub = new ProxySubjects();
		sub.request();
	}
}
