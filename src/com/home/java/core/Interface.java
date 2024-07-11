/*
 * Interface.java
 *
 * Created on November 27, 2008, 4:16 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.home.java.core;

interface Vehicle {
  void run();
}

class Car implements Vehicle {
  public void run() {
    System.out.println("car run fast");
  }
}

class Cycle implements Vehicle {
  public void run() {
    System.out.println("cycle run slow");
  }
}

public class Interface {
    
  public static void main(String args[]) {
        Car c1 = new Car();
        Cycle c2 = new Cycle();        
        tryout(c1);
        tryout(c2);
      }

  private static void tryout(Vehicle v) {
    v.run();
  }
    
}
