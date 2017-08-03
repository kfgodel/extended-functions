package ar.com.kfgodel.function.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToIntFunction extends Function<Double, Integer>, java.util.function.DoubleToIntFunction {

  int apply(double input);

  @Override
  default Integer apply(Double input){
    return apply(input.doubleValue());
  }

  @Override
  default int applyAsInt(double value) {
    return apply(value);
  }
}
