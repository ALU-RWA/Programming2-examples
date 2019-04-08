package w9.panedemos;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.text.Text;


public class TextFlowDemo extends Application{

    public void start(Stage stage) throws Exception{
        Text text1 = new Text("Hey, we are group 7");

        //Setting font to the text
        text1.setFont(new Font(20));

        //Setting color to the text
        text1.setFill(Color.BLUE);

        Text text2 = new Text("\n We are presenting to you the Textflow class of JavaFx. ");

        //Setting font to the text
        text2.setFont(new Font(20));

        //Setting color to the text
        text2.setFill(Color.DARKGOLDENROD);
        Text text3 = new Text("\n TextFlow class is designed to lay out rich text. It can be used to layout several Text nodes in a single text flow. It also extends Pane class ");

        //Setting font to the text
        Font font3 = new Font(15);
        text3.setFont(font3);

        //Setting color to the text
        text3.setFill(Color.BLACK);

        Text text4 = new Text("Hope you enjoy.");

        //Setting font to the text
        text4.setFont(new Font(15));
        text4.setFill(Color.MEDIUMVIOLETRED);

        //Creating the text flow plane
        TextFlow textFlowPane = new TextFlow();

        //Setting the line spacing between the text objects
        textFlowPane.setTextAlignment(TextAlignment.LEFT);

        //Setting the width
        textFlowPane.setPrefSize(600, 300);

        //Setting the line spacing
        textFlowPane.setLineSpacing(5.0);

        //Retrieving the observable list of the TextFlow Pane
        ObservableList list = textFlowPane.getChildren();

        //Adding cylinder to the pane
        list.addAll(text1, text2, text3, text4);

        //Creating a scene object
        Scene scene = new Scene(textFlowPane);

        //Setting title to the Stage
        stage.setTitle("text Flow Pane Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
