package controller;

import view.LoginPane;
import view.ShoppingCartRootPane;
import admin.controller.AdminController;
import admin.view.AdminRootPane;
import admin.view.ModifyRootPane;
import customer.controller.CustomerController;
import customer.view.CustomerRootPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ShoppingCartController {
	
//	private ShoppingCartRootPane view;
	private LoginPane lp;
	private Stage primaryStage;
	private AdminRootPane adminScreen;
	private ModifyRootPane modScreen;
	private CustomerRootPane customerScreen;


	public ShoppingCartController(ShoppingCartRootPane view, Stage primaryStage) {
		//initialise model and view
		//this.view = view;
		this.primaryStage = primaryStage;

		//initialise view sub-container fields for convenient access to these
		lp = view.getLoginPane(); 

		//attach event handlers to view using private helper method
		this.attachEventHandlers();
	}
	
	private void attachEventHandlers() {
		lp.addAdministratorHandler(new AdministratorHandler());
		lp.addCustomerHandler(new CustomerHandler());
	}
	
	//event handlers are now all inside of the controller - below are inner-class implementations
	private class AdministratorHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			adminScreen = new AdminRootPane();
			modScreen = new ModifyRootPane();
			Scene scene2 = new Scene(adminScreen);
			new AdminController(adminScreen, modScreen, primaryStage);
			primaryStage.setScene(scene2);
			primaryStage.show();
		}
	}
	
	private class CustomerHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			customerScreen = new CustomerRootPane();
			Scene scene3 = new Scene(customerScreen);
			new CustomerController(customerScreen, primaryStage);
			primaryStage.setScene(scene3);
			primaryStage.show();
		}
	}
	

}
