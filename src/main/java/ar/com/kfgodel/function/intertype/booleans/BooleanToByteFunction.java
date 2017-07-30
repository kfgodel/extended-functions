package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToByteFunction extends Function<Boolean, Byte> {

  byte apply(boolean input);

  @Override
  default Byte apply(Boolean input){
    return apply(input.booleanValue());
  }
}
