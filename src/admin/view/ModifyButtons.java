package admin.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ModifyButtons extends VBox {

	private Button open;

	
	public ModifyButtons() {
	
		open = new Button("Open");
		open.setPrefSize(100, 50);
    
		HBox box1 = new HBox();
		box1.getChildren().add(open);
		box1.setSpacing(10);
		box1.setPadding(new Insets(10,20,10,10));
		box1.setAlignment(Pos.CENTER);
	
		HBox container = new HBox();
		container.getChildren().addAll(box1);
		container.setSpacing(20);
		container.setPadding(new Insets(10, 20, 10, 20));
		container.setPrefHeight(100);
		
		this.getChildren().addAll(container);
	}
	
	public void addOpenButtonHandler(EventHandler<ActionEvent> handler) {
		System.out.println("I,m handler");
		open.setOnAction(handler);
	}
	
}
