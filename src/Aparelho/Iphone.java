package Aparelho;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        System.out.println("Reproduzindo musica via equipamento Iphone");
    }
    public void pausar() {
        System.out.println("Parado na musica via equipamento Iphone");
    }


    public void selecionarMusica() {
        System.out.println("Escolhendo musica via equipamento Iphone");
    }


    public void pagina() {
        System.out.println("Abrindo a pagina via equipamento Iphone");
    }


    public void adicionandoNovaPagina() {
        System.out.println("Adicionando nova pagina via equipamento Iphone");
    }


    public void atualizaPagina() {
        System.out.println("Atualizando a pagina via equipamento Iphone");
    }


    public void ligar() {
        System.out.println("Ligar via equipamento Iphone");
    }

    @Override
    public void desligar() {

    }


    public void atender() {
        System.out.println("Atender via equipamento Iphone");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz via equipamento Iphone");
    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }
}
