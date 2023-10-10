package atividade;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int quantidadeExemplares;

    public Livro(int id, String titulo, String autor, String editora, int quantidadeExemplares) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.setEditora(editora);
        this.setQuantidadeExemplares(quantidadeExemplares);
    }

    public Livro() {
		// TODO Auto-generated constructor stub
	}

	public void emprestarLivro(int quantidadeEmprestada) {
        setQuantidadeExemplares(getQuantidadeExemplares() - quantidadeEmprestada);
    }

    public void devolverLivro(int quantidadeDevolvida) {
        setQuantidadeExemplares(getQuantidadeExemplares() + quantidadeDevolvida);
    }

    public String obterTituloLivro() {
        return titulo;
    }

    public String obterAutorLivro() {
        return autor;
    }

    public int obterIdLivro() {
        return id;
    }

	public void devolverLivro() {
		// TODO Auto-generated method stub
		
	}

	public void setTitulo(String titulo2) {
		// TODO Auto-generated method stub
		
	}

	public void setId(int id2) {
		// TODO Auto-generated method stub
		
	}

	public void emprestarLivro() {
		// TODO Auto-generated method stub
		
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getQuantidadeExemplares() {
		return quantidadeExemplares;
	}

	public void setQuantidadeExemplares(int quantidadeExemplares) {
		this.quantidadeExemplares = quantidadeExemplares;
	}
}
