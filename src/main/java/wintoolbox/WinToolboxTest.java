package wintoolbox;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

public class WinToolboxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Slider slider=new Slider();

        Group group=new Group(slider);
        Scene scene=new Scene(group,800,600);
        slider.setMin(0.0d);
        slider.setMax(1.0d);
        double curVolume = WinToolbox.GetCurVolume(true);
        System.out.println("curVolume:"+curVolume);
        slider.setValue(curVolume);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double v=newValue.doubleValue();
                System.out.println(v);
                WinToolbox.ChangeVolume(v,true);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
