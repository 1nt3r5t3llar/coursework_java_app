package admin.view;


import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class ModifyRootPane extends VBox {
	
	private ModifyButtons mb;
	public TextArea textArea;
	
	public ModifyRootPane() {
	 
		this.setStyle("-fx-background-color: #415D78;");
		this.setPrefSize(1000, 500);

		mb = new ModifyButtons();
		
		textArea = new TextArea ();
		HBox hb = new HBox();
		hb.getChildren().add(textArea);
		hb.setSpacing(10);
		textArea.setPrefHeight(100);
		textArea.setPrefWidth(200);
		this.getChildren().add(textArea);
		
		VBox rootContainer = new VBox(mb);
		//set styling for main container
		rootContainer.setPadding(new Insets(10,10,10,10));
		rootContainer.setSpacing(20);
		
		this.getChildren().addAll(rootContainer);
	

	}
	
	public ModifyButtons getModifyButtons() {
		System.out.println("helllo there");
		return mb;
	}

	

	 
}
