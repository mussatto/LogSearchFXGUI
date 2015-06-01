package com.curupira;

import griffon.core.artifact.GriffonView;
import griffon.metadata.ArtifactProviderFor;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.codehaus.griffon.runtime.javafx.artifact.AbstractJavaFXGriffonView;

import java.awt.*;
import java.util.Collections;

@ArtifactProviderFor(GriffonView.class)
public class LogSearchFXGUIView extends AbstractJavaFXGriffonView {
    private LogSearchFXGUIController controller;
    private LogSearchFXGUIModel model;

    //@FXML
    //private Label clickLabel;

    @FXML
    private TextField searchQuery;

    @FXML
    private TextArea logResult;

    public void setController(LogSearchFXGUIController controller) {
        this.controller = controller;
    }

    public void setModel(LogSearchFXGUIModel model) {
        this.model = model;
    }

    @Override
    public void initUI() {
        Stage stage = (Stage) getApplication()
            .createApplicationContainer(Collections.<String,Object>emptyMap());
        stage.setTitle(getApplication().getConfiguration().getAsString("application.title"));
        stage.setScene(init());
        stage.sizeToScene();
        getApplication().getWindowManager().attach("mainWindow", stage);
    }

    // build the UI
    private Scene init() {
        Scene scene = new Scene(new Group());
        scene.setFill(Color.WHITE);

        Node node = loadFromFXML();
        //model.clickCountProperty().bindBidirectional(clickLabel.textProperty());
        //model.searchQueryProperty().bindBidirectional(searchQuery.textProperty());
        //model.searchResultProperty().bindBidirectional(logResult.textProperty());
        ((Group) scene.getRoot()).getChildren().addAll(node);
        connectActions(node, controller);

        return scene;
    }
}
