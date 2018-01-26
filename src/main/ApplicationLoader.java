package main;

import controller.ShoppingCartController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.ShoppingCartRootPane;


public class ApplicationLoader extends Application {

	private ShoppingCartRootPane loginScreen;
	
	
	public void init() {
		loginScreen = new ShoppingCartRootPane();
	}	
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Shopping Cart");
		Scene scene1 = new Scene (loginScreen);
		new ShoppingCartController(loginScreen, primaryStage);
		primaryStage.sizeToScene();
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

		public static void main(String[] args) {
		launch(args);
	}
}
