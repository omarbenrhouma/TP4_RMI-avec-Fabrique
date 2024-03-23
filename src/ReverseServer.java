import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReverseServer {
    public static void main(String[] args) {
        try {
            FabReverseInterface fab = new FabReverseImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("Fabrique", fab);
            System.out.println("Serveur prêt.");
        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.toString());
            e.printStackTrace();
        }
    }
}
