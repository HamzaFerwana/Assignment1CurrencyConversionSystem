
package Main;

import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;


public class MainApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {  
        ViewManager.stage = stage;
        ViewManager.openLoginPage();
        
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
