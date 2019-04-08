package w9.panedemos;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneDemo extends Application {
    @Override
    public void start(Stage stage) {
        //Creating an array of Buttons
        Button[] buttons = new Button[] {
                new Button("1"),
                new Button("2"),
                new Button("3"),
                new Button("4"),
                new Button("5"),
                new Button("6"),
                new Button("7")
        };
        //Creating a Tile Pane
        TilePane tilePane = new TilePane();

        //Setting the orientation for the Tile Pane
        tilePane.setOrientation(Orientation.HORIZONTAL);

        //Setting the alignment for the Tile Pane
        tilePane.setTileAlignment(Pos.CENTER_LEFT);

        //Setting the preferred columns for the Tile Pane
//        tilePane.setPrefRows(2);
        tilePane.setPrefColumns(2);
        tilePane.setHgap(10);
        tilePane.setVgap(10);

        //Retrieving the observable list of the Tile Pane
        ObservableList list = tilePane.getChildren();

        //Adding the array of buttons to the pane
        list.addAll(buttons);


        //Creating a scene object
        Scene scene = new Scene(tilePane);

        //Setting title to the Stage
        stage.setTitle("Tile Pane Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
