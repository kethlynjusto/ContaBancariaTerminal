package br.com.DesafioIphone;

import br.com.DesafioIphone.AparelhoTelefonico.AparelhoTelefonico;
import br.com.DesafioIphone.Iphone.Iphone;
import br.com.DesafioIphone.NavegadorInternet.NavegadorInternet;
import br.com.DesafioIphone.ReprodutorMusical.ReprodutorMusical;

public class Teste {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = myIphone;

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInternet navegadorInternet = myIphone;

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina();

        ReprodutorMusical reprodutorMusical = myIphone;

        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();


    }
}
