import cs3331.lab0.helper.HelloWorldFrame;
import javafx.application.Application;
import javafx.stage.Stage;
public class App extends Application{
    public void start(Stage stage)
    {
        //HelloWorldFrame f = new HelloWorldFrame(stage);
        new HelloWorldFrame(stage);
    }
    public static void main(String [] args)
    {
        System.out.println("Hello");
        launch(args);
    }
}