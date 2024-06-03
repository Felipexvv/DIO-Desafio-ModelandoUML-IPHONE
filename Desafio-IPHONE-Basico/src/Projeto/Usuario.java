package Projeto;

public class Usuario {
    public static void main(String[] args) {
        iphone iphone1 = new iphone();
        
        //Navegando na web
        iphone1.exibirPagina("www.github.com/Felipexvv");
        iphone1.adicionandoNovaAba();
        iphone1.atualizarPagina();

        System.out.println("-------------------------");
        //Reproduzindo musicas

        iphone1.selecionarMusica("O nome dele é alan");
        iphone1.tocar();
        iphone1.pausar();

        System.out.println("-------------------------");
        //Aparelho telefonico

        iphone1.ligar("40028922");
        iphone1.iniciandoCorreioVoz();
        iphone1.atender();
    }
}
