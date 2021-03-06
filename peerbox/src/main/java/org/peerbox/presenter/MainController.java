package org.peerbox.presenter;

import org.peerbox.interfaces.INavigatable;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController implements INavigatable {

	@FXML
	private Pane mainPane;

	/* (non-Javadoc)
	 * @see org.peerbox.presenter.INavigatable#setContent(javafx.scene.Node)
	 */
	@Override
	public void setContent(Node content) {
		mainPane.getChildren().clear();
		mainPane.getChildren().add(content);
		mainPane.requestLayout();
	}
	
	public void closeApp(ActionEvent event){
		System.out.println("Application closed.");
		Platform.exit();
        System.exit(0);
	}
	
	public void minApp(ActionEvent event){
		System.out.println("Application minimized.");
		Stage stage = (Stage) mainPane.getScene().getWindow();
		stage.setIconified(true);
	}
}
