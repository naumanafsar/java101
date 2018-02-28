public class Student{
  static int num = 0;  //Associative with the class, not dependent on instances.
  int rollno;

  public static void main(String args[]) {

    Student s1 = new Student();
    Student s2 = new Student();

    System.out.println("num: " + Student.num);

    Student.num += 1;
    System.out.println("num: " + Student.num);

    System.out.println("s1.num: " + s1.num);
    System.out.println("s2.num: " + s1.num);

    System.out.println("rollno: " + s1.rollno);
  }
}
