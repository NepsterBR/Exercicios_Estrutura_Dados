package ex3;

import estrutura.EstruturaDados;
import estrutura.Pessoa;

public class Pilha implements EstruturaDados {

    private int tamanho = 1;
    private Pessoa[] pilha = new Pessoa[this.tamanho];

    @Override
    public void adicionar(int index, Pessoa pessoa) {
        int indice = this.tamanho -1;
        this.pilha[indice] = pessoa;
        this.tamanho++;
        var temp = new Pessoa[this.tamanho];
        for (int i = 0; i < this.pilha.length; i++) {
            temp[i] = this.pilha[i];
        }
        this.pilha = temp;

    }

    @Override
    public void buscar(String nome) {
        for (Pessoa pessoa : this.pilha) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(nome);
            }
        }
    }

    public void removerPilha(){
        this.tamanho--;
        int diminuiTamanho = this.tamanho - 1;
        var temp = new Pessoa[this.tamanho];
        for (int i = 0; i < temp.length; i++) {
            if (i != diminuiTamanho){
                temp[i] = this.pilha[i];
            }
        }
        this.pilha = temp;
    }

    @Override
    public void listarTodos() {
        for (Pessoa pessoa : this.pilha){
            if (pessoa != null){
                System.out.println(pessoa);
            }
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        return this.pilha[index];
    }

    @Override
    public void remover(Pessoa pessoa) {

    }

    @Override
    public void remover(int index) {

    }

}
