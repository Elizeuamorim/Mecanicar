package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public class MecanicoPintura extends Mecanico{

	@Override
	public String resolver(TipoServico servico) {
		if (servico == TipoServico.PINTURA){
			return "Mecanico Junior resolve seu problema";
		}
		{
	return "N�o existem Mec�nicos aptos a resolver sua duvida";
}

}
}
