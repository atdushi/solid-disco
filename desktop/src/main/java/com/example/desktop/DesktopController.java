package com.example.desktop;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import org.example.model.Position;
import org.example.services.InvestService;

public class DesktopController {
    @FXML
    private Label welcomeText;

    @FXML
    private TableView portfolioView;

    @FXML
    protected void onHelloButtonClick() {
        ObservableList<Position> allPositions = FXCollections.observableArrayList(InvestService.getPortfolio());
        welcomeText.setText("Welcome to JavaFX Application!");
        portfolioView.setItems(allPositions);
    }
}