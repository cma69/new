import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class calc extends Application {
    TextField textField = new TextField();
    TextField textField2 = new TextField();
    Label label = new Label(" 0.0");
    Button buttonsum = new Button("SUM");
    Button buttonproduct = new Button("PRODUCT");
    Button buttonFactorial = new Button("FACTORIAL");
    Button buttonAverage = new Button("AVERAGE");

    @Override

    public void start(Stage primaryStage) throws Exception {
        FlowPane flow = new FlowPane();
        flow.getChildren().addAll(label, textField, textField2, buttonsum,buttonproduct,buttonAverage,buttonFactorial);

        buttonsum.setOnAction( event -> {
            double result = Double.parseDouble(textField.getText()) + Double.parseDouble(textField2.getText());
            DecimalFormat format = new DecimalFormat("#### . 00");
            label.setText(format.format(result));

        });
        buttonproduct.setOnAction(event -> {
            double result = Double.parseDouble(textField.getText()) * Double.parseDouble(textField2.getText());
            DecimalFormat format = new DecimalFormat("#### . 00");
            label.setText(format.format(result));
        });
        buttonAverage.setOnAction(event -> {
            double[] x = {Double.parseDouble(textField.getText()), Double.parseDouble(textField2.getText())};
            DecimalFormat format = new DecimalFormat("#### . 00");
            label.setText(format.format(cacl2.findAverage(x)));


        });
        buttonFactorial.setOnAction(event -> {
            double [] x= {Double.parseDouble(textField.getText()) , Double.parseDouble(textField2.getText())};
            String result = "";
            result += cacl2.factorial((int)x[0]) +"\t";
            result += cacl2.factorial((int)x[1]) +"\t";
            label.setText(result);

        });


        Scene scene=new Scene(flow);

        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String [] args) { launch(args);}
}

