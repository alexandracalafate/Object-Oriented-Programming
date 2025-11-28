package module;

import java.util.ArrayList;
import java.util.List;

import module.user.Utilizador;

public class SpotifUM {
    private static List<Musica> musicas = new ArrayList<>(); // ✅ Inicializada diretamente
    private static List<Utilizador> utilizadores = new ArrayList<>(); // ✅ Também estática para uso global

    // Adiciona uma música à lista de músicas
    public static void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    // Retorna todas as músicas
    public static List<Musica> getMusicas() {
        return musicas;
    }

    // Adiciona um utilizador à lista de utilizadores
    public static void adicionarUtilizador(Utilizador utilizador) {
        utilizadores.add(utilizador);
    }

    // Retorna todos os utilizadores
    public static List<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    // Procura música por nome
    public static Musica getMusicaPorNome(String nome) {
        for (Musica m : musicas) {
            if (m.getNome().equalsIgnoreCase(nome)) {
                return m;
            }
        }
        return null;
    }
}
