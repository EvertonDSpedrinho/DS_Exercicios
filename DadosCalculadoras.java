package Calculadora;
import java.util.Scanner;
public class DadosCalculadoras {

	public static void main(String[] args) {
		//importando um Scanner
		Scanner in = new Scanner(System.in);

		//Iniciando a Calculadora
		Calculadora calculo = new Calculadora();

		//Leitura do numero1
		System.out.println("Digite o primeiro n�mero: ");
		calculo.numero1 = in.nextDouble();

		//Leitura do numero2
		System.out.println("Digite o segundo n�mero: ");
		calculo.numero2 = in.nextDouble();

		//calculos
		calculo.somar();
		System.out.println(" ");
		calculo.dividir();
		System.out.println(" ");
		calculo.subtrair();
		System.out.println(" ");
		calculo.multiplicar();
	}

}
