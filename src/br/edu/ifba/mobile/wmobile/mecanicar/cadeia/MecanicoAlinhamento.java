package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public class MecanicoAlinhamento extends Mecanico{

	@Override
	public String resolver(TipoServico servico) {
		
		if(servico == TipoServico.ALINHAMENTO){
		return "O M�canico Alexandre resolve seu problema.";
		}
		return proximo.resolver(servico);
	}
}
