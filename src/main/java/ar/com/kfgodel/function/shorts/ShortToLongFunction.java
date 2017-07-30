package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToLongFunction extends Function<Short, Long> {

  long apply(short input);

  @Override
  default Long apply(Short input){
    return apply(input.shortValue());
  }
}
