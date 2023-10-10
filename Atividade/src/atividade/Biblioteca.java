package atividade;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Pessoa> pessoas;
    private List<Livro> livros;

    public Biblioteca() {
        pessoas = new ArrayList<>();
        livros = new ArrayList<>();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (pessoas == null) {
            pessoas = new ArrayList<>();
        }
        pessoas.add(pessoa);
    }

    public void cadastrarLivro(Livro livro) {
        if (livros == null) {
            livros = new ArrayList<>();
        }
        livros.add(livro);
    }

    public void emprestarLivroBiblioteca(int idLivro, int idPessoa) {
        Livro livroEmprestado = consultarLivroPorId(idLivro);
        Pessoa pessoaEmprestada = consultarPessoaPorId(idPessoa);

        if (livroEmprestado != null && pessoaEmprestada != null) {
            livroEmprestado.emprestarLivro();
            pessoaEmprestada.emprestarLivro();
        }
    }

    public void devolverLivroBiblioteca(int idLivro, int idPessoa) {
        Livro livroDevolvido = consultarLivroPorId(idLivro);
        Pessoa pessoaDevolvida = consultarPessoaPorId(idPessoa);

        if (livroDevolvido != null && pessoaDevolvida != null) {
            livroDevolvido.devolverLivro();
            pessoaDevolvida.devolverLivro();
        }
    }

    public Livro consultarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.obterIdLivro() == id) {
                return livro;
            }
        }
        return null; // Livro não encontrado
    }

    public Pessoa consultarPessoaPorId(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.obterIdPessoa() == id) {
                return pessoa;
            }
        }
        return null; // Pessoa não encontrada
    }

	public String listarPessoas() {
		// TODO Auto-generated method stub
		return null;
	}

	public String listarLivros() {
		// TODO Auto-generated method stub
		return null;
	}

	public String listarLivrosEmprestados() {
		// TODO Auto-generated method stub
		return null;
	}
}