package com.temperatureconverter;

//************************************************************************
// FahrenheitConverter.java Author: Lewis/Loftus
//
// Book Title: Java Software Solutions
// Foundations of Program Design
// 9th Edition
//************************************************************************

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FahrenheitConverter extends Application {
    
    //--------------------------------------------------------------------
    // Launches the temperature converter application.
    //--------------------------------------------------------------------

    @Override
    public void start(Stage primaryStage) throws Exception{
    Scene scene = new Scene(new FahrenheitPane(), 300, 150);
    primaryStage.setTitle("Fahrenheit Converter");
    primaryStage.setScene(scene);
    primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}