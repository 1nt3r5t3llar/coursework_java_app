package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class LoginPane extends VBox {

	private Button administrator, customer;
	private Label login;
	
	public LoginPane() {
		  
		this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(100), new BorderWidths(2), new Insets(0,40,0,40))));
		this.setBackground(new Background(new BackgroundFill(Color.web("#DFDFDF"), new CornerRadii(100), new Insets(0,40,0,40) )));
		
		//Setup Login Label
		
		login = new Label("Login");
		login.setFont(Font.font("Abadi", FontWeight.NORMAL, 30));
		login.setTextFill(Color.BLACK);
		
		HBox lbbox = new HBox();
		lbbox.getChildren().add(login);
		lbbox.setSpacing(10);
		lbbox.setPadding(new Insets(30,5,10,5));
		lbbox.setAlignment(Pos.CENTER);
		
		//Setup Administrator Button
		
		administrator = new Button("Administrator");
		administrator.setPrefSize(100, 100);
		administrator.setStyle("-fx-focus-color:transparent; -fx-base: #415D78;");
		administrator.setTextFill(Color.web("#EBF6FF"));
        
		HBox box1 = new HBox();
		box1.getChildren().add(administrator);
		box1.setPadding(new Insets(10));
		box1.setAlignment(Pos.CENTER);
		
		//Setup Customer Button
		
        customer = new Button("Customer");
        customer.setPrefSize(100, 100);
        customer.setStyle("-fx-focus-color:transparent; -fx-base: #284F1D;");
        customer.setTextFill(Color.web("#D0FFBC"));
		
		HBox box2 = new HBox();
		box2.getChildren().add(customer);
	    box2.setPadding(new Insets(10));
		box2.setAlignment(Pos.CENTER);
		
		//Create Container for all Elements
        
		HBox container = new HBox();
		container.getChildren().addAll(box1, box2);
		container.setSpacing(20);
		container.setPadding(new Insets(10,5,30,5));
		container.setAlignment(Pos.CENTER);
		
		this.getChildren().addAll(lbbox, container);
    }
	
	//These methods allow handlers to be externally attached to this view by the controller
	
	public void addAdministratorHandler(EventHandler<ActionEvent> handler) {
		administrator.setOnAction(handler);
	}
	
	public void addCustomerHandler(EventHandler<ActionEvent> handler) {
		customer.setOnAction(handler);
	}
}
