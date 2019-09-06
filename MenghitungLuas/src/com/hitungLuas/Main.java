// made by Nicolavickh Yohanes 1772016

package com.hitungLuas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HitungLuas.fxml"));
        primaryStage.setTitle("Hitung Luas");
        primaryStage.setScene(new Scene(root, 425, 188));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
