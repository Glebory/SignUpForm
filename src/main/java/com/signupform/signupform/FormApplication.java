package com.signupform.signupform;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class FormApplication extends Application {
    @Override
    public void start(Stage stage){
        GridPane gridPane = createFormPane();
        formController(gridPane);
        Scene scene = new Scene(gridPane, 640, 320);

        stage.setTitle("Shady sign up >:^)");
        stage.setScene(scene);
        stage.show();
    }
    private GridPane createFormPane(){
        GridPane gridPane = new GridPane();

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setPadding(new Insets(40,40,40,40));

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        ColumnConstraints columnTwoConstrains = new ColumnConstraints(150,150, Double.MAX_VALUE/2);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }
    public void formController(GridPane gridPane){

    Label headerLabel = new Label("Sign up for free money");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

        Label emailLabel = new Label("Email: ");
        gridPane.add(emailLabel, 0, 2);
        TextField emailField = new TextField();
        emailField.setPrefHeight(20);
        gridPane.add(emailField, 1, 2);

        Label passwordLabel = new Label("Password: ");
        gridPane.add(passwordLabel, 0, 3);
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(20);
        gridPane.add(passwordField, 1, 3);

        Button submitButton = new Button("Free Ca$h prizes");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 4, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0, 20, 0));
    }

    public static void main(String[] args) {
        launch();
    }
}