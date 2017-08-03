package ar.com.kfgodel.function.ints;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToIntFunction extends Function<Integer, Integer>, IntUnaryOperator {

  int apply(int input);

  @Override
  default Integer apply(Integer input){
    return apply(input.intValue());
  }

  @Override
  default int applyAsInt(int operand) {
    return apply(operand);
  }
}
