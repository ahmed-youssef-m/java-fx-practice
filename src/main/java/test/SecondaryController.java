package test;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        // Main.setRoot("primary");
        FXMLLoader fxmlLoader2=new FXMLLoader(Main.class.getResource("primary.fxml"));
        Parent parent2=fxmlLoader2.load();
        Scene scene2=new Scene(parent2,500,500);
        Main.fin.setScene(scene2);
    }
}