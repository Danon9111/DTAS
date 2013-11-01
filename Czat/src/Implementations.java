import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Implementations extends UnicastRemoteObject implements ChatInterface
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Server cs;
 
    public Implementations(Server cs) throws RemoteException
    {
        super();
        this.cs = cs;
    }
 
    public void sendMessage(String keyword, String username, String message) throws RemoteException
    {
        cs.sendPublicMessage(keyword, username, message);
    }
 
    public ArrayList getClientList() throws RemoteException
    {
        return cs.getClientList();
    }
 
    public void connect(String username) throws RemoteException
    {
        cs.connect(username);
    }
 
    public void disconnect(String username) throws RemoteException
    {
        cs.disconnect(username);
    }
}