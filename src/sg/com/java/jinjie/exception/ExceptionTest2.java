package sg.com.java.jinjie.exception;

public class ExceptionTest2 {
	public static void main(String[] args){
		Battery aBattery = new Battery();
		aBattery.chargeBattery(0.5);
		boolean bool = aBattery.useBattery(-0.5);
		System.out.println(bool);
	}
	 
}

class Battery{
	/*increase battery*/
	public void chargeBattery(double p){
		if(this.power + p < 1.){
			this.power = this.power + p;
		}else{
			this.power = 1.;
		}
	}
	
	/*consume battery*/
	public boolean useBattery(double p){
		try{
			test(p);
		}catch(Exception e){
			System.out.println("catch exception");
			System.out.println(e.getMessage()); /*在catch中，使用getMessage()方法提取之前抛出的异常中包含的信息 */
			p = 0.0;
		}
		
		if(this.power >= p){
			this.power = this.power - p;
			return true;
		}else{
			this.power = 0.0;
			return false;
		}
	}
	
	/*test usage*/
	public void test(double p) throws Exception{
		if(p<0){
			//Exception e  = new Exception("p must be positive");
			Exception e = new BatteryUsageException("p must be positive");
			throw e;
		}
	}
	
	class BatteryUsageException extends Exception{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public BatteryUsageException(String msg){
			super(msg);
		}
	}
	
	private double power = 0.0;
}
