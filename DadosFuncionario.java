package Funcionario;
public class DadosFuncionario {
	public static void main(String[] args) {
		//Instanciando as Strings
		Funcionario Pedro = new Funcionario();
		Funcionario Vagner = new Funcionario();

		//Validando as Regras
		Pedro.nome = "Pedro";
		Vagner.nome = "Vagner";
		//Salario
		Pedro.salarioBruto = 2500;
		Vagner.salarioBruto = 3000;
		//imposto
		Pedro.imposto = 500;
		Vagner.imposto = 250;

		//Salario
		Pedro.SalarioLiquido();
		Vagner.SalarioLiquido();
	
		//AumentaSalario
		Pedro.AumentaSalario(1000);
		Vagner.AumentaSalario(2000);
	}
}
