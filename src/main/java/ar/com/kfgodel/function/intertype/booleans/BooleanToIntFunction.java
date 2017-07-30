package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToIntFunction extends Function<Boolean, Integer> {

  int apply(boolean input);

  @Override
  default Integer apply(Boolean input){
    return apply(input.booleanValue());
  }
}
