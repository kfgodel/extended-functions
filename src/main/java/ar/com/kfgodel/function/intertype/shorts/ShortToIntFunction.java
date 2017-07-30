package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToIntFunction extends Function<Short, Integer> {

  int apply(short input);

  @Override
  default Integer apply(Short input){
    return apply(input.shortValue());
  }
}
