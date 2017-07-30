package ar.com.kfgodel.function.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToFloatFunction extends Function<Byte, Float> {

  float apply(byte input);

  @Override
  default Float apply(Byte input){
    return apply(input.byteValue());
  }
}
