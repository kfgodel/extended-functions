package ar.com.kfgodel.function.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToDoubleFunction extends Function<Byte, Double> {

  double apply(byte input);

  @Override
  default Double apply(Byte input){
    return apply(input.byteValue());
  }
}
