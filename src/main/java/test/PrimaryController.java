package test;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
// import javafx.stage.Stage;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        // System.out.println(textfield.getText());
        // fun();
        // if (textField.getText().equals(rone)) {
        //     FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("secondary.fxml"));
        //     Parent parent2 = fxmlLoader2.load();
        //     Scene scene2 = new Scene(parent2, 500, 500);
        //     Main.fin.setScene(scene2);
        // } else {
        //     FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("test.fxml"));
        //     Parent parent2 = fxmlLoader2.load();
        //     Scene scene2 = new Scene(parent2, 300, 300);
        //     Stage stage=new Stage();
        //     stage.setScene(scene2);
        //     stage.show();
        // }
        FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("secondary.fxml"));
        Parent parent2 = fxmlLoader2.load();
        Scene scene2 = new Scene(parent2, 500, 500);
        Main.fin.setScene(scene2);
        // Main.fin.show();
        // Stage stage2=new Stage();
        // stage2.setScene(scene2);
        // stage2.show();
        // Main.scene1.setRoot(parent2);
    
    }

    @FXML
    TextField textField;
    @FXML
    PasswordField passwordField;

    InnerPrimaryController init=new InnerPrimaryController();
    InnerPrimaryController in1=new InnerPrimaryController();
    InnerPrimaryController in2=new InnerPrimaryController();
    InnerPrimaryController in3=new InnerPrimaryController();

    int v=1;

    @FXML
    private void signup()throws IOException{
          
        if (v==1) {
            in1.username=textField.getText();
            in1.password=passwordField.getText();  
            v=2;
            
        }
       else if (v==2) {
            in2.username=textField.getText();
            in2.password=passwordField.getText();
       }
       else{

            FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("test.fxml"));
            Parent parent2 = fxmlLoader2.load();
            Scene scene2 = new Scene(parent2, 300, 300);
            Stage stage=new Stage();
            stage.setScene(scene2);
            stage.show();
       }
    }

    @FXML
    private void signin()throws IOException{
        if (textField.getText().equals(init.username)||textField.getText().equals(in1.username)||textField.getText().equals(in2.username)) {
            if (passwordField.getText().equals(init.password)||passwordField.getText().equals(in1.password)||passwordField.getText().equals(in2.password)) {
                FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("secondary.fxml"));
                Parent parent2 = fxmlLoader2.load();
                Scene scene2 = new Scene(parent2, 500, 500);
                Main.fin.setScene(scene2);
            }
            else{
            FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("test.fxml"));
            Parent parent2 = fxmlLoader2.load();
            Scene scene2 = new Scene(parent2, 300, 300);
            Stage stage=new Stage();
            stage.setScene(scene2);
            stage.show();
            }
        }
        else{
            FXMLLoader fxmlLoader2 = new FXMLLoader(Main.class.getResource("test.fxml"));
            Parent parent2 = fxmlLoader2.load();
            Scene scene2 = new Scene(parent2, 300, 300);
            Stage stage=new Stage();
            stage.setScene(scene2);
            stage.show();
        }
    }
  
}
/**
 * InnerPrimaryController
 */
 class InnerPrimaryController {
     String username="Ahmed";
     String password="123456";
}