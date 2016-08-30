package sg.com.nets.pattern.proxy.statics;

interface CountDao  
{  
    // 查看账户方法  
    public void queryCount();  
}  
 
class CountDaoImpl implements CountDao  
{  
    public void queryCount()  
    {  
        System.out.println("查看账户方法...");  
    }  
}  
 
class CountTrancProxy implements CountDao  
{  
    private CountDao countDao;  
 
    public CountTrancProxy(CountDao countDao)  
    {  
        this.countDao = countDao;  
    }  
 
    @Override 
    public void queryCount()  
    {  
        System.out.println("tranc start");  
        countDao.queryCount();  
        System.out.println("tranc end");  
    }  
}  
 
public class SingleStaticProxyTest  
{  
    public static void main(String[] args)  
    {  
        CountTrancProxy countProxy = new CountTrancProxy(new CountDaoImpl());  
        countProxy.queryCount();  
    }  
} 


