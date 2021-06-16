package estrutura;

public interface EstruturaDados {
    void adicionar(int index, Pessoa pessoa);
    void buscar(String nome);
    void remover(Pessoa pessoa);
    void remover(int index);
    void listarTodos();
    Pessoa getPessoa(int index);
}
