import java.util.Scanner;

public class Prod {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero para a variavel A");
    int a = scan.nextInt();
    System.out.println("Digite um numero para a variavel B");
    int b = scan.nextInt();
    int x = a * b;
    System.out.println("Resultado: " + x);

    scan.close();
  }

}
