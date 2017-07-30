package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToCharFunction extends Function<Double, Character> {

  char apply(double input);

  @Override
  default Character apply(Double input){
    return apply(input.doubleValue());
  }
}
