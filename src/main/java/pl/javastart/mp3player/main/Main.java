package pl.javastart.mp3player.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane anchorPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        System.out.println("Start");
        stage.setTitle("Hello FX!");
        stage.show();
    }



    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}