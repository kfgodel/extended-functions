package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToShortFunction extends Function<Float, Short> {

  short apply(float input);

  @Override
  default Short apply(Float input){
    return apply(input.floatValue());
  }
}
