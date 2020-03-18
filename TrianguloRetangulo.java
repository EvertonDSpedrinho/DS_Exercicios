package TrianguloRetangulo;
public class TrianguloRetangulo {
	double base;
	double altura;

	//Metodo para calcular a area do Triangulo
	void calcularAreaTriangulo(){
		double areaTriangulo = (base*altura)/2;
		System.out.println("O Valor da area do Triangulo é equivalente a "+areaTriangulo);
	}
	
	//Metodo para calcular a area do retangulo
	void calcularAreaRetangulo(){
		double areaRetangulo = base*altura;
		System.out.println("O Valor da area do Retangulo é equivalente a "+areaRetangulo);
	}
}
