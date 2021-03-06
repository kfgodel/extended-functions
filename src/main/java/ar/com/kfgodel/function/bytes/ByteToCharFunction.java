package ar.com.kfgodel.function.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToCharFunction extends Function<Byte, Character> {

  char apply(byte input);

  @Override
  default Character apply(Byte input){
    return apply(input.byteValue());
  }
}
