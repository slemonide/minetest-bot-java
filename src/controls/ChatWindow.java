package controls;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * Controller class for the chat_window.fxml
 */
public class ChatWindow {
    public TextArea messages;
    public TextField input;

    public ChatWindow() {
        ChatManager.getInstance().registerController(this);
    }

    public void sendMessage(ActionEvent actionEvent) {
        sendMessage();
    }

    public void maybeSendMessage(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            sendMessage();
        }
    }

    private void sendMessage() {
        messages.appendText(input.getText() + "\n");
        input.clear();
    }

    public void appendMessage(String process) {
        messages.appendText(process + "\n");
    }
}
