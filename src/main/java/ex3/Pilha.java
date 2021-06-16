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
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O nome " + pessoa + " foi adicionado.");
        System.out.println("=======================================");
    }

    @Override
    public void buscar(String nome) {
        for (Pessoa pessoa : this.pilha) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println();
                System.out.println("=======================================");
                System.out.println("O nome buscado foi " + nome);
                System.out.println("=======================================");
            }
            break;
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
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O último nome da pilha foi removido");
        System.out.println("=======================================");
    }

    @Override
    public void listarTodos() {
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>> LISTA <<<<<<<<<<<<<<<<");
        System.out.println();
        for (Pessoa pessoa : this.pilha){
            if (pessoa != null){
                System.out.println(pessoa);
            }
        }
        System.out.println("=======================================");
    }

    @Override
    public Pessoa getPessoa(int index){
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O nome no índice " + index + " é " + this.pilha[index]);
        System.out.println("=======================================");
        return this.pilha[index];
    }

    @Override
    public void remover(Pessoa pessoa) {

    }

    @Override
    public void remover(int index) {

    }

}
