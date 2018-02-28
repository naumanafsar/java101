public class Animal{
  int legs = 4;  //Class member

  //Add a method
  public int getLegs(){
    return this.legs;
  }

  void constructsTest(){
    int x = 5;
    if(x==5)
      System.out.println("x is 5!");
    for(int i = 0; i < 3; i++){
      System.out.println("For loop: " + i);
    }
  }

  public static void main(String args[]){
    System.out.println("Main functions called...");
    Animal a = new Animal();  //Creating an instance
    System.out.println("Legs: " + a.legs);

    System.out.println("Calling from the method: " + a.getLegs());
    a.constructsTest();
  }
}
