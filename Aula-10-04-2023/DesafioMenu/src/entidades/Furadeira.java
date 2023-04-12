package entidades;

public class Furadeira extends Equipamento {
	
	private String TipodeBroca;

	public String getTipodeBroca() {
		return TipodeBroca;
	}

	public void setTipodeBroca(String tipodeBroca) {
		TipodeBroca = tipodeBroca;
	}

	public void setPrecoDeVenda(double parseDouble) {
		parseDouble = (300);
	}

	public void setPrecoDeCompra(double parseDouble) {
		parseDouble = (150);
	}

	

}
