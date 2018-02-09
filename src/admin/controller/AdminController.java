package admin.controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import admin.view.AdminRootPane;
import admin.view.ModifyButtons;
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
import model.Product;
import model.StockListProcessor;
import view.HomeButton;
import view.ShoppingCartRootPane;

public class AdminController {

	private Stage primaryStage;
	private HomeButton hb;
	private ModifyPane mp;
	private ModifyButtons mb;
	private PromotionsPane pp;
	private RewardsPane rp;
	private ShoppingCartRootPane loginScreen;
	private AdminRootPane adminScreen;
	private ModifyRootPane modScreen;
	private PromotionsRootPane promotionsScreen;
	private RewardsRootPane rewardsScreen;
	private ModifyRootPane view2;
	

	public AdminController(AdminRootPane view, ModifyRootPane view2, Stage primaryStage) {
		//initialise model and view
		this.primaryStage = primaryStage;
		this.view2 = view2;
		
		
		//initialise view sub-container fields for convenient access to these
		hb = view.getHomeButton(); 
		mp = view.getModifyPane();
		pp = view.getPromotionsPane();
		rp = view.getRewardsPane();
		mb = view2.getModifyButtons();

		//attach event handlers to view using private helper method
		this.attachEventHandlers();
	}
	
	private void attachEventHandlers() {
		hb.addHomeButtonHandler(new HomeButtonHandler());
		mp.addModifyButtonHandler(new ModifyButtonHandler());
		pp.addPromotionsButtonHandler(new PromotionsButtonHandler());
		rp.addRewardsButtonHandler(new RewardsButtonHandler());
		mb.addOpenButtonHandler(new OpenButtonHandler());
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
			modScreen = new ModifyRootPane();
			adminScreen = new AdminRootPane();
			new AdminController(adminScreen, modScreen, primaryStage);
			Scene scene4 = new Scene(modScreen);
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
	
	private class OpenButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			System.out.println("YAYAYAYAYAYAY");
			StockListProcessor scan = new StockListProcessor();
			try {
				scan.StockListScanner();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ArrayList<Product> stock = scan.getStock();	
			
			for (int i=0; i<stock.size();i++) {
				System.out.println(stock.get(i));
				
			view2.textArea.appendText(stock.get(i).toString()+"\n");
			
			}
		}
	}
}
