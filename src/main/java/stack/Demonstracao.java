package stack;

import estrutura.Pessoa;

class Demonstracao {
    public static void main(String[] args){
        Pilha pilha = new Pilha();

        pilha.adicionar(0,new Pessoa("Gabriel"));
        pilha.adicionar(1,new Pessoa("Jésse"));
        pilha.adicionar(2,new Pessoa("Lucio"));
        pilha.adicionar(3,new Pessoa("Matheus"));

        pilha.listarTodos();

        pilha.removerPilha();
        pilha.listarTodos();
        pilha.removerPilha();
        pilha.listarTodos();

        pilha.buscar("lucio");

        pilha.adicionar(2,new Pessoa("João"));
        pilha.adicionar(3,new Pessoa("Pedro"));
        pilha.listarTodos();
        pilha.getPessoa(3);
    }
}
