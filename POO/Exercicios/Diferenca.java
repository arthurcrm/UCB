import java.util.Scanner;

public class Diferenca {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, d;

    System.out.println("Digite o valor de A");
    a = sc.nextInt();
    System.out.println("Digite o valor de B");
    b = sc.nextInt();
    System.out.println("Digite o valor de C");
    c = sc.nextInt();
    System.out.println("Digite o valor de D");
    d = sc.nextInt();

    int diferenca = ((a * b) - (c * d));
    System.out.println("Diferenca: " + diferenca);

    sc.close();
  }
}
