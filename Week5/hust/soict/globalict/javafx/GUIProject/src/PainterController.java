import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton drawRadioButton;

    @FXML
    private RadioButton eraseRadioButton;

    private ToggleGroup toggleGroup;

    @FXML
    void initialize() {
        toggleGroup = new ToggleGroup();
        drawRadioButton.setToggleGroup(toggleGroup);
        eraseRadioButton.setToggleGroup(toggleGroup);

        // Set the default selection to draw mode
        drawRadioButton.setSelected(true);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        // Implement clearing of canvas here
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (drawRadioButton.isSelected()) {
            // Implement drawing here
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        } else if (eraseRadioButton.isSelected()) {
            // Implement erasing here
            Rectangle eraserRect = new Rectangle(event.getX() - 10, event.getY() - 10, 20, 20);
            eraserRect.setFill(drawingAreaPane.getBackground().getFills().get(0).getFill());
            drawingAreaPane.getChildren().add(eraserRect);
        }
    }

    @FXML
    void toggleDrawingMode(ActionEvent event) {
        if (drawRadioButton.isSelected()) {
            drawingAreaPane.setStyle("-fx-background-color: white;");
        } else if (eraseRadioButton.isSelected()) {
            drawingAreaPane.setStyle("-fx-background-color: lightgray;");
        }
    }
}
