package ex1;

import estrutura.EstruturaDados;
import estrutura.Pessoa;
import lombok.NoArgsConstructor;


@NoArgsConstructor

public class Linked_List implements EstruturaDados {

    private class Node {
        private Pessoa data;
        private Node next;

        public Node(Pessoa pessoa) {
            this.data = pessoa;
        }

        public Pessoa getData() {
            return data;
        }

        public void setData(Pessoa data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;

    @Override
    public void adicionar(int index, Pessoa pessoa) throws IndexOutOfBoundsException {
        Node node = new Node(pessoa);
        if (this.head == null) {
            this.head = node;
        } else if (this.head.getNext() == null) {
            this.head.setNext(node);
        } else {
            node.setNext(this.head.getNext());
            this.head.setNext(node);
        }
    }

    public void adicionarInicio(Pessoa pessoa) {
        Node node = new Node(pessoa);
        if (this.head == null) {
        } else {
            node.setNext(this.head);
        }
        this.head = node;
    }

    public void adicionarFim(Pessoa pessoa) {
        Node newNode = new Node(pessoa);
        Node node = this.head;
        if (this.head == null) {
            this.head = newNode;
        } else {
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
    }

    @Override
    public void buscar(String nome) {
        Node node = this.head;
        while (node != null) {
            Pessoa pessoa = node.getData();
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(pessoa);
            }
            node = node.getNext();
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        Node node = this.head;
        Node previous = null;
        while (node != null) {
            if (node.getData().equals(pessoa)) {
                if (previous == null) {
                    this.head = node.getNext();
                } else {
                    previous.setNext(node.getNext());
                }
                break;
            }
            previous = node;
            node = node.getNext();
        }
    }

    @Override
    public void remover(int index) {
        Pessoa pessoa  = this.getPessoa(index);
        this.remover(pessoa);
    }

    @Override
    public void listarTodos() {
        Node node = this.head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        int cont = 0;
        Node node =this.head;
        while(node != null){
            if (cont == index){
                return node.getData();
            }
            cont++;
            node = node.getNext();

        }

        return null;
    }
}