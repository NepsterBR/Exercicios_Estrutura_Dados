package ex2;

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
            temp[i] = fila[i + 1];
        }
        this.fila = temp;
    }

    @Override
    public void buscar(String nome) {
        for (Pessoa pessoa : this.fila) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(nome);
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
    }

    @Override
    public void listarTodos() {
        for (Pessoa pessoa : this.fila){
            if (pessoa != null){
                System.out.println(pessoa);
            }
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
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
