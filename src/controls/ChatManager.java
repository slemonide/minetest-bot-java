package controls;

/**
 *
 */
public class ChatManager {
    private static ChatManager instance;
    private ChatWindow controller;

    public static ChatManager getInstance() {
        if (instance == null){
            instance = new ChatManager();
        }
        return instance;
    }

    public void registerController(ChatWindow controller) {
        this.controller = controller;
    }

    public ChatWindow getController() {
        return controller;
    }
}
