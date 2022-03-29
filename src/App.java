public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TDE 1");
        Fila a = new Fila(6);
        Fila b = new Fila(5);

        Fila.inserir(a, 2);
        Fila.inserir(a, 3);
        Fila.inserir(a, 6);
        Fila.inserir(a, 7);
        Fila.inserir(a, 8);
        Fila.remover(a);
        Fila.remover(a);
        Fila.inserir(a, 9);
        Fila.inserir(a, 10);
        Fila.inserir(a, 12);
        Fila.inserir(a, 13); // Deve ser printado que a lista está cheia


        Fila.inserir(b, 1);
        Fila.inserir(b, 5);
        Fila.inserir(b, 6);
        Fila.inserir(b, 9);
        Fila.inserir(b, 11);

        Fila c = Merge.gerarLista(a, b);

        Fila.mostraLista(c);

        
        
    }
}
