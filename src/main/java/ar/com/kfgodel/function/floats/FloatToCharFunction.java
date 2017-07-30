package ar.com.kfgodel.function.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToCharFunction extends Function<Float, Character> {

  char apply(float input);

  @Override
  default Character apply(Float input){
    return apply(input.floatValue());
  }
}
