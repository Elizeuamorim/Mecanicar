package br.edu.ifba.mobile.wmobile.mecanicar.cadeia;

public class MecanicoMotor extends Mecanico {

	@Override
	public String resolver(TipoServico servico) {
		if (servico ==TipoServico.MOTOR){
			
			return "Mecânico Moreira resolve seu problema!";
			
		}
		
		return proximo.resolver(servico);
		
	}

}
