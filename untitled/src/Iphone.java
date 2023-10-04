package untitled.src;

import untitled.src.internet.Internet;
import untitled.src.musica.Musica;
import untitled.src.telefone.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Internet internet = new Internet();
        internet.exibirPagina();
        internet.criarNovaPagina();
        internet.atualizarNavegador();

        Musica musica = new Musica();
        musica.selecionarMusica("Enter Sandman");
        musica.tocarMusica();
        musica.pausarMusica();


        Telefone telefone = new Telefone();
        telefone.realizarChamadas("Mirtes");
        telefone.atender();
        telefone.correiodeVoz();

    }
}
