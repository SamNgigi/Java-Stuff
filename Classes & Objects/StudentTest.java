class StudentTest {
  public static void main(String[] args) {
    // * Creating a new student object
    Student student = new Student();

    // * Setting student's state
    student.id = 1;
    student.name = "Saam";
    student.gender = "male";

    // * updating profile with correct name
    student.updateProfile("Sam");

    /*
     * System.out .println(String.format("Hi my name is %s and am the Alpha-%s #%d",
     * student.name, student.gender, student.id));
     * 
     * or
     */
    System.out.printf("Hi my name is %s and I am number %d\n", student.name, student.id);

  }
}