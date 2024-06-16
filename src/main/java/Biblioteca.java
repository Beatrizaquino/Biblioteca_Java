import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
  private ArrayList<Livro> livros;
  private ArrayList<Usuario> usuarios;
  private ArrayList<Emprestimo> emprestimos;
  // private int livroId;
  // private int usuarioId;
  // private int emprestimoId;

  public Biblioteca() {
    livros = new ArrayList<Livro>();
    usuarios = new ArrayList<Usuario>();
    emprestimos = new ArrayList<Emprestimo>();
    // livroId = 1;
    // usuarioId = 1;
    // emprestimoId = 1;
  }

  public void addLivros(String titulo, String autor, int isbn) {
      for (Livro livro : livros) {
          if (livro.getIsbn() == isbn) {
              System.out.println("\nErro:\nUm livro com esse isbn já existe.");
              return;
          }
      }
      Livro novoLivro = new Livro(titulo, autor, isbn);
      livros.add(novoLivro);
      System.out.println("Livro adicionado com sucesso!");
  }

  public void listarLivros() {
    if (livros.isEmpty()) {
      System.out.println("Não há livros cadastrados.");
    } else {
      for (Livro livro : livros) {
        System.out.println(livro);
      }
    }
  }

  public void visualizarLivro(int isbn) {
    for (Livro livro : livros) {
      if (livro.getIsbn() == isbn) {
        System.out.println(livro);
        return;
      }
    }
    System.out.println("Livro não encontrado.");
  }

  public void deletarLivro(int isbn) {
    for (int i = 0; i < livros.size(); i++) {
      if (livros.get(i).getIsbn() == isbn) {
        livros.remove(i);
        System.out.println("Livro excluído com sucesso!");
        return;
      }
      System.out.println("Livro não encontrado!");
    }
  }

  public void editarLivro(int isbn, String titulo, String autor) {
    for (Livro livro : livros) {
      if (livro.getIsbn() == isbn) {
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        System.out.println("Livro editado com sucesso!");
        return;
      }
    }
    System.out.println("Livro não encontrado!");
  }

  public Livro encontrarLivroPorIsbn(int isbn) {
      for (Livro livro : livros) {
          if (livro.getIsbn() == isbn) {
              return livro;
          }
      }
      return null;
  }

  // metodos para usuario
  public void addUsuario(String nome, String cpf, String endereco) {
    Usuario newUser = new Usuario(nome, cpf, endereco);
    usuarios.add(newUser);
    System.out.println("Usuário adicionado com sucesso!");
  }

  public void listarUsuarios() {
    if (usuarios.isEmpty()) {
      System.out.println("Usuaio não encontrado!");
    } else {
      for (Usuario usuario : usuarios) {
        System.out.println(usuario);
      }
    }
  }

  public void visualizarUsuario(int cpf) {
    for (Usuario usuario : usuarios) {
      if (usuario.getCpf().equals(String.valueOf(cpf))) {
        System.out.println(usuario);
        return;
      }
    }
    System.out.println("Usuário não encontrado!");
  }

  public void deletarUsuario(int cpf) {
    for (int i = 0; i < usuarios.size(); i++) {
      if (usuarios.get(i).getCpf().equals(String.valueOf(cpf))) {
        usuarios.remove(i);
        System.out.println("Usuário excluído com sucesso!");
        return;
      }
    }
    System.out.println("Usuário não encontrado!");
  }

  public void editarUsuario(int cpf, String nome, String endereco) {
    for (Usuario usuario : usuarios) {
      if (usuario.getCpf().equals(String.valueOf(cpf))) {
        usuario.setNome(nome);
        usuario.setEndereco(endereco);
        System.out.println("Usuário editado com sucesso!");
        return;
      }
    }
    System.out.println("Usuário não encontrado!");
  }

  // metodos para emprestimo
  public void addEmprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
    Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, dataDevolucao);
    emprestimos.add(emprestimo);
    System.out.println("Empréstimo adicionado com sucesso!");
  }

  public void listarEmprestimos() {
    if(emprestimos.isEmpty()){
      System.out.println("Nem um emprestimo encontrado!");
    } else {
      for(Emprestimo emprestimo : emprestimos){
        System.out.println(emprestimo);
      }
    }
  }

  public void visualizarEmprestimo(Livro livro) {
    for(Emprestimo emprestimo : emprestimos){
      if(emprestimo.getLivro().getTitulo().equals(livro.getTitulo())){
        System.out.println(emprestimo);
        return;
      }
    }
    System.out.println("Emprestimo não encontrado!");
  } 

  public void deletarEmprestimo(Livro livro){
    for(int i = 0; i < emprestimos.size(); i++){
      if(emprestimos.get(i).getLivro().getIsbn() == livro.getIsbn()){
        emprestimos.remove(i);
        System.out.println("Emprestimo excluído com sucesso!");
        return;
      }
    }
    System.out.println("Emprestimo não encontrado!");
  }

  public void editarEmprestimo(Livro livro, Usuario usuario){
    for(Emprestimo emprestimo : emprestimos){
      if(emprestimo.getLivro().getIsbn() == livro.getIsbn() && emprestimo.getUsuario().getCpf().equals(usuario.getCpf())){
        emprestimo.setLivro(livro); 
        emprestimo.setUsuario(usuario); 
        System.out.println("Empréstimo editado com sucesso!"); 
        return; 
      }
    }
    System.out.println("Empréstimo não encontrado!"); 
  }

}