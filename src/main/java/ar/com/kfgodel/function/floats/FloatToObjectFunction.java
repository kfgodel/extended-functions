package ar.com.kfgodel.function.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToObjectFunction<T> extends Function<Float, T> {

  T apply(float input);

  @Override
  default T apply(Float input){
    return apply(input.floatValue());
  }
}
