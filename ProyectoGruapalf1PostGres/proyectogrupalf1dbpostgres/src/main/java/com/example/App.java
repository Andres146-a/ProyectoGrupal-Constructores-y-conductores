package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.view.DriverResultsWindow;
import com.example.view.ConstructorResultsWindow;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Resultados: Conductores y Constructores");

        // Añadir el icono a la ventana
        Image icon = new Image(getClass().getResourceAsStream("/imagen/OIG4.jpeg"));
        primaryStage.getIcons().add(icon);

        Button driverButton = new Button("Ver Resultados de Conductores");
        driverButton.setOnAction(e -> new DriverResultsWindow().show());
        driverButton.getStyleClass().add("button-left");

        Button constructorButton = new Button("Ver Resultados de Constructores");
        constructorButton.setOnAction(e -> new ConstructorResultsWindow().show());
        constructorButton.getStyleClass().add("button-right");

        HBox hbox = new HBox(20); // Espaciado de 20px entre botones
        hbox.getChildren().addAll(driverButton, constructorButton);
        hbox.setAlignment(Pos.CENTER); // Centra los botones horizontalmente
        hbox.getStyleClass().add("hbox");

        VBox vbox = new VBox(hbox);
        vbox.getStyleClass().add("vbox");

        Scene scene = new Scene(vbox, 500, 200);
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
