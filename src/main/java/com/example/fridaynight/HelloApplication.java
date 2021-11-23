package com.example.fridaynight;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene-1-view.fxml"));
        Parent root = loader.load();
        SceneController controller = loader.getController();
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch(event.getCode()) {
                    case W:
                        controller.up();
                        break;
                    case S:
                        controller.down();
                        break;
                    case D:
                        controller.right();
                        break;
                    case A:
                        controller.left();
                        break;
                    default:
                        break;
                }
            }
        });

        stage.setFullScreen(true);
        stage.setTitle("Grid Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}