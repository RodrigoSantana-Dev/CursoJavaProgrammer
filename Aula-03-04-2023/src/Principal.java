import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double Numero1Double;
		double Numero2Double;
		double resultado;
		
		String Numero1String;
		String Numero2String;
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		System.out.println("##Soma Dos Numeros##");
		System.out.println("Digite Um Numero:");
         		
		Numero1String = entradaDeDados.nextLine(); 
		
		Numero1Double = Integer.parseInt(Numero1String);
		
		System.out.println("##Soma Dos Numeros##");
		System.out.println("Digite Um Numero:");
         		
		Numero2String = entradaDeDados.nextLine(); 
		
		Numero2Double = Integer.parseInt(Numero1String);
		
		
	 resultado = (Numero1Double + Numero2Double);
	 
	 System.out.println("resultado é:" + resultado);

		
		


	}

}
