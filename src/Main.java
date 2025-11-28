
import controller.MenuController;
import module.SpotifUM;

import java.io.Serializable;
import module.Teste;


public class Main implements Serializable {
    public static void main(String[] args) {
        Teste.carregarDadosTeste();
        MenuController.menu();
    }
}
