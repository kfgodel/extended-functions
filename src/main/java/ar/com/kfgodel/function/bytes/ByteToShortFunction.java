package ar.com.kfgodel.function.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToShortFunction extends Function<Byte, Short> {

  short apply(byte input);

  @Override
  default Short apply(Byte input){
    return apply(input.byteValue());
  }
}
