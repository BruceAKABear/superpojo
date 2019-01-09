package pro.dengyi.test;

import pro.dengyi.SuperPojo;

public class SimpleTest {

  public static void main(String[] args) {
    SuperPojo superPojo = new SuperPojo();
    superPojo.setPropertity("key", 123);
    System.out.println(superPojo.get("key"));
  }

}
