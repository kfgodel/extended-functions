package ar.com.kfgodel.function.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToByteFunction extends Function<Byte, Byte> {

  byte apply(byte input);

  @Override
  default Byte apply(Byte input){
    return apply(input.byteValue());
  }
}
