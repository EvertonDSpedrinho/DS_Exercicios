package Calculadora;
public class Calculadora {
	//Iniciando as classes
	double numero1;
	double numero2;

	//soma
	void somar(){
		double soma = numero1+numero2;
		System.out.println("A soma de "+numero1+" + "+numero2+" = "+soma);
	}

	//dividir
	void dividir(){
		double dividi = numero1/numero2;
		 System.out.println("A Divis�o de "+numero1+" / "+numero2+" = "+dividi);
	}

	//subrta��o
	void subtrair(){
		double subtrai = numero1-numero2;
		System.out.println("A subtra��o de "+numero1+" - "+numero2+" = "+subtrai);
	}

	//multiplica��o
	void multiplicar(){
		double multiplica = numero1*numero2;
		System.out.println("A multiplica��o de "+numero1+" * "+numero2+" = "+multiplica);
	}

}
