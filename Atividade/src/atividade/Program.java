package atividade;

import java.util.Scanner;

public class Program {
    public static void mostrarMenu() {
        System.out.println("1 - Cadastrar Pessoa");
        System.out.println("2 - Cadastrar Livro");
        System.out.println("3 - Emprestar Livro");
        System.out.println("4 - Devolver Livro");
        System.out.println("5 - Listar todos os livros");
        System.out.println("6 - Listar todas as pessoas cadastradas");
        System.out.println("7 - Listar todos os livros emprestados");
        System.out.println("0 - Sair");
    }

    public static void main(String[] args) {
        int opcao = 0;
        try (Scanner scanner = new Scanner(System.in)) {
			Pessoa pessoa = new Pessoa();
			Livro livro = new Livro();
			Biblioteca biblioteca = new Biblioteca();

			do {
			    mostrarMenu();
			    opcao = Integer.parseInt(scanner.nextLine());

			    if (opcao == 1) {
			        System.out.println("Escreva seu nome: ");
			        String nome = scanner.nextLine();
			        pessoa.setNome(nome);

			        System.out.println("Escreva seu Id: ");
			        int id = Integer.parseInt(scanner.nextLine());
			        pessoa.setId(id);

			        Pessoa pessoaConsultada = biblioteca.consultarPessoaPorId(id);
			        if (pessoaConsultada != null) {
			            System.out.println("Pessoa já cadastrada");
			            System.out.println();
			            mostrarMenu();
			        }

			        biblioteca.cadastrarPessoa(pessoa);
			        System.out.println();
			        mostrarMenu();
			    } else if (opcao == 2) {
			        System.out.println("Escreva o nome do livro: ");
			        String titulo = scanner.nextLine();
			        livro.setTitulo(titulo);

			        System.out.println("Escreva o id do livro: ");
			        int id = Integer.parseInt(scanner.nextLine());
			        livro.setId(id);

			        Livro livroConsultado = biblioteca.consultarLivroPorId(id);
			        if (livroConsultado != null) {
			            System.out.println("Livro já cadastrado");
			            System.out.println();
			            mostrarMenu();
			        }

			        biblioteca.cadastrarLivro(livro);
			        System.out.println();
			        mostrarMenu();
			    } else if (opcao == 3) {
			        System.out.println("Digite seu Id: ");
			        int idPessoa = Integer.parseInt(scanner.nextLine());
			        Pessoa pessoaEmprestada = biblioteca.consultarPessoaPorId(idPessoa);

			        if (pessoaEmprestada == null) {
			            System.out.println("Pessoa não cadastrada");
			            System.out.println();
			            mostrarMenu();
			        } else {
			            System.out.println("Digite o Id do livro: ");
			            int idLivro = Integer.parseInt(scanner.nextLine());
			            Livro livroEmprestado = biblioteca.consultarLivroPorId(idLivro);

			            if (livroEmprestado == null) {
			                System.out.println("Livro não cadastrado");
			            } else {
			                biblioteca.emprestarLivroBiblioteca(idLivro, idPessoa);
			                System.out.println("O Livro " + idLivro + " foi emprestado para a pessoa " + idPessoa);
			            }
			            System.out.println();
			            mostrarMenu();
			        }
			    } else if (opcao == 4) {
			        System.out.println("Digite seu Id: ");
			        int idPessoa = Integer.parseInt(scanner.nextLine());
			        Pessoa pessoaDevolvida = biblioteca.consultarPessoaPorId(idPessoa);

			        if (pessoaDevolvida == null) {
			            System.out.println("Pessoa não cadastrada");
			            System.out.println();
			            mostrarMenu();
			        } else {
			            System.out.println("Digite o Id do livro: ");
			            int idLivro = Integer.parseInt(scanner.nextLine());
			            Livro livroDevolvido = biblioteca.consultarLivroPorId(idLivro);

			            if (livroDevolvido == null) {
			                System.out.println("Livro não cadastrado");
			            } else {
			                biblioteca.devolverLivroBiblioteca(idLivro, idPessoa);
			                System.out.println("O Livro " + idLivro + " que estava com a pessoa " + idPessoa + " foi devolvido com sucesso");
			            }
			            System.out.println();
			            mostrarMenu();
			        }
			    } else if (opcao == 5) {
			        System.out.println("Esses são todos os livros cadastrados: " + biblioteca.listarLivros());
			        System.out.println();
			    } else if (opcao == 6) {
			        System.out.println("Esses são todas as pessoas cadastradas: " + biblioteca.listarPessoas());
			        System.out.println();
			    } else if (opcao == 7) {
			        System.out.println("Esses são todos os livros emprestados: " + biblioteca.listarLivrosEmprestados());
			        System.out.println();
			    }
			} while (opcao != 0);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (opcao == 0) {
            System.out.println("Saindo do programa.");
        }
    }
}
