package customer.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import view.HomeButton;

public class CustomerRootPane extends VBox{
	
	private NewCartPane ncp;
	private LoadCartPane lcp; 
	private HomeButton hb;
	
	//private AdminMenuBar menuBar;

	public CustomerRootPane() {
		
		this.setStyle("-fx-background-color: #284F1D;");
		this.setPrefSize(1000, 500);
		
		ncp = new NewCartPane();
		lcp = new LoadCartPane();
		hb = new HomeButton();
		
	//	menuBar = new AdminMenuBar();
		
		Label lb = new Label("Customer Home Page");
		lb.setFont(Font.font("Calibri", 36));
		lb.setTextFill(Color.WHITE);
		
		HBox box1 = new HBox();
		box1.getChildren().add(lb);
		box1.setSpacing(10);
		box1.setPadding(new Insets(30,10,20,10));
		box1.setAlignment(Pos.CENTER);

		VBox rootContainer = new VBox(ncp, lcp);
		//set styling for main container
		rootContainer.setPadding(new Insets(10,260,10,260));
		rootContainer.setSpacing(20);

		//add the menu bar and root container
		this.getChildren().addAll(box1, rootContainer);
	}
	
	/* These methods provide a public interface for the root pane and allow
	 * each of the sub-containers to be accessed by the controller.
	 */
	
	public NewCartPane getNewCartPane() {
		return ncp;
	}

	public LoadCartPane getLoadCartPane() {
		return lcp;
	}
	
	public HomeButton getHomeButton() {
		return hb;
	}

	//public AdminMenuBar getMenuBar() {
		//return menuBar;
	//}
	
}