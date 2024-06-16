public class Usuario extends Pessoa {
  private String endereco;

  public Usuario(String nome, String cpf, String endereco) {
    super(nome, cpf);
    this.endereco = endereco;
  }

  // get and set

  public String getEndereço() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  // pesquisar mais sobre o override -> que é uma sobrescrita de método

  @Override
  public String toString() {
    return "Usuario{" + "nome=" + getNome() + ", cpf=" + getCpf() + ", endereco=" + endereco + '}';
  }

  // Implement the abstract method
  @Override
  public void exibirDetalhes() {
    System.out.println("Nome: " + getNome());
    System.out.println("CPF: " + getCpf());
    System.out.println("Endereço: " + getEndereço());
  }
}