class BasicsDemo {
  /*  
    * Defining a print method that highlights difference between println
    * and print
  */
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!");
    System.out.println();
    System.out.print("Hello world!!");
    System.out.println("Hello,");
    System.out.print(" ");
    System.out.print("world!!");
  }

  // * Declaring the main method
  public static void main(String[] args){
    // * Calling/Invoking our print function
    print();
  }
}

/* 
  * Above method returns
  * Inside print ...
  * Hello, world!!

  * Hello world!!Hello,
  *  world!!



*/