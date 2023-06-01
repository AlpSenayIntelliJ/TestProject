package com.example.testproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Scene GameScene;
    private Pane p;
    String name;

    @Override
    public void start(Stage stage) throws IOException {

        // creating scene and allowing it to be resizable
        Group root = new Group();
        Scene scene = new Scene(root);

        stage.setTitle("Oregon Trail");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();



        /*
        VBox box = new VBox();
        TextField nameInput= new TextField("Enter Name");
        Button start2 = new Button("Start");
        box.getChildren().addAll(nameInput, start2);
        int w = 1000;
        int l = 500;
        Scene startS = new Scene(box, w, l);

        start2.setOnAction( e -> {
            stage.setScene(GameScene);
            name= nameInput.getText();
        });

        p= new Pane();
        stage.setTitle("Oregon Trail");

        Button start= new Button("Tell me More Information");
        start.setMaxWidth(200);

        start.setLayoutX(50);
        start.setLayoutY(100);

        Label string= new Label("I like turtles");
        string.setMaxWidth(200);
        string.setMaxHeight(200);

        string.setLayoutX(300);
        string.setLayoutY(300);

        start.setOnAction(e->{
            string.setText("yoyo");
            p.getChildren().add(string);
        });

        p.getChildren().addAll(start, string);
        GameScene= new Scene(p, w, l);



        stage.setScene(startS);
        stage.show();

         */
    }

    public static void main(String[] args) {
        launch();
    }
}