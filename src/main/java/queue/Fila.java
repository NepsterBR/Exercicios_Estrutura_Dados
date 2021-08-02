package queue;

import estrutura.EstruturaDados;
import estrutura.Pessoa;

public class Fila implements EstruturaDados {

    private int tamanho = 1;
    private Pessoa[] fila = new Pessoa[this.tamanho];

    @Override
    public void adicionar(int index, Pessoa pessoa) {
        int indice = this.tamanho - 1;
        this.fila[indice] = pessoa;
        this.tamanho++;
        var temp = new Pessoa[this.tamanho];
        for (int i = 0; i < this.fila.length; i++) {
            temp[i] = this.fila[i];
        }
        this.fila = temp;
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O nome " + pessoa + " foi adicionado.");
        System.out.println("=======================================");
    }

    @Override
    public void buscar(String nome) {
        for (Pessoa pessoa : this.fila) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println();
                System.out.println("=======================================");
                System.out.println("O nome buscado foi " + nome);
                System.out.println("=======================================");
                break;
            }
        }
    }

    public void removerFila(){
        this.tamanho--;
        var temp = new Pessoa[this.tamanho];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = this.fila[i + 1];
        }
        this.fila = temp;
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O primeiro nome da fila foi removido");
        System.out.println("=======================================");

    }

    @Override
    public void listarTodos() {
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>> LISTA <<<<<<<<<<<<<<<<");
        System.out.println();
        for (Pessoa pessoa : this.fila){
            if (pessoa != null){
                System.out.println(pessoa);
            }
        }
        System.out.println("=======================================");
    }

    @Override
    public Pessoa getPessoa(int index) {
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O nome no índice " + index + " é " + this.fila[index]);
        System.out.println("=======================================");
        return this.fila[index];
    }

    @Override
    public void remover(Pessoa pessoa) {
        //Em filas,
        //Não é possível remover uma pessoa especifica,
        //apenas a primeira.
    }

    @Override
    public void remover(int index) {
        //Em filas,
        //Não é possível remover um index especifico,
        //apenas o primeiro.
    }
}
