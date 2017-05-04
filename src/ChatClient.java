import bot.BotRunnable;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * A javaFX-based chat client for minetest
 */
public class ChatClient extends Application {
    private static final String SERVER_IP = "shame.ddns.net";
    private static final String BOT_NAME = "bot-1";
    private Thread botThread;

    public static void main(String[] args) {
        Application.launch(ChatClient.class, args);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("controls/chat_window.fxml"));

        stage.setTitle("minetest chat client");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
        stage.setMaximized(true);

        BotRunnable botRunnable = new BotRunnable(SERVER_IP, BOT_NAME);
        botThread = new Thread(botRunnable);
        botThread.start();

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent e) {
                Platform.exit();
                System.exit(0);
            }
        });
    }
}
