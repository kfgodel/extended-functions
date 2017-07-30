package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToObjectFunction<T> extends Function<Byte, T> {

  T apply(byte input);

  @Override
  default T apply(Byte input){
    return apply(input.byteValue());
  }
}
