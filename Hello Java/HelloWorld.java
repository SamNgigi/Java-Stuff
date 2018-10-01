class HelloWorld {
  /*
   * The main method is a special method in Java in that it from where our program
   * starts running.
   * 
   * In that when we run java HelloWorld
   * 
   * 1. JVM loads bytecodes of HelloWorld.class into memory allocated to JVM by a
   * computers CPU.
   * 
   * 2. It then invokes the bytecode's main method.
   * 
   * Public is key word is required in order for JVM to invoke it. If it is not
   * present, the HelloWorld will be compiled but not run.
   * 
   * From the main method we now invoke other classes that consitute the software.
   * The program ends when the main method ends.
   */
  public static void main(String[] args) {

    // Prints Hello World in Java.
    System.out.println("Hello World in Java!");
  }
}

/*
 * We would compile this using java HelloWorld.java ...then javac HelloWorld
 */