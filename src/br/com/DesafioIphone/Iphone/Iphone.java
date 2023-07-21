package br.com.DesafioIphone.Iphone;

import br.com.DesafioIphone.AparelhoTelefonico.AparelhoTelefonico;
import br.com.DesafioIphone.NavegadorInternet.NavegadorInternet;
import br.com.DesafioIphone.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("Iphone Ligando");
    }

    public void atender() {
        System.out.println("Iphone Atendendo");

    }

    public void iniciarCorreioVoz() {
        System.out.println("Iphone Correio de Voz");
    }

    public void exibirPagina() {
        System.out.println("Iphone Iniciando Navegador Internet");

    }

    public void adicionarNovaAba() {
        System.out.println("Iphone Abrindo outra página no Navegador");
    }

    public void atualizarPagina() {
        System.out.println("Iphone atualizando página Navegador");
    }

    public void tocar() {
        System.out.println("Iphone tocando música");

    }

    public void pausar() {
        System.out.println("Iphone pausando musica");

    }

    public void selecionarMusica() {
        System.out.println("Iphone selecionando musica");

    }
}
