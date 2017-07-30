package ar.com.kfgodel.function.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToDoubleFunction extends Function<Boolean, Double> {

  double apply(boolean input);

  @Override
  default Double apply(Boolean input){
    return apply(input.booleanValue());
  }
}
