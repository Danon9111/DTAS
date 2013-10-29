import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class HelloClient 
{
	public static void main(String args[]) {
		String nick;
		@SuppressWarnings("resource")
		Scanner readNick = new Scanner(System.in);
		nick = readNick.nextLine();
	
		HelloInterface remoteObject;   // referencja do zdalnego obiektu
		Registry reg;                  // rejestr nazw obiektów
		String serverAddr=args[0];
		try {
			// pobranie referencji do rejestru nazw obiektów
			reg = LocateRegistry.getRegistry(serverAddr);
			// odszukanie zdalnego obiektu po jego nazwie
			remoteObject = (HelloInterface) reg.lookup("HelloServer");

			String message;
			Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
			message = odczyt.nextLine();
			// wywołanie metody zdalnego obiektu
			remoteObject.Hello(nick + ": " + message);
			}
		catch(RemoteException e) {
			e.printStackTrace();
		}
		catch(NotBoundException e)
		{
			e.printStackTrace();
		}
	}
}
