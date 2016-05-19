package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public abstract class Mecanico {
	
	protected Mecanico proximo = null;
	
	public void setProximoMecanico (Mecanico proximo){
		
		if (this.proximo != null){
			this.proximo.setProximoMecanico(proximo);
		}
		else{
			this.proximo=proximo;
		}
		
	}
	
	public abstract String resolver (TipoServico servico);

}
