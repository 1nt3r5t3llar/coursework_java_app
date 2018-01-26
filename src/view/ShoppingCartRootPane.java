package view;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;


public class ShoppingCartRootPane extends VBox {
	
	private LoginPane lp;
	//private AdminMenuBar menuBar;

	public ShoppingCartRootPane() {
		
		this.setStyle("-fx-background-color: #545454;");
		this.setPrefSize(1000, 500);
		
		lp = new LoginPane();
		//	menuBar = new AdminMenuBar();
		
		VBox rootContainer = new VBox(lp);
		//set styling for main container
		rootContainer.setPadding(new Insets(100,10,100,10));
		rootContainer.setSpacing(20);
		
		//add the menu bar and root container
		this.getChildren().add(rootContainer);
	}
	
	
	/* These methods provide a public interface for the root pane and allow
	 * each of the sub-containers to be accessed by the controller.
	 */
	
	public LoginPane getLoginPane() {
		return lp;
	}

	//public AdminMenuBar getMenuBar() {
		//return menuBar;
	//}
}
