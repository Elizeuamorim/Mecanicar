package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public class MecanicoInjecaoEletronica extends Mecanico{

	@Override
	public String resolver(TipoServico servico) {
		if(servico == TipoServico.INJECAO_ELETRONICA){
			return "O Mecânico Bruno resolve seu problema.";
		}
		return proximo.resolver(servico);
	}
}
