import java.util.Scanner;

class Main {
    public static void main(String args[]) {
      Scanner Keyboard = new Scanner(System.in);

      double earthGravity = 9.81;
      double moonForcegravity = 1.622;

      System.out.print("Introduce tu peso terrestre: ");
      double earthweight = Keyboard.nextDouble();

      double moonWeight = (earthweight/earthGravity) * moonForcegravity;

      System.out.print(earthweight + " peso terrestre, pesarías en la luna " + moonWeight);
      
    }
}