public class Main {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.enviarMensagem("Olá!");
        contato.enviarMensagem("Giovanni", "Parabéns, você foi aprovado!");
        contato.enviarMensagem("Giuliana", "Não se esqueça de enviar os documentos!", 2);
    }
}
