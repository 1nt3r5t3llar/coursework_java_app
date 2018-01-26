package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HomeButton extends VBox {

	private Button home;
	
	public HomeButton() {
		
        home = new Button("Home");
        home.setPrefSize(100, 50);
        
		HBox box1 = new HBox();
		box1.getChildren().add(home);
		box1.setSpacing(10);
		box1.setPadding(new Insets(10,20,10,10));
		box1.setAlignment(Pos.CENTER);
        
		this.getChildren().add(home);

	}

	//These methods allow handlers to be externally attached to this view by the controller
	
	public void addHomeButtonHandler(EventHandler<ActionEvent> handler) {
		home.setOnAction(handler);
	}
}
