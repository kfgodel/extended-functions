package ar.com.kfgodel.function.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToCharFunction extends Function<Boolean, Character> {

  char apply(boolean input);

  @Override
  default Character apply(Boolean input){
    return apply(input.booleanValue());
  }
}
