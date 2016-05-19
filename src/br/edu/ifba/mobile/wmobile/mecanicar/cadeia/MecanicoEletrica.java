package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public class MecanicoEletrica extends Mecanico{

	@Override
	public String resolver(TipoServico servico) {
		if (servico == TipoServico.ELETRICA){
			return "O Mêcanico Israel resolve o seu problema";
		}
		return proximo.resolver(servico);
	}

}
