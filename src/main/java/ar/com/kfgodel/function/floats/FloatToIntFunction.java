package ar.com.kfgodel.function.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToIntFunction extends Function<Float, Integer> {

  int apply(float input);

  @Override
  default Integer apply(Float input){
    return apply(input.floatValue());
  }
}
