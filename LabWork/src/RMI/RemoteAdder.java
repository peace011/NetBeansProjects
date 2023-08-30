//2. Implement Adder
package RMI;
import java.rmi.server.*;

public class RemoteAdder extends UnicastRemoteObject implements Adder{
    RemoteAdder() throws Exception{}
    @Override
    public int add(int x, int y){
        return x+y;
    }
     
}
