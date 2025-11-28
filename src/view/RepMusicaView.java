package view;

import module.Musica;
import module.SpotifUM;

import java.util.List;

public class RepMusicaView {
    public static String menurepmusica() {
        Util.clearScreen();
        Util.printHeader();
    
        Util.println("\nReproduzir Música\n");
    
        for (Musica m : SpotifUM.getMusicas()) {
            Util.println("- " + m.getNome() + " por " + m.getInterprete());
        }
    
        String nome = Util.input("\nEscreva o nome da música que quer ouvir: ");
        return nome;
    }
    
    

    public static void mostrarDetalhesMusica(Musica musica) {
        Util.clearScreen();
        Util.printHeader();

        Util.println("\nAgora a reproduzir: " + musica.getNome());
        Util.println("Artista: " + musica.getInterprete());
        Util.println("Duração: " + musica.getDuracao() + " segundos");
        Util.println("Género: " + musica.getGenero());
        Util.println("Editora: " + musica.getEditora());
        Util.println("Letra: " + musica.getLetra());
        Util.waitInput();
    }
}
