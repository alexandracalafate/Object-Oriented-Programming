package controller;


import module.user.UserListings;
import view.SerializationView;

public class FicheiroController {

    public static void save() {
        String folderName = SerializationView.save();

        UserListings.getInstance().saveUsers(folderName);

        SerializationView.saved();

    }

    public static void load() {
        String folderName = SerializationView.load();

        UserListings.getInstance().loadUsers(folderName);

        SerializationView.loaded();

    }
}