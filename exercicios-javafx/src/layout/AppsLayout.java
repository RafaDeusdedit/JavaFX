package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppsLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent raiz = null;
/*		raiz = new TesteAnchorPane();
		raiz = new TesteBorderPane();
		raiz = new TesteFlowPane();
		raiz = new TesteGridPane();
		raiz = new TesteStackPane();*/
		raiz = new TesteTilePane();
		
		//Scene principal = new Scene(new TesteAnchorPane(), 800, 600);
		Scene principal = new Scene(raiz, 800, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciador de Layout");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
