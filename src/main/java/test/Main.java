package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// import java.io.IOException;
// 
/**
 * JavaFX App
 */
public class Main extends Application {

    // private static Scene scene;

    // @Override
    // public void start(Stage stage) throws IOException {
    //     scene = new Scene(loadFXML("primary"), 640, 480);
    //     stage.setScene(scene);
    //     stage.show();
    // }

    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }
    InnerPrimaryController init=new InnerPrimaryController();
    InnerPrimaryController in1=new InnerPrimaryController();
    InnerPrimaryController in2=new InnerPrimaryController();
    InnerPrimaryController in3=new InnerPrimaryController();

    int v=1;
    static Scene scene1;
    static Stage fin;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("search.fxml"));
        Parent parent=fxmlLoader.load();
        scene1=new Scene(parent,500,500);
        stage.setScene(scene1);
        stage.show();
        fin=stage;
    
    }
    public static void main(String[] args) {
        
   
        launch();
    }

}