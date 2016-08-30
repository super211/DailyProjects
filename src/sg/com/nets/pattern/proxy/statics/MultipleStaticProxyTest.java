package sg.com.nets.pattern.proxy.statics;

class CountLogProxy implements CountDao  
{  
    private CountDao countDao;  
 
    public CountLogProxy(CountDao countDao)  
    {  
        this.countDao = countDao;  
    }  
 
    @Override 
    public void queryCount()  
    {  
        System.out.println("Log start");  
        countDao.queryCount();  
        System.out.println("Log end");  
    }  
} 

public class MultipleStaticProxyTest {
	public static void main(String[] args){
		CountTrancProxy trancProxy = new CountTrancProxy(new CountDaoImpl());  
	    CountLogProxy logPro = new CountLogProxy(trancProxy);  
	    logPro.queryCount();  
	}
}
