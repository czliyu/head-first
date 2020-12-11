package example.proxy_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    /**
     * 所有的返回类型都必须是原语类型或可序列化类型
     * @return
     * @throws RemoteException
     */
    public State getState() throws RemoteException;
}
