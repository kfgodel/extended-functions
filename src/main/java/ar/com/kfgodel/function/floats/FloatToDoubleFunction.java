package ar.com.kfgodel.function.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToDoubleFunction extends Function<Float, Double> {

  double apply(float input);

  @Override
  default Double apply(Float input){
    return apply(input.floatValue());
  }
}
