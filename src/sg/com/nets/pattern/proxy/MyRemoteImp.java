package sg.com.nets.pattern.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

interface MyRemote extends Remote
{
    public String getUserName(String userId) throws RemoteException;
}
public class MyRemoteImp extends UnicastRemoteObject implements MyRemote
{
    protected MyRemoteImp() throws RemoteException
    {
        
    }

    public String getUserName(String userId) throws RemoteException
    {
        return userId + "/myName is Cherry";
    }

}