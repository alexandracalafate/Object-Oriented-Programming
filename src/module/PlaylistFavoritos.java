package module;
import java.util.*;

public class PlaylistFavoritos extends Playlist {
    public PlaylistFavoritos(String nome, List<Musica> maisReproduzidas) {
        super(nome);
        for (Musica m : maisReproduzidas) {
            musicas.add(m.clone());
        }
    }

    @Override
    public void reproduzir() {
        for (Musica m : musicas) m.reproduzir();
    }

    @Override
    public Playlist clone() {
        return new PlaylistFavoritos(this.nome, this.musicas);
    }
}
