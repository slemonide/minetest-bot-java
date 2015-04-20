package com.markmc.minetest;

import java.nio.ByteBuffer;

/**
 *
 * @author markmc
 */
public abstract class AbstractCommandHandler implements CommandHandler{

  public abstract String getName();

  public void run(final ByteBuffer data) {
    // do nothing
  }

}
