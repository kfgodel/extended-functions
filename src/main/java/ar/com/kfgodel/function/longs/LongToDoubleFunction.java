package ar.com.kfgodel.function.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToDoubleFunction extends Function<Long, Double> {

  double apply(long input);

  @Override
  default Double apply(Long input){
    return apply(input.longValue());
  }
}
