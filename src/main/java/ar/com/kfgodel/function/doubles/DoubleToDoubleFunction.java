package ar.com.kfgodel.function.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToDoubleFunction extends Function<Double, Double> {

  double apply(double input);

  @Override
  default Double apply(Double input){
    return apply(input.doubleValue());
  }
}
