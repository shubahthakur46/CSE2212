package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	private Button btn[] = new Button[10];
	private Button btnExt[] = new Button[10];
	
	@Override
	public void start(Stage primaryStage) {
		try {
			TextArea txt = new TextArea();
			txt.setMaxSize(270, 100);
			txt.relocate(10, 10);
			
			btn[7] = new Button("7");
			btn[7].relocate(10, 150);
			btn[7].setMinSize(60, 40);
			
			btn[8] = new Button("8");
			btn[8].relocate(80, 150);
			btn[8].setMinSize(60, 40);
			
			btn[9] = new Button("9");
			btn[9].relocate(150, 150);
			btn[9].setMinSize(60, 40);
			
			btnExt[0] = new Button("/");
			btnExt[0].relocate(220, 150);
			btnExt[0].setMinSize(60, 40);
			

			btn[4] = new Button("4");
			btn[4].relocate(10, 200);
			btn[4].setMinSize(60, 40);
			
			btn[5] = new Button("5");
			btn[5].relocate(80, 200);
			btn[5].setMinSize(60, 40);
			
			btn[6] = new Button("6");
			btn[6].relocate(150, 200);
			btn[6].setMinSize(60, 40);
			
			btnExt[1] = new Button("*");
			btnExt[1].relocate(220, 200);
			btnExt[1].setMinSize(60, 40);
			
			btn[1] = new Button("1");
			btn[1].relocate(10, 250);
			btn[1].setMinSize(60, 40);
			
			btn[2] = new Button("2");
			btn[2].relocate(80, 250);
			btn[2].setMinSize(60, 40);
			
			btn[3] = new Button("3");
			btn[3].relocate(150, 250);
			btn[3].setMinSize(60, 40);
			
			btnExt[2] = new Button("-");
			btnExt[2].relocate(220, 250);
			btnExt[2].setMinSize(60, 40);
			
			btn[0] = new Button("0");
			btn[0].relocate(80, 300);
			btn[0].setMinSize(60, 40);
			
			btnExt[3] = new Button("+");
			btnExt[3].relocate(220, 300);
			btnExt[3].setMinSize(60, 40);
			
			btnExt[4] = new Button(".");
			btnExt[4].relocate(10, 300);
			btnExt[4].setMinSize(60, 40);
			
			btnExt[5] = new Button("=");
			btnExt[5].relocate(150, 300);
			btnExt[5].setMinSize(60, 40);
			
			Pane root = new Pane();
			
			root.setStyle("-fx-background-color: blue, lightgray;");
			root.setStyle("-fx-background-insets: 0, 4;");
			root.setStyle("-fx-background-radius: 4, 2;");		
			
			root.setPrefSize(290, 400);
			root.getChildren().addAll(
					
					btn[0], btn[1], btn[2], btn[3], btn[4], btn[5], btn[6], btn[7], btn[8], btn[9],
					btnExt[0], btnExt[1], btnExt[2], btnExt[3], btnExt[4], btnExt[5], txt
			);
			Scene scene = new Scene(root,290,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
