package view;

import java.util.List;

import module.PlanoSubscricao;

public class UserView {

    public static int menu() {
        Util.clearScreen();
        Util.printHeader();
        Util.println("\nMENU\n");
        Util.println("[1] Reproduzir Música");
        Util.println("[2] Ver Playlists");
        Util.println("[3] Criar Playlist (Premium)");
        Util.println("[4] Logout");
        Util.println("[5] Exit\n");

        Integer option = Util.inputOption(5);
        return option;
    }

    

    public static PlanoSubscricao selectPlano() {
        Util.clearScreen();
        Util.printHeader();
        Util.println("\nEscolha o seu plano de subscrição:\n");
        
        // Mostrar os planos disponíveis
        Util.println("[1] FREE");
        Util.println("[2] PREMIUM_BASE");
        Util.println("[3] PREMIUM_TOP");
        
        // Loop para garantir que o utilizador escolhe uma opção válida
        int escolha;
        while (true) {
            escolha = Util.inputOption(3);
            if (escolha == 1 || escolha == 2 || escolha == 3) {
                break;  // Se a escolha for válida, sai do loop
            } else {
                Util.println("\nOpção inválida. Por favor, tente novamente.");
            }
        }

        // Retornar o plano correspondente à escolha do utilizador
        switch (escolha) {
            case 1: return PlanoSubscricao.FREE;
            case 2: return PlanoSubscricao.PREMIUM_BASE;
            case 3: return PlanoSubscricao.PREMIUM_TOP;
            default: return PlanoSubscricao.FREE; // Caso haja um erro inesperado, atribuímos o plano FREE por defeito
        }
    }

    public static void showPlaylists(List<String> playlists) {
        Util.clearScreen();
        Util.printHeader();
        Util.println("\nAs suas playlists:\n");
        for (String playlist : playlists) {
            Util.println("- " + playlist);
        }
        Util.waitInput();
    }

    public static String createPlaylist() {
        Util.clearScreen();
        Util.printHeader();
        Util.println("\nCriar nova playlist (Premium apenas)");
        String nome = Util.input("Nome da playlist: ");
        return nome;
    }

    public static void notPremium() {
        Util.println("\nApenas utilizadores Premium podem criar playlists personalizadas.");
        Util.waitInput();
    }

    public static void logout() {
        Util.clearScreen();
        Util.printHeader();
        Util.println("\nA realizar logout...");
        // A lógica de logout pode ser implementada aqui, como limpar sessão, etc.
        Util.waitInput();
    }
}
