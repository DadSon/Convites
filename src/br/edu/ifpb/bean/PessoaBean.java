package br.edu.ifpb.bean;

import java.util.List;

import br.edu.ifpb.dao.PessoaDAO;
import br.edu.ifpb.entidade.Pessoa;

public class PessoaBean {

	public static void main(String[] args) {

		List<Pessoa> pessoas = PessoaDAO.getInstance().getAll();

		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}

	}

}
