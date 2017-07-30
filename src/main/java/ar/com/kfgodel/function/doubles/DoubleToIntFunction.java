package ar.com.kfgodel.function.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToIntFunction extends Function<Double, Integer> {

  int apply(double input);

  @Override
  default Integer apply(Double input){
    return apply(input.doubleValue());
  }
}
