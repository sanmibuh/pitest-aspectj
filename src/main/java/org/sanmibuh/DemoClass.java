package org.sanmibuh;

import org.sanmibuh.aspect.MyAspect;

public class DemoClass {

  @MyAspect
  public int init() {
    System.out.println("INIT METHOD");
    return 3;
  }

}
