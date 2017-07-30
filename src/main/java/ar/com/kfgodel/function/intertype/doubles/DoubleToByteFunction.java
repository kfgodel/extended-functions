package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToByteFunction extends Function<Double, Byte> {

  byte apply(double input);

  @Override
  default Byte apply(Double input){
    return apply(input.doubleValue());
  }
}
