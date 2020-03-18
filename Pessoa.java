package Pessoa;
public class Pessoa {
	//Instanciando as classes
		private String nome;
		private String endereco;
		private String telefone;
		private String email;
		private String rg;
		
		//Instanciando o "this", para indicar as variaveis
		public Pessoa(){
			this("","","","","");
		}
		
		//Ligando as classes com o "this"
		public Pessoa(String nome,String endereco,String telefone,String email,String rg){
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.email = email;
			this.rg = rg;
		}
		
		//Usando o get e o set para pegar e atribuir as variavies;
		//Nome
		public String getNome(){
			return nome;
		}
		public void setNome(String nome){
			this.nome = nome;
		}
		
		//Endereço
		public String getEndereco(){
			return endereco;
		}
		public void setEndereco(String endereco){
			this.endereco = endereco;
		}
		
		//Telefone
		public String getTelefone(){
			return telefone;
		}
		public void setTelefone(String telefone){
			this.telefone = telefone;
		}
		
		//email
		public String getEmail(){
			return email;
		}
		public void setEmail(String email){
			this.email = email;
		}
		
		//rg
		public String getRg(){
			return rg;
		}
		public void setRg(String rg){
			this.rg = rg;
		}
		
		//Apresentando
		public void apresentarPessoa(){
			System.out.println("Nome: ");
			System.out.println("Endereço: ");
			System.out.println("Telefone: ");
			System.out.println("Email: ");
			System.out.println("RG: ");
		}
	}
