import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;


public class FlowPane_0 extends Application {

    // launch the application
    public void start(Stage stage)
    {

        try {

            // set title for the stage
            stage.setTitle("FlowPane");

            // create a labels
            Label label = new Label("this is FlowPane example");
            Label label1 = new Label("label no 1");
            Label label2 = new Label("label no 2");
            Label label3 = new Label("label no 3");
            Label label4 = new Label("label no 4");

            // create a FlowPane
            FlowPane flow_pane = new FlowPane(20.0, 20.0, label, label1,
                                                label2, label3, label4);

            // create a scene
            Scene scene = new Scene(flow_pane, 400, 300);

            // set the scene
            stage.setScene(scene);

            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {

        // launch the application
        launch(args);
    }
}

