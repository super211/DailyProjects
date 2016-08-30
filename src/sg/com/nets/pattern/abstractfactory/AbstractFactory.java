package sg.com.nets.pattern.abstractfactory;

interface YueyeCar{
	public void driveYueye();
}

interface PaocheCar{
	public void drivePaoche();
}

class YueyeBenz implements YueyeCar{
	public void driveYueye(){
		System.out.println("Drive a Yueye Benz");
	}
}

class PacheoBenz implements PaocheCar{
	public void drivePaoche(){
		System.out.println("Drive a Paoche Benz");
	}
}

interface Factory{
	public YueyeCar yueyeFactory();
	public PaocheCar paocheFactory();
}

class BenzFactory implements Factory{

	@Override
	public YueyeCar yueyeFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaocheCar paocheFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


public class AbstractFactory {
	public static void main(String[] args){
		
	}
}

