import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ExamUI extends Application {
    public void start(Stage stage) {
        Label q = new Label("Java is?");
        RadioButton r1 = new RadioButton("Language");
        RadioButton r2 = new RadioButton("OS");

        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);

        Button next = new Button("Next");

        next.setOnAction(e -> {
            if (tg.getSelectedToggle() == null)
                System.out.println("Select an option");
            else
                System.out.println("Answer saved");
        });

        VBox root = new VBox(10, q, r1, r2, next);
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
