package ex1;

import estrutura.Pessoa;

public class Demonstracao {
    public static void main(String[] args){
        Linked_List ll = new Linked_List();

        Pessoa pessoa1 = new Pessoa("Nicolas");

        ll.adicionar(0, new Pessoa("Gabriel"));
        ll.adicionar(1, new Pessoa("João"));
        ll.adicionar(2, new Pessoa("Jésse"));
        ll.adicionar(3, new Pessoa("Lúcio"));

        ll.listarTodos();

        ll.adicionarFim(new Pessoa("Larissa"));
        ll.adicionarInicio(new Pessoa("Matheus"));
        ll.adicionar(1, pessoa1);

        ll.listarTodos();
        ll.buscar("Jésse");

        ll.remover(pessoa1);
        ll.listarTodos();

        ll.remover(3);
        ll.listarTodos();

        ll.getPessoa(2);


    }
}
