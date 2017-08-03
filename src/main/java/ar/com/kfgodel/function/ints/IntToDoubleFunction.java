package ar.com.kfgodel.function.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToDoubleFunction extends Function<Integer, Double>, java.util.function.IntToDoubleFunction {

  double apply(int input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }

  @Override
  default double applyAsDouble(int value){
   return this.apply(value);
  }
}
