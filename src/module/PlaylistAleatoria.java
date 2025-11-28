package module;
import java.util.*;

public class PlaylistAleatoria extends Playlist {
    public PlaylistAleatoria(String nome, List<Musica> todas, int tamanho) {
        super(nome);
        Collections.shuffle(todas);
        for (int i = 0; i < Math.min(tamanho, todas.size()); i++) {
            musicas.add(todas.get(i).clone());
        }
    }

    @Override
    public void reproduzir() {
        for (Musica m : musicas) {
            m.reproduzir();
        }
    }

    @Override
    public Playlist clone() {
        return new PlaylistAleatoria(this.nome, this.musicas, this.musicas.size());
    }
}
