package ar.com.kfgodel.function.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToLongFunction extends Function<Double, Long>, java.util.function.DoubleToLongFunction {

  long apply(double input);

  @Override
  default Long apply(Double input){
    return apply(input.doubleValue());
  }

  @Override
  default long applyAsLong(double value) {
    return apply(value);
  }
}
