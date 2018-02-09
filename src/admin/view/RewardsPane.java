package admin.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RewardsPane extends VBox {

	private Label rewardsLabel;
	private Button rewards;
	
	public RewardsPane() {
		this.setStyle("-fx-background-color: #EBF6FF;");
		this.setBorder(new Border(new BorderStroke(Color.web("#000000"), BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
	
        rewards = new Button("Rewards");
        rewards.setPrefSize(100, 50);
        
        rewardsLabel = new Label("The rewards option will allow you to impelement reward points on different items within the Shopping Cart database.");
        rewardsLabel.setFont(Font.font("Calibri", 12));
        rewardsLabel.setTextFill(Color.DARKBLUE);
        rewardsLabel.setPrefWidth(250);
        rewardsLabel.setWrapText(true);
        
		//use a combination of horizontal and vertical boxes
		//with spacing and padding to create a uniform layout
		HBox box1 = new HBox();
		box1.getChildren().add(rewards);
		box1.setSpacing(10);
		box1.setPadding(new Insets(10,20,10,10));
		box1.setAlignment(Pos.CENTER);
		
		HBox box2 = new HBox();
		box2.getChildren().add(rewardsLabel);
		box2.setSpacing(10);
	    box2.setPadding(new Insets(0,10,0,20));
		box2.setAlignment(Pos.CENTER);
		
		HBox container = new HBox();
		container.getChildren().addAll(box1, box2);
		container.setSpacing(20);
		container.setPadding(new Insets(10, 20, 10, 20));
		container.setPrefHeight(100);

		
		this.getChildren().addAll(container);
		
	}
	
	public void addRewardsButtonHandler(EventHandler<ActionEvent> handler) {
		rewards.setOnAction(handler);
	}
	
}
