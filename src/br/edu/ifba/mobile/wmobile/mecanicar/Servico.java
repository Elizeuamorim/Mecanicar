package br.edu.ifba.mobile.wmobile.mecanicar;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.Mecanico;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.MecanicoAlinhamento;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.MecanicoChaparia;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.MecanicoEletrica;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.MecanicoGeral;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.MecanicoInjecaoEletronica;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.MecanicoMotor;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.MecanicoPintura;
import br.edu.ifba.mobile.wmobile.mecanicar.cadeia.TipoServico;
@ManagedBean(name="serv")
@SessionScoped


public class Servico {
	
	private String email = "";
	private String resultado = "";
	
	public String getEmail(){
		
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public void setServicoEscolhido(String tipoServico){
		TipoServico tipo = TipoServico.SEM_SERVICO;
		if(tipoServico.equals("Alinhamento")){
			tipo = TipoServico.ALINHAMENTO;
		}else if(tipoServico.equals("Chaparia")){
			  tipo = TipoServico.CHAPARIA;
	       }else if(tipoServico.equals("Eletrica")){
		        tipo = TipoServico.ELETRICA;
             }else if(tipoServico.equals("Geral")){
	                tipo = TipoServico.GERAL;
                 } else if(tipoServico.equals("InjecaoEletronica")){
			           tipo = TipoServico.INJECAO_ELETRONICA;
	                }else if(tipoServico.equals("Motor")){
		                 tipo = TipoServico.MOTOR;
                      }else if(tipoServico.equals("Pintura")){
                  		   tipo = TipoServico.PINTURA;
                        }
		
		Mecanico mecan = new MecanicoAlinhamento(); 
		mecan.setProximoMecanico(new MecanicoChaparia());
		mecan.setProximoMecanico(new MecanicoEletrica());
		mecan.setProximoMecanico(new MecanicoGeral());
		mecan.setProximoMecanico(new MecanicoInjecaoEletronica());
		mecan.setProximoMecanico(new MecanicoMotor());
		mecan.setProximoMecanico(new MecanicoPintura());
		
		resultado = mecan.resolver(tipo);
		
		System.out.println("Agendado atendimento para " + email +" as 14:00");
		resultado = mecan.resolver(tipo);
	}
	
	public List<String> getTiposServico(){
		
		List<String> tipos= new ArrayList<String>();
		tipos.add("Alinhamento");
		tipos.add("Chaparia");
		tipos.add("Eletrica");
		tipos.add("Geral");
		tipos.add("InjecaoEletronica");
		tipos.add("Motor");
		tipos.add("Pintura");
		
		return tipos;
	}
	
	
	public String getResultado(){
		
		return resultado;
		
	}
}