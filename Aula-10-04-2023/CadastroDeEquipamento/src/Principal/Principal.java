package Principal;


import Entidades.Furadeira;
import Entidades.Makita;
import telas.ResultadoGrafico;
public class Principal {

	public static void main(String[] args) {

		Furadeira furadeiraPreechida = new Furadeira();
		Furadeira furadeiraResul = new Furadeira(); 
		 
		double furadeira;
		
		ResultadoGrafico rGrafico = new ResultadoGrafico();
		furadeiraPreechida = rGrafico.cadastrarFuradeira(furadeiraResul);
		
		rGrafico.exibirFuradeira(furadeiraPreechida);
		
	
		
		Makita makita = new Makita();
   }
}
