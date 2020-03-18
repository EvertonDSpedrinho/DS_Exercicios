package NomeIdade;
public class NomeIdade {
	//Variaveis
	String nome;
	String sobrenome;
	int anoDeNascimento;
	int anoAtual;

	//Nome Completo
	void nomeCompleto(){
		System.out.println(nome+" "+sobrenome);
	}

	//Idade
	void idaade(){
		int idade;
		idade = anoAtual - anoDeNascimento;
		System.out.println("A sua Idade é: "+idade); 
	}
}
