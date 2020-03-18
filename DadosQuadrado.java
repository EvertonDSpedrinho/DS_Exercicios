package Quadrado;
import java.util.Scanner;
public class DadosQuadrado {
	public static void main(String[] args) {
		//importando um Scanner
		Scanner in = new Scanner(System.in);

		//Iniciando o Quadrado1
		Quadrado quadrado1 = new Quadrado();

		//Leitura da Base
		System.out.println("Digite a Base do Quadrado: ");
		quadrado1.base = in.nextDouble();

		//Leitua da Altura
		System.out.println("Digite a Altura do Quadrado: ");
		quadrado1.altura = in.nextDouble();

		//Calculando a Area do Quadrado1
		quadrado1.calcularArea();

		//Pulando Linha
		System.out.println(" ");
		System.out.println(" ");

		//Iniciando o Quadrado2
		Quadrado quadrado2 = new Quadrado();

		//Leitura da Base
		System.out.println("Digite a Base do Quadrado: ");
		quadrado2.base = in.nextDouble();

		//Leitura da Altura
		System.out.println("Digite a Altura do Quadrado: ");
		quadrado2.altura = in.nextDouble();

		//Calculando a Area do Quadrado2
		quadrado2.calcularArea();


	}
}
