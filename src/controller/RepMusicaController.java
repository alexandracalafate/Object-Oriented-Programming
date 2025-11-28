package controller;

import module.Musica;
import module.SpotifUM;
import module.user.Utilizador;
import view.RepMusicaView;
import controller.UserController;
import view.Util;

public class RepMusicaController {
    public static void playMusic(Utilizador user) {
        String nomeMusica = RepMusicaView.menurepmusica();

        if (nomeMusica == null) {
            return;
        }

        Musica musica = SpotifUM.getMusicaPorNome(nomeMusica);
        if (musica != null) {
            musica.reproduzir(); // Conta uma reprodução
            RepMusicaView.mostrarDetalhesMusica(musica);
        } else {
            Util.println("Música não encontrada.");
            Util.waitInput();
        }

        // Voltar ao menu
        UserController.menu(user);
    }
}
