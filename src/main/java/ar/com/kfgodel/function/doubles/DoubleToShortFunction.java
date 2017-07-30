package ar.com.kfgodel.function.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToShortFunction extends Function<Double, Short> {

  short apply(double input);

  @Override
  default Short apply(Double input){
    return apply(input.doubleValue());
  }
}
