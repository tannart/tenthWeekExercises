import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoServer extends UnicastRemoteObject implements EchoService{

	public EchoServer() throws RemoteException{
		//nothing to initialise for this server
	}
	
	@Override
	public String echo(String s){
		//This println is not necessary, but helps verifying
		//whether the server has received the call
		System.out.println("Replied to some client saying '" + s + "'");
		return s;
	}
}