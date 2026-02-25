public class Contato {

    void enviarMensagem(String mensagem){
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    void enviarMensagem(String nome, String mensagem){
        System.out.println("Mensagem enviada para " + nome + ": " + mensagem);
    }

    void enviarMensagem(String nome, String mensagem, int repete){
        for(int i = 1; i <= repete; i++){
            System.out.println("Mensagem para: " + nome + ": " + mensagem);
        }
    }
}
