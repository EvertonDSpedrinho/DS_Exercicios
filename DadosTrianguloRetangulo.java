package TrianguloRetangulo;
import java.util.Scanner;
public class DadosTrianguloRetangulo {
	public static void main(String[] args) {
		//importando um Scanner
		Scanner in = new Scanner(System.in);

		//Iniciando o Triangulo
		TrianguloRetangulo triangulo = new TrianguloRetangulo();

		//Leitura da Base
		System.out.println("Digite o valor da Base do Triangulo: ");
		triangulo.base = in.nextDouble();

		//Leitua da Altura
		System.out.println("Digite o valor da Altura do Triangulo: ");
		triangulo.altura = in.nextDouble();

		//Calculando a Area do Triangulo
		triangulo.calcularAreaTriangulo();

		//Pulando Linha
		System.out.println(" ");
		System.out.println(" ");

		//Iniciando o Retangulo
		TrianguloRetangulo retangulo = new TrianguloRetangulo();

		//Leitura da Base
		System.out.println("Digite o valor da Base Retangulo: ");
		retangulo.base = in.nextDouble();

		//Leitua da Altura
		System.out.println("Digite o valor da Altura do Retangulo: ");
		retangulo.altura = in.nextDouble();

		//Calculando a Area do Retangulo
		retangulo.calcularAreaRetangulo();

	}
}
