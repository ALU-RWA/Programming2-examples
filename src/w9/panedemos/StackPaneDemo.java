package w9.panedemos;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import javafx.geometry.Point3D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPaneDemo extends Application {
    @Override
    public void start(Stage stage) {
        //Drawing a Circle
        Circle circle = new Circle(300, 135, 100);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.GREEN);

        //Drawing Sphere
        //Set sphere colors
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.ORANGE);
        material.setSpecularColor(Color.YELLOW);
        Sphere sphere = new Sphere(150);
        sphere.setMaterial(material);

        //Creating a text
        Text text = new Text("This is the programming class");

        //Setting the font of the text
        text.setFont(Font.font(null, FontWeight.BOLD, 15));

        //Setting the color of the text
        text.setFill(Color.RED);

        //setting the position of the text
        text.setX(20);
        text.setY(50);

        //Creating a Stackpane
        StackPane stackPane = new StackPane();

        //Setting the margin for the circle
        stackPane.setMargin(circle, new Insets(50, 50, 50, 50));

        //Retrieving the observable list of the Stack Pane
        ObservableList list = stackPane.getChildren();

        //Adding all the nodes to the pane
        list.addAll(sphere, circle, text);

        //Creating a scene object
        Scene scene = new Scene(stackPane);

        //Setting title to the Stage
        stage.setTitle("Stack Pane Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
