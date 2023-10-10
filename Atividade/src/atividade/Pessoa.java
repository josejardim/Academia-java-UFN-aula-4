package atividade;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private List<Livro> livrosEmprestados;

    public Pessoa(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.livrosEmprestados = new ArrayList<>();
    }

    public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public void adicionarLivroLista(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivroLista(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    public String obterNomePessoa() {
        return nome;
    }

    public int obterIdPessoa() {
        return id;
    }

	public void setNome(String nome2) {
		// TODO Auto-generated method stub
		
	}

	public void setId(int id2) {
		// TODO Auto-generated method stub
		
	}

	public void devolverLivro() {
		// TODO Auto-generated method stub
		
	}

	public void emprestarLivro() {
		// TODO Auto-generated method stub
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
