
import java.rmi.Naming;

public class Client {
      public static void main(String[] args) {
        try {
            Adder skeleton = (Adder) Naming.lookup("rmi://localhost:9000/nist");
            int result = skeleton.add(1, 2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
        }
    }
}

