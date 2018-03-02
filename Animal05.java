public class Animal05 {
  int legs;

  //String msg = "Test message"; //Add this and change message below

  public int getLegs() {  //Make this private
    return this.legs;
  }

  public void printLegCount(String msg) {
    System.out.println(msg + ": " + getLegs());
  }

  public static void main(String args[])  {
    Animal05 a = new Animal05();

    a.printLegCount("Legs are");

    a.legs += 1;
    a.printLegCount("Legs are");
  }
}
