package com.example.testproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Scene startS, GameScene;
    private Pane p;
    String name;

    private int w= 500, l=500;
    @Override
    public void start(Stage stage) throws IOException {
        VBox blob= new VBox();
        TextField nameInput= new TextField("Enter Name");
        Button start2= new Button("Start");
        blob.getChildren().addAll(nameInput, start2);
        startS= new Scene(blob, w, l);

        start2.setOnAction( e -> {
            stage.setScene(GameScene);
            name= nameInput.getText();
        });

        p= new Pane();
        stage.setTitle("Oregon Trail!");

        Button start= new Button("Tell me More Information");
        start.setMaxWidth(200);

        start.setLayoutX(50);
        start.setLayoutY(50);

        Label string= new Label("I like turtles");
        string.setMaxWidth(200);
        string.setMaxHeight(200);

        string.setLayoutX(300);
        string.setLayoutY(300);

        start.setOnAction(e->{
            string.setText("You have complteted the thingyYou have complteted the thingy\nYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingyYou have complteted the thingy");
            p.getChildren().add(string);
        });

        p.getChildren().addAll(start, string);
        GameScene= new Scene(p, w, l);



        stage.setScene(startS);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}