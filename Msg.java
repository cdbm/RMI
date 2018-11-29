import java.io.FileWriter;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Msg extends UnicastRemoteObject implements Msg_interface{
	private String msg;
	public Msg() throws RemoteException{
		
	}
	
	public void setMsg(String[] msg) {
		try {
		FileWriter arq = new FileWriter("c:\\arquivo.txt");
	    PrintWriter gravarArq = new PrintWriter(arq);
	    for(int i = 0; i < msg.length; i++) {
	    	gravarArq.printf("%s",msg[i]);
	    }
	    arq.close();
		}catch(Exception e) {
			System.out.println("Erro na recepção do arquivo");
		}
	}
}
