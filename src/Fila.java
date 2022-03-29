public class Fila{
    public int[] fila;
    public int ultimo, primeiro;
    public int tamanho, max;

    public Fila(int tamanho){
        this.fila = new int[tamanho];
        this.primeiro = 0;
        this.ultimo = -1;
        this.tamanho = 0;
        this.max = tamanho;
    }

    public static boolean vazia(Fila f) {
        return (f.tamanho == 0);
    }

    public static boolean cheia(Fila f){
        return (f.tamanho == f.max);
    }

    public static int primeiro(Fila f){
        return f.fila[f.primeiro];
        
    }

    public static int ultimo(Fila f){
        if(f.ultimo == -1){
            return -1;
        }else{
            return f.fila[f.ultimo];
        }
    }

    public static void mostraLista(Fila f){
        int posicao = f.primeiro;
        for (int i = 0; i < f.tamanho; i++){
            if(posicao == f.max){
                posicao = 0;
            }
            System.out.println(f.fila[posicao]);
            posicao = posicao + 1;
        }
    }

    public static void inserir(Fila f, int valor) {
        if(!cheia(f)){
            f.ultimo++;
            if(f.ultimo == f.max){
                f.ultimo = 0;
            }
            f.fila[f.ultimo] = valor;
            f.tamanho++;
        }else{
            System.out.println("A fila está cheia");
        }

    }

    public static int remover(Fila f){
        if(!vazia(f)){
            int valor = f.fila[f.primeiro];
            f.primeiro++;
            if(f.primeiro == f.max){
                f.primeiro = 0;
                f.tamanho--;
                return valor;
            }
            f.tamanho--;
            return valor;
        }else{
            System.out.println("A fila está vazia");
            return -1;
        }
    }
}
