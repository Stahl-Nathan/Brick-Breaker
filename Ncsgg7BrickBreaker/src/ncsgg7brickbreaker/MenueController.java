/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncsgg7brickbreaker;

import static ncsgg7brickbreaker.Ncsgg7BrickBreaker.stage;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;

/**
 *
 * @author Nathan
 */
public class MenueController implements Initializable {
    
    @FXML
    private Label title;
    
    //Parent gameRoot = new Parent();
    
    @FXML
    private void handlePlayAction(ActionEvent event) {
        try {
            /*Parent gameRoot = FXMLLoader.load(getClass().getResource("Game.fxml"));
            Scene gameScene = new Scene(gameRoot);

            stage.setScene(gameScene);
            stage.show();*/
            
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        Parent root = (Parent)loader.load();
        GameController controller = (GameController)loader.getController();
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        controller.playGame(stage);
            
            
        } catch(Exception ex) {
            System.out.println("Could not load game scene.");
        }
    }
    @FXML
    private void handleHighScoreAction(ActionEvent event)
    {
        System.out.println("You clicked High Score!");
    }
    @FXML
    private void handleAboutAction(ActionEvent event)
    {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("About");
        info.setHeaderText("Brick Breaker");
        info.setContentText("This is the University of Missouri CS3330 final project created by Nathan Stahl");
        info.showAndWait();
    }
    @FXML
    private void handleExitAction(ActionEvent event)
    {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
