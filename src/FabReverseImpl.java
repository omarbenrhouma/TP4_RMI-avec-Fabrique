import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FabReverseImpl extends UnicastRemoteObject implements FabReverseInterface {
    protected FabReverseImpl() throws RemoteException {
        super();
    }

    @Override
    public ReverseInterface createInstance() throws RemoteException {
        return new Reverse();
    }
}
