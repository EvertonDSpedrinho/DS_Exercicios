public class Caminhao {
	//Instanciando as classes
	 private String Modelo;
	 private String Fabricante;
	 private String Placa;
	 
	 public Caminhao() {
		 this("","","");
	 }
	 
	 public Caminhao(String Modelo,String Fabricante,String Placa){
			this.Modelo = Modelo;
			this.Fabricante = Fabricante;
			this.Placa = Placa;
		}
		
		//Usando o get e o set para pegar e atribuir as variavies;
		//Nome
		public String getModelo(){
			return Modelo;
		}
		public void setModelo(String Modelo){
			this.Modelo = Modelo;
		}
		
		//Endereço
		public String getFabricante(){
			return Fabricante;
		}
		public void setFabricante(String Fabricante){
			this.Fabricante = Fabricante;
		}
		
		//Telefone
		public String getPlaca(){
			return Placa;
		}
		public void setPlaca(String Placa){
			this.Placa = Placa;
		}
		
		//Apresentando
		public void apresentarPessoa(){
			System.out.println("Modelo: ");
			System.out.println("Fabricante: ");
			System.out.println("Placa: ");
		}
}

