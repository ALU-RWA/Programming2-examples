package w8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TicTacToe extends Application{
    static int turn = 0;

    public static void main(String[] args){
        launch(args);
    }

    // Helper methods to avoid this getting too messy:
    // This first method takes 3 buttons, and returns true if they describe a winning position
    // This means that all buttons are equal and not empty.
    public static boolean checkButtons(Button b1, Button b2, Button b3){
        return (!b1.getText().equals("")
                && b1.getText().equals(b2.getText())
                && b1.getText().equals(b3.getText()));
    }

    // This method takes the 2d array containing the buttons, and checks all 8 winning configurations
    // Return "" if no one has won yet, and the value that won otherwise, X or O.
    public static boolean checkVictory(Button[][] buttons){
        // Check rows
        for (int i = 0; i < 3; i++){
            // If the 3 buttons in the column represent a win, return the text of one of them.
            if (checkButtons(buttons[i][0], buttons[i][1], buttons[i][2])){
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++){
            if (checkButtons(buttons[0][i], buttons[1][i], buttons[2][i])){
                return true;
            }
        }
        // Check downwards diagonal
        if (checkButtons(buttons[0][0], buttons[1][1], buttons[2][2])){
            return true;
        }
        // Check upward diagonal
        if (checkButtons(buttons[0][2], buttons[1][1], buttons[2][0])){
            return true;
        }

        return false;
    }

    public void start(Stage primaryStage){
        Button[][] buttons = {{new Button(), new Button(), new Button()},
                {new Button(), new Button(), new Button()},
                {new Button(), new Button(), new Button()}};


        // From the form tutorial:
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(5);


        Text gameResult = new Text();
        grid.add(gameResult, 0, 4, 3, 1);

        // Also from the form tutorial, we set up the reset button at the bottom right of the screen.
        Button reset = new Button("Reset");
        HBox resetContainer = new HBox(10);
        resetContainer.setAlignment(Pos.BOTTOM_RIGHT);
        resetContainer.getChildren().add(reset);

        grid.add(resetContainer,0, 5,3,1 );

        // Place and set handlers for all the buttons
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                Button btn = buttons[i][j];

                btn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        // Prevent the user from changing a button that's already set.
                        if (!btn.getText().equals("")){
                            System.out.println("Don't cheat! can't change buttons that are already set.");
                            return;
                        }

                        // If we are setting a new button, check if the turn is even or odd
                        if (turn % 2 == 0){
                            btn.setText("X");
                        } else {
                            btn.setText("O");
                        }

                        // After this button has been set, check if we have a winner
                        // If we have a winner, set the text of gameResult
                        if (checkVictory(buttons)){
                            if (turn % 2 == 0){
                                gameResult.setText("X player has won!");
                            } else {
                                gameResult.setText("O player has won!");
                            }
                        }

                        // Don't forget to increase turn.
                        turn++;

                    }
                });

                // Add the button to the grid, it shares the same coordinates as in the Buttons nested array.
                grid.add(btn, i, j);
            }
        }

        // What should the reset button do?
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        buttons[i][j].setText("");
                    }
                }
                turn = 0;
                gameResult.setText("");
            }
        });

        primaryStage.setScene(new Scene(grid, 400, 400));
        primaryStage.show();
    }
}
