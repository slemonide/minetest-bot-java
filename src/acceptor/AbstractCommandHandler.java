package acceptor;

import java.nio.ByteBuffer;

/**
 * AbstractCommandHandler.
 * <p>
 * @author markmc
 */
public abstract class AbstractCommandHandler implements CommandHandler {

  /**
   * getName.
   * <p>
   * @return name of the command that this CommandHandler processes
   */
  public abstract String getName();

  /**
   * process. Method that processes the data returned by this command.
   * <p>
   * @param data ByteBuffer
   */
  public void process(final ByteBuffer data) {
    // do nothing
  }

}

