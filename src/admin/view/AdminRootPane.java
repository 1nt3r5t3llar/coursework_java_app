package admin.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import view.HomeButton;

public class AdminRootPane extends VBox{
	
	private ModifyPane mp;
	private PromotionsPane pp; 
	private RewardsPane rp;
	private HomeButton hb;
	//private AdminMenuBar menuBar;

	public AdminRootPane() {
		
		this.setStyle("-fx-background-color: #415D78;");
		this.setPrefSize(1000, 500);
		
		mp = new ModifyPane();
		pp = new PromotionsPane();
		rp = new RewardsPane();
		hb = new HomeButton();
	//	menuBar = new AdminMenuBar();
		
		Label lb = new Label("Admin Home Page");
		lb.setFont(Font.font("Calibri", 36));
		lb.setTextFill(Color.WHITE);
		
		HBox box1 = new HBox();
		box1.getChildren().add(lb);
		box1.setSpacing(10);
		box1.setPadding(new Insets(30,10,20,10));
		box1.setAlignment(Pos.CENTER);

		VBox rootContainer = new VBox(mp, pp, rp, hb);
		//set styling for main container
		rootContainer.setPadding(new Insets(10,10,10,10));
		rootContainer.setSpacing(20);

		//add the menu bar and root container
		this.getChildren().addAll(box1, rootContainer);
	}
	
	/* These methods provide a public interface for the root pane and allow
	 * each of the sub-containers to be accessed by the controller.
	 */
	
	public ModifyPane getModifyPane() {
		return mp;
	}

	public PromotionsPane getPromotionsPane() {
		return pp;
	}

	public RewardsPane getRewardsPane() {
		return rp;
	}
	
	public HomeButton getHomeButton() {
		return hb;
	}
	
	//public AdminMenuBar getMenuBar() {
		//return menuBar;
	//}
	
}
