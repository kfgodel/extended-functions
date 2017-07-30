package ar.com.kfgodel.function.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToFloatFunction extends Function<Float, Float> {

  float apply(float input);

  @Override
  default Float apply(Float input){
    return apply(input.floatValue());
  }
}
