package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToShortFunction extends Function<Short, Short> {

  short apply(short input);

  @Override
  default Short apply(Short input){
    return apply(input.shortValue());
  }
}
