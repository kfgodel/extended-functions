package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToByteFunction extends Function<Float, Byte> {

  byte apply(float input);

  @Override
  default Byte apply(Float input){
    return apply(input.floatValue());
  }
}
