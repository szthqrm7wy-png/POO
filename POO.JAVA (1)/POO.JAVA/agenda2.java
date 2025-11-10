import java.util.ArrayList;

public class agenda2 {
    private ArrayList<Contato> contatos = new ArrayList<>();
    //String é um vetor de caracteres(char)

    public void armazenarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }

    public void removerNomeContato(String nome) {
        int posicao = encontrarContato(nome);
        if (posicao != -1) {
            contatos.remove(posicao);
        }
    }

    public int encontrarContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            //.get(i) pega o objeto na posição i;
            //.get_nome() função que retorna o nome do objeto;
            //.equals(nome) compara o nome do objeto com o nome passado como parâmetro
            if (contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o contato não for encontrado
    }

    public void imprimirContatos() {
        System.out.println("======INÍCIO======");
        for (Contato contato : contatos) { // para cada contato na lista de contatos
            contato.imprimeInformacoes();
            System.out.println("");
        }
        System.out.println("======FIM======");
    }

    public void imprimeContato(int posicao){
        this.contatos.get(posicao).imprimeInformacoes();
    }
}
