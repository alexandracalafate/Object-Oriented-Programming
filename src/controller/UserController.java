package controller;

import module.user.Utilizador;
import module.user.UserListings;
import module.Musica;
import module.Playlist;
import view.RepMusicaView;
import view.UserView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserController {

    public static void menu(Utilizador user) {
        int option = UserView.menu();

        switch (option) {
            case 1:
                RepMusicaController.playMusic(user);
                break;
            case 2:
                showPlaylists(user);
                break;
            case 3:
                createPlaylist(user);
                break;
            case 4:
                logout();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    
    

    private static void showPlaylists(Utilizador user) {
        List<String> playlists = new ArrayList<>();
        for (Playlist playlist : user.getPlaylists()) {
            playlists.add(playlist.getNome());
        }
        UserView.showPlaylists(playlists);
    }

    private static void createPlaylist(Utilizador user) {
        if (user.isPremium()) {
            String nomePlaylist = UserView.createPlaylist();
            // Aqui poderias criar playlists diferentes dependendo da lógica do teu sistema
            user.criarPlaylistConstruida(nomePlaylist, true);  // Exemplo de criação
        } else {
            UserView.notPremium();
        }
    }

    public static void logout() {
        UserView.logout();
        // Código de logout, se necessário, como limpar o estado ou retornar ao menu inicial
    }

}
