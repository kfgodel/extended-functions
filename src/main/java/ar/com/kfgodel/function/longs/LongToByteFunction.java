package ar.com.kfgodel.function.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToByteFunction extends Function<Long, Byte> {

  byte apply(long input);

  @Override
  default Byte apply(Long input){
    return apply(input.longValue());
  }
}
