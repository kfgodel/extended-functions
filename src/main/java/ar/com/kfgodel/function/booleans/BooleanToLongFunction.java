package ar.com.kfgodel.function.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToLongFunction extends Function<Boolean, Long> {

  long apply(boolean input);

  @Override
  default Long apply(Boolean input){
    return apply(input.booleanValue());
  }
}
