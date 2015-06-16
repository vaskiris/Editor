/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package editor;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
 import javafx.scene.image.Image;
import javafx.stage.FileChooser;



/**
 *
 * @author VascoCC
 */
public class EditorFXMLController implements Initializable {
    
    
    @FXML
    private ImageView ImageDisplay;
    @FXML
    private Button openPhoto;
    
    private String imagePath;
    public static Stage prompt = new Stage();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters();
        File selectedDirectory = fileChooser.showOpenDialog(prompt);
        String imagePath = selectedDirectory.getAbsolutePath();
        
        try {
            //imagePath = selectedDirectory.getAbsolutePath() + "\\";
            //folder.setText(pathS);
            System.out.println(imagePath);
            Image image = new Image("file:" + imagePath);
      
            ImageDisplay.setImage(image);
            } 
        catch (Exception e) {
            System.err.println(e.toString());
            }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
