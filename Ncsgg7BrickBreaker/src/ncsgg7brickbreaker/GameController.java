/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncsgg7brickbreaker;

import static ncsgg7brickbreaker.Ncsgg7BrickBreaker.stage;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import static ncsgg7brickbreaker.Ncsgg7BrickBreaker.stage;


/**
 * FXML Controller class
 *
 * @author Nathan
 */
public class GameController implements Initializable {
   
    enum SpecialValues{
        MAXBLOCKS(67),
        PADDLEHEIGHT(15),
        PADDLEWIDTH(75),
        BLOCKHEIGHT(10),
        BLOCKWIDTH(50);
        
        private int specialValue;
        SpecialValues(int specialValue){
            this.specialValue = specialValue;
        }
        
        public int getmaxBlocks()
        {
            return this.specialValue;
        }
    }
    int height;
    int width;
    
    private Stage stage;
    
    @FXML
    Label upgradeDisplay = new Label();
    
    @FXML
    AnchorPane pane;
    
    //Playrs Pattle
    @FXML
    private Rectangle paddle;
    
    //top Row
    private ArrayList<Rectangle> topRow = new ArrayList<>();
    
    
    //Middle Block
    private ArrayList<Rectangle> midBlock = new ArrayList<>();
    
    //Bottem Row
    private ArrayList<Rectangle> botRow = new ArrayList<>();
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //test rectangle
        /*Rectangle rect = new Rectangle(10,10,200,250);
        rect.setFill(Color.BLUE);
        pane.getChildren().add(rect);*/
        
        //Top Row
        for(int i = 0; i < 2; i++)
        {//Rectanlge(XPOS,YPOS,WIDTH,HEIGHT)
           Rectangle nextRec = new Rectangle(50*i + 25, 10, 50, 10); 
           nextRec.setFill(Color.CORNFLOWERBLUE);
           nextRec.setStroke(Color.BLACK);
           nextRec.setStrokeWidth(2);
           pane.getChildren().add(nextRec);
           topRow.add(nextRec);
        }
        for(int i = 0; i < 5; i++)
        {
           Rectangle nextRec = new Rectangle(50*i + 175, 10, 50, 10); 
           nextRec.setFill(Color.CORNFLOWERBLUE);
           nextRec.setStroke(Color.BLACK);
           nextRec.setStrokeWidth(2);
           pane.getChildren().add(nextRec);
           topRow.add(nextRec);
        }
        for(int i = 0; i < 2; i++)
        {
           Rectangle nextRec = new Rectangle(50*i + 475, 10, 50, 10); 
           nextRec.setFill(Color.CORNFLOWERBLUE);
           nextRec.setStroke(Color.BLACK);
           nextRec.setStrokeWidth(2);
           pane.getChildren().add(nextRec);
           topRow.add(nextRec);
        }
        
        //Middle Block
        for(int i = 0; i < 52; i++)
        {
           Rectangle nextRec = new Rectangle(50*(i%4) + 200, 10*(i/4) + 100, 50, 10); 
           nextRec.setFill(Color.CORNFLOWERBLUE);
           nextRec.setStroke(Color.BLACK);
           nextRec.setStrokeWidth(2);
           pane.getChildren().add(nextRec);
           midBlock.add(nextRec); 
        }
        
        //Bottom row
        for(int i = 0; i < 2; i++)
        {
            if(i == 0)
            {
                Rectangle nextRec = new Rectangle(0, 250, 50, 10); 
                nextRec.setFill(Color.CORNFLOWERBLUE);
                nextRec.setStroke(Color.BLACK);
                nextRec.setStrokeWidth(2);
                pane.getChildren().add(nextRec);
                botRow.add(nextRec);  
            }
            else
            {
                Rectangle nextRec = new Rectangle(550, 250, 50, 10); 
                nextRec.setFill(Color.CORNFLOWERBLUE);
                nextRec.setStroke(Color.BLACK);
                nextRec.setStrokeWidth(2);
                pane.getChildren().add(nextRec);
                botRow.add(nextRec);
            }    
        }
        for(int i = 0; i < 2; i++)
        {
            Rectangle nextRec = new Rectangle(50*i + 100, 250, 50, 10); 
            nextRec.setFill(Color.CORNFLOWERBLUE);
            nextRec.setStroke(Color.BLACK);
            nextRec.setStrokeWidth(2);
            pane.getChildren().add(nextRec);
            botRow.add(nextRec);
        }
        for(int i = 0; i < 2; i++)
        {
            Rectangle nextRec = new Rectangle(50*i + 400, 250, 50, 10); 
            nextRec.setFill(Color.CORNFLOWERBLUE);
            nextRec.setStroke(Color.BLACK);
            nextRec.setStrokeWidth(2);
            pane.getChildren().add(nextRec);
            botRow.add(nextRec);
        }
        
        //Call Play game
        //playGame(stage);
    }
    
    public void playGame(Stage stage)
    {
        this.stage = stage;
        
        this.stage.setResizable(false);
        
        stage.addEventFilter(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
            if ("RIGHT".equals(event.getCode().toString())) 
            {
              // imageView.setX(imageView.getX() + 5);
                paddle.setY(paddle.getY() + 5);
            } 
            else if ("LEFT".equals(event.getCode().toString())) 
            {
               // imageView.setX(imageView.getX() - 5);
                paddle.setY(paddle.getY() - 5);
            }
        });
    }
}
