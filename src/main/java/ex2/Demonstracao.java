package ex2;

import estrutura.Pessoa;

class Demonstracao {
    public static void main(String[] args){
        Fila fila = new Fila();

        fila.adicionar(0,new Pessoa("Gabriel"));
        fila.adicionar(1,new Pessoa("Jésse"));
        fila.adicionar(2,new Pessoa("Lucio"));
        fila.adicionar(3,new Pessoa("Matheus"));

        fila.listarTodos();

        fila.removerFila();
        fila.listarTodos();
        fila.removerFila();
        fila.listarTodos();

        fila.buscar("lucio");

        fila.adicionar(2,new Pessoa("João"));
        fila.adicionar(3,new Pessoa("Pedro"));
        fila.getPessoa(3);
    }
}
