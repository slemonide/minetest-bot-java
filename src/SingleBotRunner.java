import bot.BotRunnable;

/**
 * SingleBotRunner.
 *
 * @author markmc
 */
public class SingleBotRunner {
    public static void main(final String[] args) {
        String serverIp = "shame.ddns.net";

        BotRunnable botRunnable = new BotRunnable(serverIp, "bot-1");
        Thread botThread = new Thread(botRunnable);
        botThread.start();
    }
}
