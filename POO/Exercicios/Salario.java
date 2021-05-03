import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numFuncionario = 0, horasTrabalhadas = 0;
    Double valorRecebidoPorHoras = 0.0;

    System.out.println("Digite o numero de identificacao do funcionario");
    sc.nextInt(numFuncionario);
    System.out.println("Digite o valor recebido por horas trabalhadas");
    sc.nextInt(horasTrabalhadas);
    System.out.println("Digite a quantidade de horas trabalhadas");
    sc.nextDouble(valorRecebidoPorHoras);

    calculaSalario(numFuncionario, horasTrabalhadas, valorRecebidoPorHoras);
    sc.close();
  }

  static void calculaSalario(int id, int horas, Double valor) {

    System.out.println("Numero do Funcionario: " + id + " Horas Trabalhadas" + horas + " Valor p/ hora" + valor);
    System.out.println("Valor Recebido: " + (horas * valor));
  }
}
