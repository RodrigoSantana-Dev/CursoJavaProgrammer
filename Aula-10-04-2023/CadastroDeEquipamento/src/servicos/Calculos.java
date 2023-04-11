package servicos;
import Entidades.Furadeira;

public class Calculos {
	
	public double calcularlucro(double precoDeVenda, double precoDeCompra) {
		
		
		double lucroDeVenda = precoDeVenda - precoDeCompra;
		
		return lucroDeVenda;
	}
	
	

}
