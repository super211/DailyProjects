package sg.com.nets.pattern.proxy;

interface ITalk{
	public void talk(String msg);
}

class People implements ITalk{
	@Override
	public void talk(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}
}

class TalkProxy implements ITalk{

	ITalk italk;
	public TalkProxy(final ITalk italk){
		this.italk = italk;
	}
	
	@Override
	public void talk(String msg) {
		// TODO Auto-generated method stub
		this.italk.talk(msg);
	}
	
	public void sing(final String songName){
		System.out.println("SongName:" + songName);
	}
}

public class ProxyTest {
	public static void main(String[]args){
		final People people = new People();
		people.talk("I can't sing");
		
		final TalkProxy proxy = new TalkProxy(people);
		proxy.talk("I can talk");
		proxy.sing("I can sing");
	}
}
