/*
    Daniel Fryer
    Assignment Mod 1 Java FX to show 4 Random Cards
    6/6/2026
*/

// Import the javaFx classes
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import  java.util.Random;

public class Fryer_mod1_CSD420 extends Application
{
    // Create the 4 card Imageviews
    private ImageView card1 = new ImageView();
    private ImageView card2 = new ImageView();
    private ImageView card3 = new ImageView();
    private ImageView card4 = new ImageView();

    @Override
    public void start(Stage primaryStage)
    {
        // set the card widths
        card1.setFitWidth(200);
        card2.setFitWidth(200);
        card3.setFitWidth(200);
        card4.setFitWidth(200);

        // set the card heights
        card1.setFitHeight(300);
        card2.setFitHeight(300);
        card3.setFitHeight(300);
        card4.setFitHeight(300);

        // create the Hbox to display the 4 cards and button
        HBox cardPane = new HBox(10, card1, card2, card3, card4);
        cardPane.setAlignment(Pos.CENTER);

        // Create the button to call the refresh 
        Button refresh = new Button("Refresh");
        // use of the lamba expression
        refresh.setOnAction(e -> displayCards());

        HBox buttonPane = new HBox(refresh);
        buttonPane.setAlignment(Pos.CENTER);

        // create a border pane to hold the Hboxs
        BorderPane root = new BorderPane();
        root.setCenter(cardPane);
        root.setBottom(buttonPane);

        // initially call the displayCards to show the first 4 cards
        displayCards();

        // create the scene
        Scene scene = new Scene(root, 1000, 500);
        primaryStage.setTitle("Get and Show Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayCards()
    {
        Random rand = new Random();

        // randomly select a number between 1 and 54.  Using 2 jokers + 52 standard cards
        int c1 = rand.nextInt(54) + 1;
        int c2 = rand.nextInt(54) + 1;
        int c3 = rand.nextInt(54) + 1;
        int c4 = rand.nextInt(54) + 1;

        // set the images from the cards directory based on the 4 random numbers 
        card1.setImage(new Image("file:cards/" + c1 + ".png"));
        card2.setImage(new Image("file:cards/" + c2 + ".png"));
        card3.setImage(new Image("file:cards/" + c3 + ".png"));
        card4.setImage(new Image("file:cards/" + c4 + ".png"));
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
