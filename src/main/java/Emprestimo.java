import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    
    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
       this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
             return formatter.parse(formatter.format(dataEmprestimo)); 
        } catch (ParseException e) {
            e.printStackTrace();
            return null; 
        }
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return formatter.parse(formatter.format(dataDevolucao)); 
        } catch (ParseException e) {
            e.printStackTrace();
            return null; 
        }
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + livro.getTitulo() + ", Usuário: " + usuario.getNome() + 
            ", Data de Empréstimo: " + dataEmprestimo + ", Data de Devolução: " + dataDevolucao);
    }
}
