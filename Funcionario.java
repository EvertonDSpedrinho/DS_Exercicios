package Funcionario;
public class Funcionario {
	String nome;
	double salarioBruto;
	double imposto;
	
	//Metodo sem parametro sem retorno
	void SalarioLiquido(){
		double SL;
		SL = this.salarioBruto - this.imposto;
		System.out.println("Salario Liquido de "+this.nome+" : "+ SL);
	}
	
	//Metodo com parametro sem retorno
	void AumentaSalario (double aumento){
		this.salarioBruto += aumento;
		System.out.println("O Salario de "+this.nome+" teve um aumento de: "+aumento);
	}
}
