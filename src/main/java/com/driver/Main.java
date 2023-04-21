package com.driver;

public class Main {
  public static void main(String args[]) {
      RWOnly r = new RWOnly();

      r.setName("Jake");
      System.out.println(r.getName());
      // java: name has private access in com.driver.RWOnly
      // System.out.println(r.name);


  }
}