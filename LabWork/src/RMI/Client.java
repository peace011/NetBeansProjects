package RMI;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object from the RMI registry
            Adder skeleton = (Adder) Naming.lookup("rmi://localhost:8000/Nist");
            int result = skeleton.add(1, 2);
            System.out.println("Result is " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
