package Projeto;

public class iphone implements ReprodutorMusical , AparelhoTelefonico, NavegadorBolado {
    
    //Reprodutor Musical
    public void tocar(){
        System.out.println("Musicas estao tocando n fique parado dance!");
    }

    public void pausar(){
        System.out.println("Descanse um pouco a musica parou!");
    }

    public void selecionarMusica(String musica){
        System.out.println("Procurando a A musica pra nois dançar xuxuzinho");
        System.out.println("Opa olha so essa predada em forma de musica: " + musica + " bora dancar ");
    }

    //Aparelho Telefonico

    public void ligar(String telefone){
        System.out.println("Ligando para o numero: " + telefone);
    }

    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void iniciandoCorreioVoz(){
        System.out.println("Correio Eletronico Iniciado...");
    }

    //Navegador Musical

    public void exibirPagina(String url){
        System.out.println("Entrando no site: " + url + " O site esta sendo exibido");
    }

    public void adicionandoNovaAba(){
        System.out.println("Uma nova aba foi aberta cuidado com o consumo de memoria RAM");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina atual");
    }
}
