package ar.com.kfgodel.function.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToIntFunction extends Function<Long, Integer>, java.util.function.LongToIntFunction {

  int apply(long input);

  @Override
  default Integer apply(Long input){
    return apply(input.longValue());
  }

  @Override
  default int applyAsInt(long value) {
    return apply(value);
  }
}
