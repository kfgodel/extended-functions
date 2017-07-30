package ar.com.kfgodel.function.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToObjectFunction<T> extends Function<Boolean, T> {

  T apply(boolean input);

  @Override
  default T apply(Boolean input){
    return apply(input.booleanValue());
  }
}
