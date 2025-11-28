package module;
import java.util.*;

public class PlaylistPorGeneroDuracao extends Playlist {
    public PlaylistPorGeneroDuracao(String nome, List<Musica> todas, String genero, int duracaoMax) {
        super(nome);
        int duracaoAtual = 0;

        for (Musica m : todas) {
            if (m.getGenero().equalsIgnoreCase(genero) && duracaoAtual + m.getDuracao() <= duracaoMax) {
                musicas.add(m.clone());
                duracaoAtual += m.getDuracao();
            }
        }
    }

    @Override
    public void reproduzir() {
        for (Musica m : musicas) m.reproduzir();
    }

    @Override
    public Playlist clone() {
        return new PlaylistPorGeneroDuracao(this.nome, this.musicas, "GENERO", 0); // ajustar se necessário
    }
}
