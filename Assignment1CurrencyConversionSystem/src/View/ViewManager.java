package View;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewManager {

    public static Stage stage;
    public static Scene loginScene;
    public static Scene conversionScene;

    private ViewManager() {
    }

    public static void openLoginPage() throws IOException {
        if (loginScene == null) {
            Parent root = FXMLLoader.load(ViewManager.class.getResource("/View/LoginPage.fxml"));
            loginScene = new Scene(root);
            stage.setScene(loginScene);
            stage.setTitle("login");
            stage.show();
        } else {
            stage.setScene(loginScene);
            stage.show();
        }

    }

    public static void openConversionPage() throws IOException {
        if (conversionScene == null) {
            Parent root = FXMLLoader.load(ViewManager.class.getResource("/View/CurrencyConversionSystem.fxml"));
            conversionScene = new Scene(root);
            stage.setScene(conversionScene);
            stage.setTitle("Currency Conversion System");
            stage.show();
        } else {
            stage.setScene(conversionScene);
            stage.show();
        }
    }

    public static void closeLoginPage() {
        if (loginScene != null) {
            stage.close();
        }
    }

    public static void closeConversionPage() {
        if (conversionScene != null) {
            stage.close();
        }
    }

}
