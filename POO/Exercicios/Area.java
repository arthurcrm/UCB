import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor de R");
    Double r = sc.nextDouble();

    Double π = 3.14159;
    Double area = π * (r * r);
    System.out.println("Valor da Area: " + area);
    sc.close();
  }
}
