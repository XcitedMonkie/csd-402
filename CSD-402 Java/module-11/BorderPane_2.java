import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;


public class BorderPane_2 extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("BorderPane");

        Label center = new Label("this is BorderPane center");
        Label top = new Label("this is BorderPane top");
        Label bottom = new Label("this is BorderPane bottom");
        Label left = new Label("this is BorderPane left");
        Label right = new Label("this is BorderPane right");

        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(center);
        borderPane.setTop(top);
        borderPane.setBottom(bottom);
        borderPane.setLeft(left);
        borderPane.setRight(right);

        BorderPane.setAlignment(top, Pos.CENTER);
        BorderPane.setAlignment(bottom, Pos.CENTER);
        BorderPane.setAlignment(left, Pos.CENTER);
        BorderPane.setAlignment(right, Pos.CENTER);

        Scene scene = new Scene(borderPane, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}