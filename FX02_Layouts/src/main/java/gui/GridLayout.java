package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.security.SecureRandom;

public class GridLayout extends GridPane {

    public GridLayout() {
        // dit is handig voor debugging - niet vergeten af te zetten!
        setGridLinesVisible(true);
        // via constraints kunnen we de breedte van de kolommen instellen
        ColumnConstraints col = new ColumnConstraints();
        col.setPercentWidth(10);
        for (int i = 0; i < 10; i++) {
            this.getColumnConstraints().add(col);
        }
        RowConstraints row = new RowConstraints();
        row.setPercentHeight(20);
        for (int i = 0; i < 5; i++) {
            this.getRowConstraints().add(row);
        }
        this.setHgap(5);
        this.setVgap(5);
        this.setPadding(new Insets(5));
        placeButtons();
        placeImage();
        colorAndNumberSomeCells();
    }

    private void colorAndNumberSomeCells() {
        SecureRandom sr = new SecureRandom();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int r = sr.nextInt(0, 256);
                int g = sr.nextInt(0, 256);
                int b = sr.nextInt(0, 256);
                // gebruik een Pane om de achtergrondkleur van de cellen in te stellen
                Pane coloredCell = new Pane();
                coloredCell.setBackground(new Background(new BackgroundFill(Color.rgb(r, g, b, 0.5), null, null)));
                Label l = new Label(String.format("%d - %d", j, i));
                l.setPadding(new Insets(3));
                coloredCell.getChildren().add(l);
                add(coloredCell, j, i);
            }
        }

    }

    private void placeButtons() {
        Button btn = makeButtonThatGrows("col 6 - row 0\ncolspan 3\nrowspan 2");
        add(btn, 6, 0, 3, 2);

        btn = makeButtonThatGrows("5/2\n1/3");
        add(btn, 5, 2, 1, 3);

    }

    private void placeImage() {
        Image imgWelkom = new Image(getClass().getResourceAsStream("/images/corn.jpg"));
        ImageView iv = new ImageView(imgWelkom);
        // schalen van de afbeelding
        iv.fitWidthProperty().bind(widthProperty().divide(2));
        iv.fitHeightProperty().bind(heightProperty().divide(2));
        iv.setPreserveRatio(true);
        // wrap ImageView in een StackPane om het makkelijk te centreren
        StackPane stackPane = new StackPane(iv);
        add(stackPane, 6, 2, 4, 4);
    }

    private Button makeButtonThatGrows(String text) {
        Button btn = new Button(text);
        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        return btn;
    }

}
