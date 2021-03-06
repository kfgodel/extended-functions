package ar.com.kfgodel.function.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToIntFunction extends Function<Byte, Integer> {

  int apply(byte input);

  @Override
  default Integer apply(Byte input){
    return apply(input.byteValue());
  }
}
