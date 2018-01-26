package customer.controller;

import customer.view.CustomerRootPane;
import javafx.stage.Stage;

public class CustomerController {

	private CustomerRootPane view;
	private Stage primaryStage;
	

	public CustomerController(CustomerRootPane view, Stage primaryStage) {
		//initialise model and view
		this.view = view;
		this.primaryStage = primaryStage;

		//initialise view sub-container fields for convenient access to these


		//attach event handlers to view using private helper method
		// this.attachEventHandlers();
	}
}
