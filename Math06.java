public class Math06 {
  public double sqrt(int x, double guess) {
    System.out.println("Calculating the sqrt of " + x + " Starting with a guess: " + guess);
    return 1.0;
  }

  //Overloaded method - for default arguments...

  public double sqrt(int x) {
    double guess = 1.0;
    return sqrt(x , guess);
  }
  public static void main(String args[])  {
    Math06 m = new Math06();

    m.sqrt(36);
  }
}
