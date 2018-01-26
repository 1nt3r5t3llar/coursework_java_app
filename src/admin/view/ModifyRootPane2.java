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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ModifyRootPane2 extends Application {
	 	 
	@Override
	public void start(Stage stage) {
	 
	        GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setHgap(10);
	        grid.setVgap(10);
	        grid.setPadding(new Insets(25, 25, 25, 25));
			grid.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null )));
	        
			Label lb = new Label("Modify Database");
			lb.setFont(Font.font("Calibri", 36));
			lb.setTextFill(Color.WHITE);
			
			HBox box1 = new HBox();
			box1.getChildren().add(lb);
			box1.setSpacing(10);
			box1.setPadding(new Insets(30,10,20,10));
			box1.setAlignment(Pos.CENTER);
			
			TitledPane firstTitledPane = new TitledPane();
			GridPane firstGrid = new GridPane();
			firstGrid.setVgap(4);
			firstGrid.setPadding(new Insets(5, 5, 5, 5));
			firstGrid.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null )));
//			grid.add(new Label("First Name: "), 0, 0);
//			grid.add(new TextField(), 1, 0);
//			grid.add(new Label("Last Name: "), 0, 1);
//			grid.add(new TextField(), 1, 1);
//			grid.add(new Label("Email: "), 0, 2);
//			grid.add(new TextField(), 1, 2);        
			firstTitledPane.setText("Add");
			firstTitledPane.setContent(firstGrid);
			
			TitledPane secondTitledPane = new TitledPane();
			GridPane secondGrid = new GridPane();
			secondGrid.setVgap(4);
			secondGrid.setPadding(new Insets(5, 5, 5, 5));
			secondGrid.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null )));
//			grid.add(new Label("First Name: "), 0, 0);
//			grid.add(new TextField(), 1, 0);
//			grid.add(new Label("Last Name: "), 0, 1);
//			grid.add(new TextField(), 1, 1);
//			grid.add(new Label("Email: "), 0, 2);
//			grid.add(new TextField(), 1, 2);        
			secondTitledPane.setText("Edit");
			secondTitledPane.setContent(secondGrid);

			TitledPane thirdTitledPane = new TitledPane();
			GridPane thirdGrid = new GridPane();
			thirdGrid.setVgap(4);
			thirdGrid.setPadding(new Insets(5, 5, 5, 5));
			thirdGrid.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null )));
//			grid.add(new Label("First Name: "), 0, 0);
//			grid.add(new TextField(), 1, 0);
//			grid.add(new Label("Last Name: "), 0, 1);
//			grid.add(new TextField(), 1, 1);
//			grid.add(new Label("Email: "), 0, 2);
//			grid.add(new TextField(), 1, 2);        
			thirdTitledPane.setText("Remove");
			thirdTitledPane.setContent(thirdGrid);
			
	    
	      Accordion root= new Accordion();      
	      root.getPanes().addAll(firstTitledPane, secondTitledPane, thirdTitledPane);
	      root.setPrefHeight(200);
	      
	    
	      Scene scene = new Scene(root, 1000, 500);
	      stage.setTitle("Modify");
	      stage.setScene(scene);
	      stage.show();
	  }
	 
	  public static void main(String[] args) {
	      Application.launch(args);
	  }
	 
}
