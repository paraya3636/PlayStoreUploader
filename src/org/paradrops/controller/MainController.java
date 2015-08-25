package org.paradrops.controller;

import com.google.api.services.androidpublisher.AndroidPublisher;

import org.paradrops.googleplay.publisher.Auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    Button authButton;
    @FXML
    Button uploadButton;

    @FXML
    private void onClickAuthButton(ActionEvent event) {
        try {
            AndroidPublisher publisher = new Auth().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onClickUploadButton(ActionEvent event) {
    }
}
