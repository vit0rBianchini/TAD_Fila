public class Merge {
    
    public static Fila gerarLista(Fila a, Fila b) {
        /* 
        Método para gerar uma nova lista ordenada a partir das listas ordenadas a e b.
        */
        Fila mergeLista = new Fila(a.tamanho + b.tamanho);
        while(!(Fila.vazia(a) && Fila.vazia(b))){
            
            int v1 = Fila.primeiro(a);
            int v2 = Fila.primeiro(b);
            
            int valor;
            //Verifica qual valor deve ser enfileirado
            if(v1 > v2){
                //Verifica se a lista b está vazia
                if(Fila.vazia(b)){
                    valor = Fila.remover(a);
                    Fila.inserir(mergeLista, valor);
                    continue;
                }
                //Garante que não será enfileirado um valor zerado
                if(v2 != 0){
                    valor = Fila.remover(b);
                    Fila.inserir(mergeLista, valor);
                    continue;
                }else{
                    valor = Fila.remover(a);
                    Fila.inserir(mergeLista, valor);
                    continue;
                }
                
            }
            
            if(v2 > v1){
                if(Fila.vazia(a)){
                    valor = Fila.remover(b);
                    Fila.inserir(mergeLista, valor);
                    continue;
                }
                //Garante que não será enfileirado um valor zerado
                if(v1 != 0){
                    valor = Fila.remover(a);
                    Fila.inserir(mergeLista, valor);
                    continue;
                }else{
                    valor = Fila.remover(b);
                    Fila.inserir(mergeLista, valor);
                    continue;
                }
            }
            
            //Se os valores são iguais, é salva na lista uma ocorrência
            if(v1 == v2){
                valor = Fila.remover(a);
                Fila.remover(b);
                Fila.inserir(mergeLista, valor);
            }
            
        }
        
        return mergeLista;
        
    }
}
