package sg.com.nets.pattern.proxy.dynamicjdk;

import java.lang.reflect.InvocationHandler;  
import java.lang.reflect.Method;  
import java.lang.reflect.Proxy;  

interface PersonService  
{  
    public void save();  
}  
 
//*********TARGET*********
class PersonServiceImpl implements PersonService  
{  
    public void save()  
    {  
        System.out.println("人员增加");  
    }  
}  
 
 
class PersonProxy implements InvocationHandler  
{  
    // 目标对象  
    private Object target;  
 
    // 返回一个代理类对象  
    public Object createProxyInstance(Object target)  
    {  
        this.target = target;  
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);  
    }  
 
    // 上述代码中调用的this就是当前代理对象，会自动调用该方法  
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable  
    {  
        Object result = null;  
        System.out.println("前置通知");  
        try 
        {     
            result = method.invoke(target, args);  
            System.out.println("后置通知");  
        }  
        catch(Exception e)  
        {  
            System.out.println("例外通知——出错啦");  
        }  
        finally 
        {  
            System.out.println("最终通知——结束啦");   
        }  
        return result;  
    }  
}  
 
public class JdkDynamicProxyTest  
{  
    public static void main(String[] args)  
    {  
        PersonProxy bp = new PersonProxy();  
        PersonService ps = (PersonService)bp.createProxyInstance(new PersonServiceImpl());  
        ps.save();  
    }  
} 