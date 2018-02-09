package admin.controller;

import admin.view.AdminRootPane;
import admin.view.ModifyPane;
import admin.view.ModifyRootPane;
import admin.view.PromotionsPane;
import admin.view.PromotionsRootPane;
import admin.view.RewardsPane;
import admin.view.RewardsRootPane;
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
	private ModifyPane mp;
	private PromotionsPane pp;
	private RewardsPane rp;
	private ShoppingCartRootPane loginScreen;
	private ModifyRootPane modifyScreen;
	private PromotionsRootPane promotionsScreen;
	private RewardsRootPane rewardsScreen;
	

	public AdminController(AdminRootPane view, Stage primaryStage) {
		//initialise model and view
		this.primaryStage = primaryStage;

		//initialise view sub-container fields for convenient access to these
		hb = view.getHomeButton(); 
		mp = view.getModifyPane();
		pp = view.getPromotionsPane();
		rp = view.getRewardsPane();

		//attach event handlers to view using private helper method
		this.attachEventHandlers();
	}
	
	private void attachEventHandlers() {
		hb.addHomeButtonHandler(new HomeButtonHandler());
		mp.addModifyButtonHandler(new ModifyButtonHandler() );
		pp.addPromotionsButtonHandler(new PromotionsButtonHandler() );
		rp.addRewardsButtonHandler(new RewardsButtonHandler() );
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
	
	private class ModifyButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			modifyScreen = new ModifyRootPane();
			Scene scene4 = new Scene(modifyScreen);
			primaryStage.setScene(scene4);
			primaryStage.show();
		}
	}
	
	private class PromotionsButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			promotionsScreen = new PromotionsRootPane();
			Scene scene5 = new Scene(promotionsScreen);
			primaryStage.setScene(scene5);
			primaryStage.show();
		}
	}
	
	private class RewardsButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			rewardsScreen = new RewardsRootPane();
			Scene scene6 = new Scene(rewardsScreen);
			primaryStage.setScene(scene6);
			primaryStage.show();
		}
	}
	
}
