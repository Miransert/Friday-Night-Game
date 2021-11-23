package com.example.fridaynight;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    @FXML
    private Circle myCircle;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void scene1(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene-1-view.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void scene2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene-2-view.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void up() {
        try {
            GridPane.setRowIndex(myCircle, GridPane.getRowIndex(myCircle) - 1);
        }
        catch(IllegalArgumentException ignored) {}
    }

    public void down() {
        try {
            GridPane.setRowIndex(myCircle, GridPane.getRowIndex(myCircle)+1);
        }
        catch (IllegalArgumentException ignored) {}

    }

    public void right() {
        try {
            GridPane.setColumnIndex(myCircle, GridPane.getColumnIndex(myCircle)+1);
        }
        catch (IllegalArgumentException ignored) {}
    }

    public void left() {
        try {
            GridPane.setColumnIndex(myCircle, GridPane.getColumnIndex(myCircle)-1);
        }
        catch (IllegalArgumentException ignored) {}
    }
}