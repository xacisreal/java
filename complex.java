import java.util.Scanner;

public class complex {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    System.out.print("Enter real and imaginary no of first no:");
    double r1 =input.nextDouble();
    double i1 =input.nextDouble();
    System.out.print("Enter r and i of 2nd no:");
    double r2 =input.nextDouble();
    double i2 =input.nextDouble();
    double sumReal=r1+r2;
    double sumImaginary=i1+i2;
    System.out.println("Sum = " + sumReal + " + "+ sumImaginary + "i");
    input.close();
  }
}
