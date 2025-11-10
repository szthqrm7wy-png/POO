public class AtividadeAgenda {
    //1 - crie a classe AtividadeAgenda;
    public static void main(String[] args) {
    //2 - criea função main;

        //3 - instancie 3 contatos;
        Contato contato1 = new Contato(
            "Lotier Lucia",
            "lotielucia@gmail.com",
            "99999-9999");

        Contato contato2 = new Contato(
            "Atlas",    
            "atlas@gmail.com",
            "88888-8888");

        Contato contato3 = new Contato(
            "Lilith",
            "lilith@gmail.com",
            "77777-7777");

        //4 - intancie a agenda;
        agenda2 agenda1 = new agenda2();

        //5 - Salve os 3 contatos na agenda;
        agenda1.armazenarContato(contato1);
        agenda1.armazenarContato(contato2);
        agenda1.armazenarContato(contato3);

        //6 - imprima a agenda completa;
        agenda1.imprimirContatos();

        //7 - remova o contato na posição 1;
        agenda1.removerContato(contato1);

        //8 - imprima a agenda completa;
        agenda1.imprimirContatos();

        //9 - Instancie um novo contato;
        Contato contato4 = new Contato(
            "Mariane",
            "cardosomariane@gmail.com",
            "12345-6789");

        //10 - salve na agenda;
        agenda1.armazenarContato(contato4);

        //11 - encontre o novo contato pelo nome;
        agenda1.encontrarContato("Mariane");

        //12 - imprima as informações do contato na posição 1;
        agenda1.imprimeContato(1);

        //13 - imprima a lista completa;
        agenda1.imprimirContatos();

        // EXTRA - Criar um método que remove o contato passando o seu nome como parâmetro.
        agenda1.removerNomeContato("Atlas");
        agenda1.imprimirContatos();
            
            
            
    }
}