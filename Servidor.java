import java.rmi.Naming;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Msg_interface servidor = new Msg();
			Naming.rebind("servidor", servidor);
			System.out.println("Servidor online");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
