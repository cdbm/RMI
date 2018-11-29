import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UniastRemoteObject;

public class Server implements ImplExample{
    public Server(){}
    public static void main(String args[]){
        try{
           ImplExample obj = new ImplExample();
           
           Hello stub = (Hello) UnicastRemoteObject.exportObject(obj,0);
           Registry registry = LocateRegistry.getRegistry();
           registry.bind("Hello", stub);
           System.err.println("Server Ready");
        }catch(Exception e){
           System.err.println("Server exception" + e.toString());
           e.printStackTrace();
        }
    }
}
