package br.edu.ifpb.bean;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.dao.ConvidadoDAO;
import br.edu.ifpb.entidade.Convidado;

@RequestScoped
@ManagedBean(name = "convidadoBean")
public class ConvidadoBean {

	private Convidado convidado;
	
	public ConvidadoBean(){
		
		this.convidado = new Convidado();
		
	}

	public List<Convidado> getConvidados() {

		return new ConvidadoDAO().getAll();	
		
	}

	public void inserir() throws IOException{
		
		System.out.println("Inserido");
		
		ConvidadoDAO convidadoDAO = new ConvidadoDAO();
		convidadoDAO.insert(convidado);	
		FacesContext.getCurrentInstance().getExternalContext().redirect("convite.xhtml"); 	
		
	}

	public Convidado getConvidado() {
		return convidado;
	}

	public void setConvidado(Convidado convidado) {
		this.convidado = convidado;
	}

}

