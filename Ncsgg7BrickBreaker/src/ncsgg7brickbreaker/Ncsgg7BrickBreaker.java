/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncsgg7brickbreaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Nathan
 */
public class Ncsgg7BrickBreaker extends Application {
    
    public static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("Menue.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
