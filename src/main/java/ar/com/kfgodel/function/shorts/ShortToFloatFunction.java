package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToFloatFunction extends Function<Short, Float> {

  float apply(short input);

  @Override
  default Float apply(Short input){
    return apply(input.shortValue());
  }
}
