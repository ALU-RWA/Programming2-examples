package w9.panedemos;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class DialogPaneDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {



        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle("Informing");
        alert.setHeaderText("Information Alert");
        alert.setContentText("We are informing that This is an information alert");
        alert.show();



//        primaryStage.setScene(new Scene(, 300, 250));
        primaryStage.show();


    }
}


