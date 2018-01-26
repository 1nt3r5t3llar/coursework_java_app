package admin.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ModifyRootPane extends Application {
	 	 
	@Override
	public void start(Stage stage) {
	 
	        GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setHgap(10);
	        grid.setVgap(10);
	        grid.setPadding(new Insets(25, 25, 25, 25));
			grid.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null )));
	        
			
	      // Create First TitledPane.
	      TitledPane firstTitledPane = new TitledPane();
	      firstTitledPane.setText("Add");
	 
	      VBox content1 = new VBox();
	      content1.getChildren().add(new Label(""));

	 
	      firstTitledPane.setContent(content1);
	 
	      // Create Second TitledPane.
	      TitledPane secondTitledPane = new TitledPane();
	      secondTitledPane.setText("Edit");
	 
	      VBox content2 = new VBox();
	      content2.getChildren().add(new Label(""));

	      secondTitledPane.setContent(content2);
	 
	      // Create Second TitledPane.
	      TitledPane thirdTitledPane = new TitledPane();
	      thirdTitledPane.setText("Remove");
	      
	      VBox content3 = new VBox();
	      content3.getChildren().add(new Label(""));

	      secondTitledPane.setContent(content3);
	    
	      Accordion root= new Accordion();      
	      root.getPanes().addAll(firstTitledPane, secondTitledPane, thirdTitledPane);
	      root.setPrefHeight(200);
	    
	      Scene scene = new Scene(grid, 300, 200);
	      stage.setTitle("Modify");
	      stage.setScene(scene);
	      stage.show();
	  }
	 
	  public static void main(String[] args) {
	      Application.launch(args);
	  }
	 
}
