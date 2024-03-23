import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FabReverseInterface extends Remote {
    ReverseInterface createInstance() throws RemoteException;
}
