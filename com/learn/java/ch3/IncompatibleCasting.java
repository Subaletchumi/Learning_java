
public class IncompatibleCasting {

  public static void main(String... args) {
    double a = 10.5;
    double b = 5.0;
    System.out.println("a: " + a + "\tb: " + b);

   // int x = a;
    //int y = b;
    int x = (int) a;
    int y = (int) b;
    System.out.println("x: " + x + "\ty: " + y);
  }
}