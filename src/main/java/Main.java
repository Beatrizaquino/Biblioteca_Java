import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int option;
        int submenuOption;

        do {
            System.out.println("\n1. Livros");
            System.out.println("2. Usuários");
            System.out.println("3. Empréstimos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    do {
                        System.out.println("\n1. Cadastrar Livro");
                        System.out.println("2. Listar Livros");
                        System.out.println("3. Visualizar Livro");
                        System.out.println("4. Excluir Livro");
                        System.out.println("5. Editar Livro");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha uma opção: ");

                        submenuOption = sc.nextInt();
                        sc.nextLine();

                        switch (submenuOption) {
                            case 1:
                                System.out.print("Digite o título do livro: ");
                                String titulo = sc.nextLine();
                                System.out.print("Digite o autor do livro: ");
                                String autor = sc.nextLine();
                                System.out.print("Digite o isbn(identificação numerica) do livro: ");
                                int isbn = sc.nextInt();
                                biblioteca.addLivros(titulo, autor, isbn);
                                break;
                            case 2:
                                System.out.println("\nLivros disponíveis:");
                                biblioteca.listarLivros();
                                break;
                            case 3:
                                System.out.print("\nDigite o isbn do livro: ");
                                int isbnLivro = sc.nextInt();
                                biblioteca.visualizarLivro(isbnLivro);
                                break;
                            case 4:
                                System.out.print("\nDigite o isbn do livro: ");
                                int deletarLivro = sc.nextInt();
                                Livro delLivro = biblioteca.encontrarLivroPorIsbn(deletarLivro);
                                if (delLivro != null) {
                                    System.out.println("Título: " + delLivro.getTitulo());
                                    System.out.println("Autor: " + delLivro.getAutor());
                                    System.out.println("ISBN: " + delLivro.getIsbn());
                                    biblioteca.deletarLivro(deletarLivro);
                                }
                                break;
                            case 5:
                                System.out.print("\nDigite o ISBN do livro: ");
                                int encontrarIsbn = sc.nextInt();
                                sc.nextLine(); 

                                Livro livro = biblioteca.encontrarLivroPorIsbn(encontrarIsbn);
                                if (livro != null) {
                                    System.out.println("\nLivro atual:");
                                    System.out.println("Título: " + livro.getTitulo());
                                    System.out.println("Autor: " + livro.getAutor());
                                    System.out.println("ISBN: " + livro.getIsbn());

                                    System.out.print("\nDigite o novo título do livro: ");
                                    String novoTitulo = sc.nextLine();
                                    System.out.print("\nDigite o novo autor do livro: ");
                                    String novoAutor = sc.nextLine();
                                    System.out.print("\nDigite o novo ISBN do livro: ");
                                    int novoIsbn = sc.nextInt();
                                    sc.nextLine(); 

                                    biblioteca.editarLivro(novoIsbn, novoTitulo, novoAutor);
                                    System.out.println("\nLivro atualizado com sucesso!");
                                } else {
                                    System.out.println("\nLivro não encontrado!");
                                }
                                break;
                            case 0:
                                // Voltar ao menu principal
                                break;
                            default:
                                System.out.println("\nOpção inválida. Tente novamente.");
                        }
                    } while (submenuOption != 0);
                    break;
                case 2:
                    do {
                        System.out.println("\n1. Cadastrar Usuário");
                        System.out.println("2. Listar Usuários");
                        System.out.println("3. Visualizar Usuário");
                        System.out.println("4. Excluir Usuário");
                        System.out.println("5. Editar Usuário");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha uma opção: ");

                        submenuOption = sc.nextInt();
                        sc.nextLine();

                        switch (submenuOption) {
                            case 1:
                                // Código para cadastrar usuário
                                break;
                            case 2:
                                // Código para listar usuários
                                break;
                            case 3:
                                // Código para visualizar usuário
                                break;
                            case 4:
                                // Código para excluir usuário
                                break;
                            case 5:
                                // Código para editar usuário
                                break;
                            case 0:
                                // Voltar ao menu principal
                                break;
                            default:
                                System.out.println("\nOpção inválida. Tente novamente.");
                        }
                    } while (submenuOption != 0);
                    break;
                case 3:
                    do {
                        System.out.println("\n1. Cadastrar Empréstimo");
                        System.out.println("2. Listar Empréstimos");
                        System.out.println("3. Visualizar Empréstimo");
                        System.out.println("4. Excluir Empréstimo");
                        System.out.println("5. Editar Empréstimo");
                        System.out.println("0. Voltar");
                        System.out.print("Escolha uma opção: ");

                        submenuOption = sc.nextInt();
                        sc.nextLine();

                        switch (submenuOption) {
                            case 1:
                                // Código para cadastrar empréstimo
                                break;
                            case 2:
                                // Código para listar empréstimos
                                break;
                            case 3:
                                // Código para visualizar empréstimo
                                break;
                            case 4:
                                // Código para excluir empréstimo
                                break;
                            case 5:
                                // Código para editar empréstimo
                                break;
                            case 0:
                                // Voltar ao menu principal
                                break;
                            default:
                                System.out.println("\nOpção inválida. Tente novamente.");
                        }
                    } while (submenuOption != 0);
                    break;
                case 0:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (option != 0);

        sc.close();
    }
}
