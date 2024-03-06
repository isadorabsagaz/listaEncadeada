public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        Nodo nodo0 = new Nodo(0);
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);


        lista.inserirFinal(nodo0);
        lista.inserirFinal(nodo1);
        lista.inserirFinal(nodo2);
        lista.inserirFinal(nodo3);
        lista.mostrar();

        /*   //TESTA REMOÇÕES E LISTA VAZIA

        lista.removerInicio();
        lista.removerFinal();
        lista.removerFinal();
        lista.removerInicio();
        lista.removerInicio();
        lista.mostrar();

        */

        lista.inserirPosicaoEspecifica(nodo4, 2);
        lista.mostrar();
        lista.removerPosicaoEspecifica(2);
        lista.mostrar();


        Nodo acesso = lista.acessarPorIndex(9);
        if(acesso != null){
            System.out.println("valor nodo acessado: "+acesso.getValor());
        }
        else System.out.println("index acessado nao existe");


        acesso = lista.pesquisarPorValor(1);
        if(acesso != null){
            System.out.println("valor nodo pesquisado: "+acesso.getValor());
        }
        else System.out.println("valor pesquisado nao existe");
    }
}