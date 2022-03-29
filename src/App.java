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


        Fila.inserir(b, 1);
        Fila.inserir(b, 5);
        Fila.inserir(b, 6);
        Fila.inserir(b, 9);
        Fila.inserir(b, 11);

        Fila c = Merge.gerarLista(a, b);

        Fila.mostraLista(c);

        
        
    }
}
