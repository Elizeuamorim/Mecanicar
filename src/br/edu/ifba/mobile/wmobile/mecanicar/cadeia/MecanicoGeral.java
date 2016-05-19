package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public class MecanicoGeral extends Mecanico {

	@Override
	public String resolver(TipoServico servico) {
		
		if (servico == TipoServico.GERAL) {

		return "Mecanico Lucas Resolve o seu problema!";
		
		}
		
		return proximo.resolver(servico);
	}
	
	

}
