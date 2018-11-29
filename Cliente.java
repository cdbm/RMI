import java.io.BufferedReader;
import java.io.FileReader;
import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Msg_interface obj = (Msg_interface) Naming.lookup("rmi://localhost/servidor");
			Scanner in = new Scanner(System.in);
			while(true) {
				System.out.println("Informe o local do arquivo");
				String msg = in.nextLine();
				FileReader arq = new FileReader(msg);
			    BufferedReader lerArq = new BufferedReader(arq);
			    String str[] = new String[10000000];
			    int i = 0;
			    String linha = lerArq.readLine();
			    while (linha != null) {
			        System.out.printf("%s\n", linha);
			 
			        linha = lerArq.readLine(); // lê da segunda até a última linha
			        str[i] = linha;
			   }
			   obj.setMsg(str);
			   arq.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
