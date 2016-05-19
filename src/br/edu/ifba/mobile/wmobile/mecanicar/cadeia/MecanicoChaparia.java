package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public class MecanicoChaparia extends Mecanico {

	@Override
	public String resolver(TipoServico servico) {
		if(servico == TipoServico.CHAPARIA){
			
			return "Mecanico Robsnei resolve seu problema";
			
		}
		return proximo.resolver(servico);
	}

}
