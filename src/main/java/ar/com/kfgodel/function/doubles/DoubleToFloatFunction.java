package ar.com.kfgodel.function.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToFloatFunction extends Function<Double, Float> {

  float apply(double input);

  @Override
  default Float apply(Double input){
    return apply(input.doubleValue());
  }
}
