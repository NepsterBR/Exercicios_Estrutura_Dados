package linkedList;

import estrutura.EstruturaDados;
import estrutura.Pessoa;
import lombok.NoArgsConstructor;


@NoArgsConstructor

public class LinkedList implements EstruturaDados {

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
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O nome " + node.getData() + " foi adicionado.");
        System.out.println("=======================================");
    }

    public void adicionarInicio(Pessoa pessoa) {
        Node node = new Node(pessoa);
        if (this.head == null) {
        } else {
            node.setNext(this.head);
        }
        this.head = node;
        System.out.println();
        System.out.println("======================================================");
        System.out.println("O nome " + pessoa + " foi adicionado ao inicio da lista.");
        System.out.println("=======================================+++++++++++++++");
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
        System.out.println();
        System.out.println("======================================================");
        System.out.println("O nome " + pessoa + " foi adicionado ao fim da lista.");
        System.out.println("=======================================+++++++++++++++");
    }

    @Override
    public void buscar(String nome) {
        Node node = this.head;
        while (node != null) {
            Pessoa pessoa = node.getData();
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println();
                System.out.println("=======================================");
                System.out.println("O nome " + nome + " foi encontrado. ");
                System.out.println("=======================================");
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
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O nome " + pessoa + " da fila foi removido");
        System.out.println("=======================================");
    }

    @Override
    public void remover(int index) {
        Pessoa pessoa = this.getPessoa(index);
        this.remover(pessoa);
        System.out.println();
        System.out.println("=======================================");
        System.out.println("O nome no indice " + index + " da fila foi removido");
        System.out.println("=======================================");
    }

    @Override
    public void listarTodos() {
        Node node = this.head;
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>> LISTA <<<<<<<<<<<<<<<<");
        System.out.println();
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println("=======================================");
    }

    @Override
    public Pessoa getPessoa(int index) {
        int cont = 0;
        Node node = this.head;
        System.out.println();
        System.out.println("=======================================");
        while (node != null) {
            if (cont == index) {
                System.out.println(node.getData());
                System.out.println("=======================================");
                return node.getData();
            }
            cont++;
            node = node.getNext();

        }
        return null;
    }
}
