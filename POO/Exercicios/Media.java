import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um numero para a variavel A");
    Double nota1 = (scan.nextDouble() * 3.5);
    System.out.println("Digite um numero para a variavel B");
    Double nota2 = (scan.nextDouble() * 7.5);
    Double media = (nota1 + nota2) / 11;
    System.out.println("Resultado: " + media);

    scan.close();
  }

}
