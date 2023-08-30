/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Dell
 */
import java.rmi.*;
public interface Adder extends Remote {
      public int add(int x, int y) throws Exception;
}

