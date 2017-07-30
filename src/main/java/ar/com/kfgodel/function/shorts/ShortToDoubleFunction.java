package ar.com.kfgodel.function.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToDoubleFunction extends Function<Short, Double> {

  double apply(short input);

  @Override
  default Double apply(Short input){
    return apply(input.shortValue());
  }
}
