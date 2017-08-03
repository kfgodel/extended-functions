package ar.com.kfgodel.function.longs;

import java.util.function.Function;
import java.util.function.LongUnaryOperator;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToLongFunction extends Function<Long, Long>, LongUnaryOperator {

  long apply(long input);

  @Override
  default Long apply(Long input){
    return apply(input.longValue());
  }

  @Override
  default long applyAsLong(long operand) {
    return apply(operand);
  }
}
