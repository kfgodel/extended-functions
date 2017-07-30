package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToCharFunction extends Function<Short, Character> {

  char apply(short input);

  @Override
  default Character apply(Short input){
    return apply(input.shortValue());
  }
}
