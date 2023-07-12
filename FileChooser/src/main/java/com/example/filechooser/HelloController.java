package com.example.filechooser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class HelloController {
    @FXML
    ImageView imageView;
    @FXML
    VBox vb;

    @FXML
    protected void chooseImage(ActionEvent event) {
    Stage stage = (Stage) vb.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Image");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image file" , "*.jpeg", "*.png" , "*.jpg");
        fileChooser.getExtensionFilters().add(imageFilter);
        File file = fileChooser.showOpenDialog(stage);
        if (file != null){
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
    }
}