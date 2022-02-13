package br.com.softblue.loucademia.interfaces.shared.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.softblue.loucademia.application.service.DataService;
import br.com.softblue.loucademia.domain.aluno.Aluno.Sexo;
import br.com.softblue.loucademia.domain.aluno.Aluno.Situacao;
import br.com.softblue.loucademia.domain.aluno.Estado;

@Named
@ApplicationScoped
public class DataBean implements Serializable{
	
	@EJB
	private DataService dataService;
	
	
	public Sexo[] getSexos() {
		return dataService.getSexos();
	}
	
	public Situacao[] getSituacoes() {
		return dataService.getSituacoes();
	} 
	
	public List<Estado> getEstados(){
		return dataService.listEstados();
	}
}
