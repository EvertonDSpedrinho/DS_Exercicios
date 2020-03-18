package NomeIdade;
import java.util.Scanner;
public class DadosNomeIdade {

	public static void main(String[] args) {
		//importando um Scanner
		Scanner in = new Scanner(System.in);

		//Iniciando Pessoa
		NomeIdade Pessoa = new NomeIdade();

		//Nome e Sobrenome
		System.out.println("Digite o seu Nome: ");
		Pessoa.nome = in.next();
		System.out.println("Digite o seu Sobrenome: ");
		Pessoa.sobrenome = in.next();

		//Idade
		System.out.println("Digite o Ano Atual: ");
		Pessoa.anoAtual = in.nextInt();
		System.out.println("Digite o Ano de seu Nascimento: ");
		Pessoa.anoDeNascimento = in.nextInt();

		//Nome Completo
		Pessoa.nomeCompleto();
		
		//Calculo Idade
		Pessoa.idaade();

	}

}
