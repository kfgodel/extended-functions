package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToLongFunction extends Function<Byte, Long> {

  long apply(byte input);

  @Override
  default Long apply(Byte input){
    return apply(input.byteValue());
  }
}
