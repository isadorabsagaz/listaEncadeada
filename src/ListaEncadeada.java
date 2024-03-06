import java.sql.SQLOutput;

public class ListaEncadeada {

    private Nodo lista;
    private int numElementos;

    public ListaEncadeada() {
        this.lista = null;
        this.numElementos = 0;
    }
    public Nodo getLista() {
        return lista;
    }

    public void setLista(Nodo lista) {
        this.lista = lista;
    }
    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }
    public void inserirInicio(Nodo novoNodo) {
        if (this.lista == null) {
            this.lista = novoNodo;
        } else {
            novoNodo.setProx(this.lista);
            this.lista = novoNodo;
        }
        numElementos++;
    }

    public void inserirFinal(Nodo novoNodo) {
        if (this.lista == null) {
            this.lista = novoNodo;
        } else {
            Nodo aux = this.lista;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNodo);
        }
        numElementos++;
    }

    public void inserirPosicaoEspecifica(Nodo novoNodo, int index) {
        if (this.lista == null) {
            this.lista = novoNodo;
        }
        if(index <= numElementos){
            Nodo aux = this.lista;
            for (int i = 0; i < index - 1; i++) {
                aux = aux.getProx();
            }
            novoNodo.setProx(aux.getProx());
            aux.setProx(novoNodo);
            this.numElementos++;
        } else System.out.println("index invalido!");
    }

    public void removerInicio() {
        if (this.lista == null) {
            System.out.println("lista vazia!");
            this.numElementos = 0;
        } else {
            lista = lista.getProx();
            this.numElementos--;
        }
    }

    public void removerFinal() {
        if (this.lista == null) {
            System.out.println("lista vazia!");
            this.numElementos = 0;
        } else {
            if (lista.getProx() == null) {
                lista = null;
                return;
            }
            Nodo aux = this.lista;
            while (aux.getProx().getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.numElementos--;
        }
    }
    public void removerPosicaoEspecifica(int index){
        if (this.lista == null) {
            System.out.println("lista vazia!");
            this.numElementos = 0;
        }
        if(index <= numElementos){
            Nodo aux = this.lista;
            if(index == 0){
              aux = null;
              this.lista = this.lista.getProx();
            }
            else{
                for (int i = 0; i < index - 1; i++) {
                aux = aux.getProx();
            }
                aux.setProx(aux.getProx().getProx());
            }
            this.numElementos--;
        } else System.out.println("index invalido!");
    }
    public Nodo acessarPorIndex(int index){
        if (this.lista == null) {
            System.out.println("lista vazia!");
            return null;
        }
        else {
            Nodo aux = this.lista;
            int i = 0;
            while(i < index && aux != null){
                aux = aux.getProx();
                i++;
            }
            return aux;
        }
    }

    public Nodo pesquisarPorValor(int valor){
        if (lista == null) {
            System.out.println("lista vazia!");
            return null;
        }
        else{
            Nodo aux = this.lista;
            while(aux.getValor() != valor && aux.getProx()!= null){
                aux = aux .getProx();
            }
            if(aux.getValor() == valor){ return aux;
            } else return null;
        }
    }
    public void mostrar(){
        Nodo atual = this.lista;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProx();
        }
        System.out.println("numero elementos na lista: "+this.numElementos);
        System.out.println("-------------------------------");
    }
}


