import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Msg_interface extends Remote	{
	
	public void setMsg(String msg[]) throws RemoteException;
}
