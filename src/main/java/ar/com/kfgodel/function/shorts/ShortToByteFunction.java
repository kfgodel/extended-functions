package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToByteFunction extends Function<Short, Byte> {

  byte apply(short input);

  @Override
  default Byte apply(Short input){
    return apply(input.shortValue());
  }
}
