//3.
package RMI;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try{
            Adder stub = new RemoteAdder();
            Registry registry = LocateRegistry.createRegistry(8000);
            registry.rebind("Nist", stub);
           System.out.println("Server Started");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
