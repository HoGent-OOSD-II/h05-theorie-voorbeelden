package main;

import gui.VBoxLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartUp extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBoxLayout root = new VBoxLayout();
        // HBoxLayout root = new HBoxLayout();
        // FlowLayout root = new FlowLayout();
        // BorderLayout root = new BorderLayout();
        // StackLayout root = new StackLayout();
        // GridLayout root = new GridLayout();
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Example Lay-outs");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}