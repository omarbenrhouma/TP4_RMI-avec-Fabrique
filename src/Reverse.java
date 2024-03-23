import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {
    protected Reverse() throws RemoteException {
        super();
    }

    @Override
    public String reverseString(String str) throws RemoteException {
        return new StringBuilder(str).reverse().toString();
    }
}
