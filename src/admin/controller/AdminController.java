package admin.controller;

import admin.view.AdminRootPane;
import controller.ShoppingCartController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.HomeButton;
import view.ShoppingCartRootPane;

public class AdminController {

	private Stage primaryStage;
	private HomeButton hb;
	private ShoppingCartRootPane loginScreen;
	

	public AdminController(AdminRootPane view, Stage primaryStage) {
		//initialise model and view
		this.primaryStage = primaryStage;

		//initialise view sub-container fields for convenient access to these
		hb = view.getHomeButton(); 

		//attach event handlers to view using private helper method
		this.attachEventHandlers();
	}
	
	private void attachEventHandlers() {
		hb.addHomeButtonHandler(new HomeButtonHandler());
	}
	
	//event handlers are now all inside of the controller - below are inner-class implementations
	private class HomeButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			loginScreen = new ShoppingCartRootPane();
			Scene scene1 = new Scene(loginScreen);
			new ShoppingCartController(loginScreen, primaryStage);
			primaryStage.setScene(scene1);
			primaryStage.show();
		}
	}
	
}
